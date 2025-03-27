import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueDevTools from 'vite-plugin-vue-devtools';
// 导入自动导入函数插件
import autoImport from 'unplugin-auto-import/vite';
// 导入自动导入组件插件
import components from 'unplugin-vue-components/vite';

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    vueDevTools(),
    components({
      dirs: ['./src/components', './src/layout'],
      dts: './src/types/components.d.ts',
    }),
    autoImport({
      imports: ['vue', 'vue-router'],
      dts: './src/types/auto-imports.d.ts',
      dirs: ['./src/**/*'],
      vueTemplate: true,
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
});
