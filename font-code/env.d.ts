/// <reference types="vite/client" />

interface ImportMetaEnv {
  readonly VITE_API_URL: string;
  readonly VITE_APP_TITLE: string;
  readonly VITE_APP_DESCRIPTION: string;
  readonly VITE_APP_VERSION: string;
  readonly VITE_APP_AUTHOR: string;
  readonly VITE_APP_KEYWORDS: string;
  readonly VITE_APP_IMAGE: string;
  readonly VITE_APP_URL: string;
  readonly VITE_APP_TWITTER: string;
  readonly VITE_APP_FACEBOOK: string;
  readonly VITE_APP_INSTAGRAM: string;
  readonly VITE_APP_GITHUB: string;
}

declare module '*.vue' {
  import { DefineComponent } from 'vue';
  const component: DefineComponent<Record<string, unknown>, Record<string, unknown>, unknown>;
  export default component;
}
