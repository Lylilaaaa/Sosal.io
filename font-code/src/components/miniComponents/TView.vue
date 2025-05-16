<template>
  <div class="token-list">
    <div v-for="(token, index) in tokenList" :key="index" class="token-item">
      <div>{{ token.name }} ({{ token.symbol }})</div>
      <div>价格: ${{ token.price }}</div>
      <div>涨跌: {{ token.change_24h }}%</div>
    </div>

    <div ref="loadTrigger" class="load-trigger" v-if="!isEnd">
      <p v-if="loading">加载中...</p>
      <p v-else>下拉加载更多</p>
    </div>
    <div v-else class="end-text">—— 没有更多数据了 ——</div>
  </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted } from 'vue';

// 假数据生成函数
function generateFakeTokens(start, count) {
  const tokens = [];
  for (let i = 0; i < count; i++) {
    tokens.push({
      name: 'Token ' + (start + i + 1),
      symbol: 'T' + (start + i + 1),
      price: (Math.random() * 1000).toFixed(2),
      change_24h: (Math.random() * 10 - 5).toFixed(2),
    });
  }
  return tokens;
}

// 响应式变量
const tokenList = ref([]);
const page = ref(0);
const pageSize = 5;
const loading = ref(false);
const isEnd = ref(false);

const loadTrigger = ref(null);
let observer = null;

async function loadMore() {
  if (loading.value || isEnd.value) return;
  loading.value = true;
  // 模拟异步加载
  await new Promise((resolve) => setTimeout(resolve, 800));
  const newTokens = generateFakeTokens(page.value * pageSize, pageSize);
  if (newTokens.length > 0) {
    tokenList.value.push(...newTokens);
    page.value++;
  } else {
    isEnd.value = true;
  }
  loading.value = false;
}

// 设置滚动触发器
onMounted(() => {
  observer = new IntersectionObserver(([entry]) => {
    if (entry.isIntersecting) {
      loadMore();
    }
  });
  if (loadTrigger.value) {
    observer.observe(loadTrigger.value);
  }
});

// 销毁 observer
onUnmounted(() => {
  if (observer && loadTrigger.value) {
    observer.unobserve(loadTrigger.value);
  }
});
</script>

<style scoped>
.token-list {
  max-width: 500px;
  margin: auto;
}
.token-item {
  border-bottom: 1px solid #ccc;
  padding: 10px;
}
.load-trigger {
  text-align: center;
  padding: 20px;
}
.end-text {
  text-align: center;
  color: #999;
  padding: 20px;
}
</style>
