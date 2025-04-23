<template>
  <svg class="svg-icon" aria-hidden="true">
    <use :xlink:href="`#icon-${name}`" />
  </svg>
</template>

<script setup lang="ts">
// 接收图标名，例如 name="home" 会渲染 #icon-home
defineProps<{ name: string }>();
</script>

<style scoped>
.svg-icon {
  width: 1em;
  height: 1em;
  fill: currentColor;
  vertical-align: middle;
  transition: fill 0.2s;
}
</style>
