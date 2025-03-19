<template>
  <div class="home">
    <Sidebar class="sidebar" />
    <Content class="content" />
    <RightBar class="rightbar" />
  </div>
</template>

<script setup>
import Sidebar from '@/components/Sidebar.vue';
import Content from '@/components/Content.vue';
import RightBar from '@/components/RightBar.vue';
</script>

<style scoped>
.home {
  display: flex;
  background-color: #242021;
}

.sidebar {
  width: 315px;
}

.content {
  flex: 1;
  background: #fff;
}

.rightbar {
  width: 314px;
}
</style>
