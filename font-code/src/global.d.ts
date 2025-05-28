// src/global.d.ts

import type { ElTable, ElTableColumn } from 'element-plus';

declare module 'vue' {
  export interface GlobalComponents {
    ElTable: typeof ElTable;
    ElTableColumn: typeof ElTableColumn;
  }
}
