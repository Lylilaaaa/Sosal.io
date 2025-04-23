<template>
  <div class="layout">
    <Nav class="nav" />
    <main class="main-content">
      <router-view />
      <!-- 这里加载 Home.vue，里面有三栏布局 -->
    </main>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped>
.layout {
  display: flex;
  flex-direction: column;
  height: 100vh;
  background-color: #242021; /* 新增布局背景色 */
}

.main-content {
  padding-top: 60px;
  height: 100vh;
  overflow: hidden;
}
</style>
