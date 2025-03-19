<template>
  <div class="layout">
    <Nav class="nav" />
    <main class="main-content">
      <router-view />
      <!-- 这里加载 Home.vue，里面有三栏布局 -->
    </main>
  </div>
</template>

<script setup>
import Nav from '@/components/Nav.vue';
</script>

<style scoped>
.layout {
  display: flex;
  flex-direction: column;
  height: 100vh;
  background-color: #665f59; /* 新增布局背景色 */
}

.main-content {
  padding-top: 60px;
  height: calc(100vh - 60px); /* 修复高度计算 */
  flex: 1;
  overflow: auto; /* 允许滚动 */
  background: #242021; /* 修改为深色背景 */
}
</style>
