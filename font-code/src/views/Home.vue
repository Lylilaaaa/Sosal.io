<template>
  <div class="home">
    <div class="scroll-zone-left">
      <Sidebar class="sidebar" />
    </div>
    <div class="scroll-zone">
      <!-- 你的滚动内容区域 -->
      <Content class="content" />
    </div>

    <div class="scroll-zone-right">
      <RightBar class="rightbar" />
    </div>
  </div>
</template>

<script setup></script>

<style scoped>
.scroll-zone-left {
  height: 100%;
  overflow-y: auto;

  scrollbar-width: none;
}
.scroll-zone {
  flex: 1;
  height: 100%;
  overflow-y: auto;

  scrollbar-width: none;
}

.scroll-zone-right {
  height: 100%;
  overflow-y: auto;

  scrollbar-width: none;
}
.home {
  display: flex;
  background-color: #242021;
  height: 100%;
}

.sidebar {
  width: 315px;
}

.content {
  flex: 1;
}

.rightbar {
  width: 315px;
  height: 100%;
}
</style>
