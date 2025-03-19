<script setup lang="ts">
// 使用自动导入的ref
const count = ref(26);
// Layout组件已通过unplugin-vue-components自动导入
</script>

<template>
  <router-view />
</template>

<style>
html,
body {
  background-color: #242021;
}
</style>
