import { createApp } from 'vue';
import App from './App.vue';
import router from './router';

// 导入 Element Plus
import ElementPlus from 'element-plus';
// 导入 Element Plus 样式
import 'element-plus/dist/index.css';

const app = createApp(App);

app.use(router);
app.use(ElementPlus);
app.mount('#app');
