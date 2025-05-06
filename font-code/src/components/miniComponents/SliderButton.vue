<template>
  <div class="slider-container">
    <!-- 滑块 -->
    <input
      type="range"
      min="0"
      max="90"
      v-model="percentage"
      ref="sliderRef"
      class="custom-slider"
    />
    <div class="slider-number" :style="{ left: numberLeft + '%' }">{{ percentage }}%</div>
    <div class="number-info">
      <span>0%</span>
      <span>90%</span>
    </div>

    <!-- 数字显示，跟随滑块 -->
  </div>
</template>

<script setup>
import { ref, watch, computed, onMounted } from 'vue';

const percentage = ref(15); // 默认值
const sliderRef = ref(null);

const numberLeft = computed(() => {
  return (percentage.value / 90) * 100;
});

watch(percentage, (newVal) => {
  if (sliderRef.value) {
    sliderRef.value.style.setProperty('--percent', newVal / 90);
  }
});

onMounted(() => {
  if (sliderRef.value) {
    sliderRef.value.style.setProperty('--percent', percentage.value / 90);
  }
});
</script>

<style scoped>
.slider-container {
  position: relative;
  width: 100%;
}

.custom-slider {
  appearance: none;
  -webkit-appearance: none;
  width: 100%;
  height: 6px;
  border-radius: 3px;
  background: linear-gradient(
    to right,
    orange 0%,
    orange calc(var(--percent, 0) * 100%),
    #ddd calc(var(--percent, 0) * 100%),
    #ddd 100%
  );
  background-color: #181616;
  border: 0.4px solid #665f59;
  outline: none;
  position: relative;
  z-index: 1;
}

/* 左侧圆点用 ::before 伪元素 */
.custom-slider::before {
  content: '';
  position: absolute;
  top: 50%;
  left: 0;
  width: 8px;
  height: 8px;
  background: #b2a18f;
  border-radius: 50%;
  transform: translate(-50%, -50%);
  z-index: 2; /* 圆点位于轨道之上 */
}

/* 滑块按钮 */
.custom-slider::-webkit-slider-thumb {
  -webkit-appearance: none;
  appearance: none;
  width: 12px;
  height: 12px;
  background: #181616;
  border: 2px solid #b2a18f;
  border-radius: 50%;
  cursor: pointer;
  position: relative;
  z-index: 3; /* 滑块位于圆点之上 */
}

/* 数字显示 */
.slider-number {
  position: absolute;
  top: 22px;
  color: var(--sosal_Lighten2_665F59, #665f59);
  text-align: center;
  font-family: Inter;
  font-size: 7px;
  font-style: normal;
  font-weight: 300;
  line-height: 7px;
  text-transform: capitalize;
  z-index: 4; /* 数字显示在最顶层 */
}

.number-info {
  display: flex;
  justify-content: space-between;

  span {
    color: var(--sosal_Lighten2_665F59, #665f59);
    text-align: right;
    font-family: Inter;
    font-size: 7px;
    font-style: normal;
    font-weight: 300;
    line-height: 7px;
    text-transform: capitalize;
    margin-top: 6px;
  }
}
</style>
