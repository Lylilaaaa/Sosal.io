<template>
  <!-- 图表容器 -->
  <div>
    <div class="tradingview-widget-container" ref="widgetContainer"></div>
    <Tracking />
  </div>
</template>

<script lang="ts" setup>
import { onMounted, ref } from 'vue';

// 绑定图表容器的引用
const widgetContainer = ref<HTMLDivElement | null>(null);

onMounted(() => {
  if (!widgetContainer.value) return;

  // 创建 iframe 元素
  const iframe = document.createElement('iframe');

  // 设置 iframe 属性
  iframe.style.border = 'none';
  iframe.style.width = '100%';
  iframe.style.height = '100%';
  iframe.allowFullscreen = true;

  // 设置 iframe 的 src，配置图表的参数
  iframe.src =
    'https://s.tradingview.com/widgetembed/?' +
    new URLSearchParams({
      frameElementId: 'tradingview_widget',
      symbol: 'BINANCE:BTCUSDT', // 默认显示的股票代码
      interval: 'D', // 默认时间周期（D = 日线）
      hidesidetoolbar: '1', // 隐藏侧边工具栏
      symboledit: '1', // 允许编辑股票代码
      saveimage: '1', // 允许保存图表为图片
      toolbarbg: 'f1f3f6', // 工具栏背景色
      studies: '[]', // 默认指标设置
      theme: 'dark', // 主题风格（light / dark）
      style: '1', // K线风格：1 = 蜡烛图
      timezone: 'Etc/UTC', // 时区
      withdateranges: '1', // 显示日期范围选择器
      hideideas: '1', // 隐藏 TradingView 社区观点
      hidelegend: '1', // 隐藏图例
      locale: 'en', // 语言
    }).toString();

  // 把 iframe 插入到容器里
  widgetContainer.value.appendChild(iframe);
});
</script>

<style lang="scss" scoped>
.tradingview-widget-container {
  width: 100%;
  height: 600px;
  margin: 10px 0;
}
</style>
