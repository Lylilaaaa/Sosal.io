<template>
  <!-- 首页布局容器 -->
  <div class="home">
    <!-- 左侧导航侧边栏 -->
    <Sidebar class="sidebar" />
    <!-- 主内容展示区域 -->
    <Content class="content" />
    <!-- 右侧辅助信息栏 -->
    <RightBar class="rightbar" />
  </div>
</template>

<script setup>
// 导入布局组件
import Sidebar from '@/components/Sidebar.vue'; // 侧边导航模块
import Content from '@/components/Content.vue'; // 核心内容区域
import RightBar from '@/components/RightBar.vue'; // 右侧辅助面板
</script>

<style scoped>
/* 弹性布局容器 */
.home {
  display: flex;
  background-color: #242021; /* 保持与全局背景一致 */
}

.sidebar {
  width: 315px; /* 固定左侧导航宽度 */
}

.content {
  flex: 1; /* 主内容区自动填充剩余空间 */
}

.rightbar {
  width: 314px; /* 固定右侧信息栏宽度 */
}
</style>
