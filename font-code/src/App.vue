<script setup lang="ts">
// 使用自动导入的ref
// 状态管理：页面基础计数状态
const count = ref(26);
// Layout组件已通过unplugin-vue-components自动导入（组件自动注入机制）
</script>

<template>
  <!-- 主路由出口 -->
  <router-view />
</template>

<style>
/* 全局页面背景色设置 */
html,
body {
  background-color: #242021; /* 深灰色背景 */
}
</style>
