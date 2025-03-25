<template>
  <div class="right-container">
    <div class="sosoEarn">
      <div class="avatar">
        <img src="/ui/Asset 1.svg" alt="" />
        <div class="text">sosoEARN</div>
      </div>
      <div class="info"></div>
    </div>
    <div class="buy"></div>
    <div class="sportLight"></div>
  </div>
</template>

<script setup></script>

<style scoped>
.right-container {
  margin: 8px;
}

.sosoEarn {
  height: 70px;
  background-color: #181616;
  margin-bottom: 8px;
  border-radius: 8px;
  display: flex;
}

.avatar {
  text-align: center;
  margin: 0 0 0 8px;
}

.avatar img {
  width: 64px;
  display: block;
  object-fit: cover;
}

.avatar .text {
  position: relative;
  z-index: 1;
  font-size: 12px;
  background: linear-gradient(45deg, #e319a7, #9804dc, #4404c3);
  -webkit-background-clip: text;
  background-clip: text;
  color: transparent;
  padding: 2px;
  top: -13px;
}

.avatar .text::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: -1;
  border-radius: 2px;
  mask:
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  mask-composite: exclude;
  padding: 1px;

  border: 1px solid transparent;
  border-image: linear-gradient(45deg, #e319a7, #9804dc, #4404c3) 1;
}

.info {
}

.buy {
  background-color: #181616;
  margin-bottom: 8px;
  border-radius: 8px;
}

.sportLight {
  background-color: #181616;
  border-radius: 8px;
}
</style>
