// 导入Vue的ESLint插件
import vue from 'eslint-plugin-vue';
// 导入TypeScript的ESLint插件
import typescript from '@typescript-eslint/eslint-plugin';
// 导入Node.js的path模块用于路径处理
import path from 'path';
// 导入Node.js的url模块用于URL处理
import { fileURLToPath } from 'url';

// 获取当前文件的绝对目录路径
const __dirname = path.dirname(fileURLToPath(import.meta.url));

// 导出ESLint配置
export default [
  // 使用Vue官方推荐的flat配置预设
  ...vue.configs['flat/recommended'],

  // 自定义配置部分
  {
    // 指定要检查的文件模式（所有.ts和.vue文件）
    files: ['**/*.{ts,vue}'],
    // 指定要忽略的目录（dist目录）
    ignores: ['**/dist/**'],
    // 语言相关配置
    languageOptions: {
      // 使用vue-eslint-parser作为主解析器
      parser: require('vue-eslint-parser'),
      // 解析器选项配置
      parserOptions: {
        // 对<script>标签使用TypeScript解析器
        parser: '@typescript-eslint/parser',
        // 指定ESLint专用的TSConfig路径（绝对路径）
        project: path.resolve(__dirname, 'tsconfig.eslint.json'),
        // 指定TSConfig的根目录
        tsconfigRootDir: __dirname,
        // 额外要处理的文件扩展名（.vue文件）
        extraFileExtensions: ['.vue'],
        // 启用实验性的项目服务支持（解决项目引用问题）
        EXPERIMENTAL_useProjectService: true,
      },
    },
    // 使用的插件
    plugins: {
      // 启用TypeScript规则
      '@typescript-eslint': typescript,
    },
    // 自定义规则配置
    rules: {
      // 关闭Vue组件名必须是多单词的规则
      'vue/multi-word-component-names': 'off',
      // 关闭"未处理的Promise"检查规则（性能优化）
      '@typescript-eslint/no-floating-promises': 'off',
    },
  },
];
