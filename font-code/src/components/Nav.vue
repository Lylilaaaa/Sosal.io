<template>
  <header class="navbar">
    <!-- 左侧固定 Logo -->
    <router-link to="/" class="logo">
      <img src="@/assets/logo.png" alt="Logo" />
    </router-link>

    <!-- 右侧内容：导航 + 搜索框 + 按钮 -->
    <div class="nav-container">
      <nav class="nav-links">
        <a href="#">NEWBIES</a>
        <a href="#">TRENDING</a>
        <a href="#">SOCIAL TRADE</a>
        <a href="#">PORTFOLIO</a>
        <a href="#"><i></i>sosoEARN</a>
      </nav>
      <div class="search">
        <input type="text" class="search-box" placeholder="search by TOKEN or ADDRESS" />
        <a href="#"><img src="/ui/Asset70.svg" alt="" /></a>
      </div>

      <div class="nav-actions">
        <div class="btn">
          <img src="/ui/Asset27.svg" alt="" />SOL<img class="up" src="/ui/Asset 50.svg" alt="" />
        </div>
        <button class="connect">CONNECT</button>
      </div>
    </div>
  </header>
</template>

<style scoped>
/* 顶部导航栏 */
.navbar {
  height: 60px;
  width: 100%;
  background-color: #141212;
  display: flex;
  align-items: center;
  padding: 0 20px;
  position: fixed;
  top: 0;
  left: 0;
  z-index: 1000;
}

/* 左侧 Logo：固定大小，防止抖动 */
.logo {
  min-width: 120px; /* 固定宽度 */
  height: auto; /* 固定高度 */
  margin-right: 20px; /* 与导航栏之间的间距 */
  display: flex;
  align-items: center;
  flex-shrink: 0;
  perspective: 1000px;
  position: relative;
}

.logo::before {
  content: '';
  position: absolute;
  top: 50%;
  left: 50%;
  width: 100%;
  height: 100%;
  transform: translate(-50%, -50%);
  background: radial-gradient(circle, rgba(255, 107, 0, 0.2), transparent 70%);
  opacity: 0;
  transition: opacity 0.3s ease;
  pointer-events: none;
  z-index: -1;
}

.logo:hover::before {
  opacity: 1;
  animation: logoGlow 1.5s infinite ease-in-out;
}

.logo img {
  height: 30px;
  max-width: 100%;
  width: auto;
  transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
  transform-style: preserve-3d;
  backface-visibility: hidden;
  cursor: pointer;
}

.logo:hover img {
  transform: translateZ(20px) rotateY(10deg) scale(1.05);
  filter: drop-shadow(0 0 8px rgba(255, 107, 0, 0.6));
}

.logo:active img {
  transform: scale(0.95);
  transition: transform 0.1s cubic-bezier(0.4, 0, 0.2, 1);
}

@keyframes logoGlow {
  0% {
    opacity: 0.4;
    transform: translate(-50%, -50%) scale(0.8);
  }
  50% {
    opacity: 0.6;
    transform: translate(-50%, -50%) scale(1.2);
  }
  100% {
    opacity: 0.4;
    transform: translate(-50%, -50%) scale(0.8);
  }
}

/* 右侧内容 flex 布局 */
.nav-container {
  display: flex;
  flex: 1;
  gap: 20px; /* 添加间隙 */
  align-items: center;
  min-width: 0; /* 新增：允许内容收缩 */
}

.nav-links {
  display: flex;
  gap: 20px;
  flex: 0 0 auto; /* 修改为自动伸缩 */
  min-width: 440px;
}

.nav-links a {
  font-size: 12px;
  color: #b2a18f;
  text-decoration: none;
  font-weight: bold;
  position: relative;
  padding: 2px 4px;
  perspective: 1000px;
  transition:
    transform 0.3s ease,
    color 0.3s ease,
    text-shadow 0.3s ease;
}

.nav-links a::after {
  content: '';
  position: absolute;
  left: 0;
  bottom: -2px;
  width: 100%;
  height: 2px;
  background: linear-gradient(90deg, transparent, #ff6b00, transparent);
  transform: scaleX(0);
  opacity: 0;
  transition: all 0.3s ease;
}

.nav-links a:hover {
  color: #fff;
  transform: translateZ(10px) rotateX(5deg);
  text-shadow:
    0 0 5px rgba(255, 255, 255, 0.5),
    0 0 10px rgba(255, 107, 0, 0.3);
}

.nav-links a:hover::after {
  transform: scaleX(1);
  opacity: 1;
}

.nav-links a:hover::before {
  content: '';
  position: absolute;
  top: 50%;
  left: 50%;
  width: 30px;
  height: 30px;
  background: radial-gradient(circle, rgba(255, 107, 0, 0.2), transparent 70%);
  transform: translate(-50%, -50%);
  border-radius: 50%;
  z-index: -1;
  animation: pulseGlow 1s ease-out infinite;
}

@keyframes pulseGlow {
  0% {
    transform: translate(-50%, -50%) scale(0.8);
    opacity: 0.5;
  }
  100% {
    transform: translate(-50%, -50%) scale(2);
    opacity: 0;
  }
}

.btn {
  /* 原有布局样式保持不变 */
  transition:
    transform 0.3s ease,
    box-shadow 0.3s ease; /* 仅添加动画属性 */
}

.btn:hover {
  transform: translateY(-1px);
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.2);
}

.btn img.up {
  transition: transform 0.3s ease;
}

.btn:hover img.up {
  transform: rotate(180deg);
}

.search img {
  /* 原有定位保持不变 */
  transition: opacity 0.3s ease;
}

.search:hover img {
  opacity: 0.8;
}

.connect {
  /* 原有背景和尺寸保持不变 */
  transition:
    transform 0.3s ease,
    box-shadow 0.3s ease;
}

.connect:hover {
  transform: scale(1.05);
  box-shadow: 0 2px 8px rgba(255, 106, 0, 0.3);
}

.connect:active {
  transform: translateY(1px);
}
.search {
  position: relative;
  flex: 1 1 auto; /* 修改为自动伸缩 */
  min-width: 200; /* 设置最小宽度 */
  max-width: 600px; /* 设置最大宽度 */
  margin: 0 20px; /* 调整边距 */
}
.search img {
  position: absolute;
  top: 50%;
  left: 10px;
  transform: translateY(-50%);
  width: 15px;
  height: 15px;
  transition: all 0.3s ease;
}

.search:hover img {
  transform: translateY(-50%) scale(1.1);
}

.search:focus-within img {
  transform: translateY(-50%) scale(1.1) rotate(90deg);
}

.search-box {
  width: 100%;
  height: 30px;
  padding: 5px 40px;
  border: 1px solid transparent;
  border-radius: 15px;
  color: #665f59;
  font-size: 12px;
  background-color: #242021;
  transition: all 0.3s ease;
  box-sizing: border-box;
  opacity: 0.9;
}

.search-box::placeholder {
  color: #665f59;
  transition: all 0.3s ease;
}

.search-box:hover {
  opacity: 1;
  background-color: #2a2627;
}

.search-box:focus {
  outline: none;
  opacity: 1;
  background: #242021;
  box-shadow:
    0 0 0 1px rgba(255, 107, 0, 0.3),
    0 0 15px rgba(255, 107, 0, 0.1);
  border: 1px solid transparent;
  background-clip: padding-box;
}

.search-box:focus::placeholder {
  opacity: 0.7;
  transform: translateX(10px);
}

/* 按钮 */
.nav-actions {
  display: flex;
  align-items: center;
  gap: 10px;
}

.btn {
  width: 90px;
  height: 30px;
  display: flex;
  align-items: center;
  background-color: #181616;
  border: 1px solid #665f59;
  border-radius: 6px;
  color: white;
  font-size: 14px;
  font-weight: bold;
  cursor: pointer;
}

.btn img {
  width: 20px;
  height: 20px;
  margin: 0 5px;
}

.btn img.up {
  width: 10px;
  margin-left: 8px;
}

.connect {
  width: 100px;
  height: 30px;
  background-image:
    linear-gradient(90deg, rgba(255, 149, 0, 0.8) 0%, rgba(255, 107, 0, 0.8) 100%),
    linear-gradient(90deg, #ffd700 0%, #ff8c00 50%, #ffd700 100%);
  background-size:
    100% 100%,
    200% 100%;
  background-position:
    0 0,
    100% 0;
  color: white;
  border: none;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
  font-weight: bold;
  letter-spacing: 0.5px;
  box-shadow:
    0 1px 2px rgba(255, 107, 0, 0.3),
    inset 0 1px 1px rgba(255, 255, 255, 0.4);
  transition:
    transform 0.3s,
    box-shadow 0.3s,
    background-position 0.6s;
  animation: shine 0.5s infinite linear;
}

.connect::before,
.connect::after {
  content: '';
  position: absolute;
  top: 0;
  left: -100%;
  width: 50%;
  height: 100%;
  background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.2), transparent);
  animation: scanLight 1.5s infinite linear;
}

.connect::after {
  left: -150%;
  background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.4), transparent);
  animation: scanLight 1.5s infinite 0.75s linear;
}

@keyframes shine {
  to {
    background-position:
      -200% 0,
      0 0;
  }
}

@keyframes scanLight {
  0% {
    left: -50%;
    opacity: 0;
  }
  20% {
    opacity: 0.6;
  }
  50% {
    opacity: 0.9;
  }
  80% {
    opacity: 0.6;
  }
  100% {
    left: 150%;
    opacity: 0;
  }
}

.connect:hover {
  transform: translateY(-1px);
  box-shadow:
    0 4px 8px rgba(255, 107, 0, 0.4),
    inset 0 1px 1px rgba(255, 255, 255, 0.4);
  animation: shine 1s infinite;
}

.connect:hover::before,
.connect:hover::after {
  animation: scanLight 1s infinite linear;
  width: 120%;
}

.connect:hover::after {
  animation-delay: 0.5s;
}

.connect:active {
  transform: translateY(1px);
  box-shadow:
    0 2px 4px rgba(255, 107, 0, 0.3),
    inset 0 1px 1px rgba(255, 255, 255, 0.2);
}
i {
  display: inline-block;
  background-image: url('@/assets/Asset16.svg');
  width: 12px;
  height: 12px;
  background-size: contain;
  background-repeat: no-repeat;
  vertical-align: top;
}
</style>

<script setup>
import { useRouter } from 'vue-router';
const router = useRouter();
</script>
