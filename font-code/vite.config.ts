import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueDevTools from 'vite-plugin-vue-devtools';
// 导入自动导入函数插件
import autoImport from 'unplugin-auto-import/vite';
// 导入自动导入组件插件
import components from 'unplugin-vue-components/vite';
import { ElementPlusResolver } from 'unplugin-vue-components/resolvers' // ★ 引入 ElementPlus 解析器



// https://vite.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    vueDevTools(),
    components({
      dirs: ['./src/components', './src/layouts'],
      dts: './src/types/components.d.ts',
      resolvers: [ElementPlusResolver()],
    }),
    autoImport({
      imports: ['vue', 'vue-router'],
      dts: './src/types/auto-imports.d.ts',
      dirs: ['./src/**/*'],
      vueTemplate: true,
      resolvers:[ElementPlusResolver()]
    }),

  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },
  css: {
    preprocessorOptions: {
      scss: {
        additionalData: `@use "@/assets/global.scss" as *;`,
        quietDeps: true,
      },
    },
  },

  server: {
    proxy: {
      '/api': {
        target: 'http://15.168.90.221:8081', // 后端地址
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api/, ''), // 重写路径，去掉/api前缀
      },
    },
  },
});
