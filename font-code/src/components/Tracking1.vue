<template>
  <div class="page">
    <!-- 顶部导航 -->
    <div class="top-bar">
      <div class="tabs">
        <button
          v-for="tab in tabs"
          :key="tab"
          :class="['tab-button', { active: activeTab === tab }]"
          @click="activeTab = tab"
        >
          {{ tab }}
        </button>
      </div>
      <button class="filter-button">
        <img src="/ui/Asset 49.svg" alt="" />
        Filters
        <img src="/ui/Asset 50.svg" alt="" />
      </button>
    </div>

    <!-- 表格 -->

    <table class="order-table">
      <thead>
        <tr>
          <th>
            <div class="flex-itmes-row">
              Token<span>Last Active</span> <img src="/ui/Asset 92.svg" alt="" />
            </div>
          </th>
          <th>
            <div class="flex-itmes-row">Status<img src="/ui/Asset 92.svg" alt="" /></div>
          </th>
          <th>
            <div class="flex-itmes-row">Type<img src="/ui/Asset 92.svg" alt="" /></div>
          </th>
          <th>Trigger / Current <span>Price</span></th>
          <th>Position %</th>
          <th>Est. Quantity</th>
          <th>Est. Value(Native)</th>
          <th>Est. Value(USD)</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <div class="flex-itmes-row">
              <div class="token-image">
                <img class="img" src="/ui/Asset 33.svg" alt="" />
                <img class="img-token" src="/ui/Asset27.svg" alt="" />
              </div>
              <div>
                <div class="token-name">
                  <div class="flex-itmes-row">
                    <span class="token-name__symbol">$ABCDE</span
                    ><img src="/ui/Asset 60.svg" alt="" />
                  </div>
                  <div class="token-time">4h</div>
                </div>
              </div>
            </div>
          </td>
          <td>
            <span class="status">Failed</span>
          </td>
          <td>
            <span class="type">SL</span>
          </td>
          <td>
            <span class="trigger-current-price"> <span>$0.02922</span>/$$0.02922</span>
          </td>
          <td>
            <span class="position">100%</span>
          </td>
          <td>
            <span class="quantity">≈ 11.8M</span>
          </td>
          <td>
            <span class="native-value">38.5 SOL</span>
          </td>
          <td>
            <span class="usd-value">$7.7K</span>
          </td>
          <td style="width: 10%">
            <div class="flex-itmes-row">
              <img class="icon" src="/ui/Asset 76.svg" alt="" />
              <img class="icon" src="/ui/Asset 99.svg" alt="" />
              <img class="icon" src="/ui/Asset 116.svg" alt="" />
            </div>
          </td>
        </tr>
        <tr>
          <td>
            <div class="flex-itmes-row">
              <div class="token-image">
                <img class="img" src="/ui/Asset 33.svg" alt="" />
                <img class="img-token" src="/ui/Asset27.svg" alt="" />
              </div>
              <div>
                <div class="token-name">
                  <div class="flex-itmes-row">
                    <span class="token-name__symbol">$ABCDE</span
                    ><img src="/ui/Asset 60.svg" alt="" />
                  </div>
                  <div class="token-time">4h</div>
                </div>
              </div>
            </div>
          </td>
          <td>
            <span class="status">Failed</span>
          </td>
          <td>
            <span class="type">SL</span>
          </td>
          <td>
            <span class="trigger-current-price"> <span>$0.02922</span>/$$0.02922</span>
          </td>
          <td>
            <span class="position">100%</span>
          </td>
          <td>
            <span class="quantity">≈ 11.8M</span>
          </td>
          <td>
            <span class="native-value">38.5 SOL</span>
          </td>
          <td>
            <span class="usd-value">$7.7K</span>
          </td>
          <td style="width: 10%">
            <div class="flex-itmes-row">
              <img class="icon" src="/ui/Asset 76.svg" alt="" />
              <img class="icon" src="/ui/Asset 99.svg" alt="" />
              <img class="icon" src="/ui/Asset 116.svg" alt="" />
            </div>
          </td>
        </tr>
        <tr>
          <td>
            <div class="flex-itmes-row">
              <div class="token-image">
                <img class="img" src="/ui/Asset 33.svg" alt="" />
                <img class="img-token" src="/ui/Asset27.svg" alt="" />
              </div>
              <div>
                <div class="token-name">
                  <div class="flex-itmes-row">
                    <span class="token-name__symbol">$ABCDE</span
                    ><img src="/ui/Asset 60.svg" alt="" />
                  </div>
                  <div class="token-time">4h</div>
                </div>
              </div>
            </div>
          </td>
          <td>
            <span class="status">Failed</span>
          </td>
          <td>
            <span class="type">SL</span>
          </td>
          <td>
            <span class="trigger-current-price"> <span>$0.02922</span>/$$0.02922</span>
          </td>
          <td>
            <span class="position">100%</span>
          </td>
          <td>
            <span class="quantity">≈ 11.8M</span>
          </td>
          <td>
            <span class="native-value">38.5 SOL</span>
          </td>
          <td>
            <span class="usd-value">$7.7K</span>
          </td>
          <td style="width: 10%">
            <div class="flex-itmes-row">
              <img class="icon" src="/ui/Asset 76.svg" alt="" />
              <img class="icon" src="/ui/Asset 99.svg" alt="" />
              <img class="icon" src="/ui/Asset 116.svg" alt="" />
            </div>
          </td>
        </tr>
        <tr>
          <td>
            <div class="flex-itmes-row">
              <div class="token-image">
                <img class="img" src="/ui/Asset 33.svg" alt="" />
                <img class="img-token" src="/ui/Asset27.svg" alt="" />
              </div>
              <div>
                <div class="token-name">
                  <div class="flex-itmes-row">
                    <span class="token-name__symbol">$ABCDE</span
                    ><img src="/ui/Asset 60.svg" alt="" />
                  </div>
                  <div class="token-time">4h</div>
                </div>
              </div>
            </div>
          </td>
          <td>
            <span class="status">Failed</span>
          </td>
          <td>
            <span class="type">SL</span>
          </td>
          <td>
            <span class="trigger-current-price"> <span>$0.02922</span>/$$0.02922</span>
          </td>
          <td>
            <span class="position">100%</span>
          </td>
          <td>
            <span class="quantity">≈ 11.8M</span>
          </td>
          <td>
            <span class="native-value">38.5 SOL</span>
          </td>
          <td>
            <span class="usd-value">$7.7K</span>
          </td>
          <td style="width: 10%">
            <div class="flex-itmes-row">
              <img class="icon" src="/ui/Asset 76.svg" alt="" />
              <img class="icon" src="/ui/Asset 99.svg" alt="" />
              <img class="icon" src="/ui/Asset 116.svg" alt="" />
            </div>
          </td>
        </tr>
        <tr>
          <td>
            <div class="flex-itmes-row">
              <div class="token-image">
                <img class="img" src="/ui/Asset 33.svg" alt="" />
                <img class="img-token" src="/ui/Asset27.svg" alt="" />
              </div>
              <div>
                <div class="token-name">
                  <div class="flex-itmes-row">
                    <span class="token-name__symbol">$ABCDE</span
                    ><img src="/ui/Asset 60.svg" alt="" />
                  </div>
                  <div class="token-time">4h</div>
                </div>
              </div>
            </div>
          </td>
          <td>
            <span class="status">Failed</span>
          </td>
          <td>
            <span class="type">SL</span>
          </td>
          <td>
            <span class="trigger-current-price"> <span>$0.02922</span>/$$0.02922</span>
          </td>
          <td>
            <span class="position">100%</span>
          </td>
          <td>
            <span class="quantity">≈ 11.8M</span>
          </td>
          <td>
            <span class="native-value">38.5 SOL</span>
          </td>
          <td>
            <span class="usd-value">$7.7K</span>
          </td>
          <td style="width: 10%">
            <div class="flex-itmes-row">
              <img class="icon" src="/ui/Asset 76.svg" alt="" />
              <img class="icon" src="/ui/Asset 99.svg" alt="" />
              <img class="icon" src="/ui/Asset 116.svg" alt="" />
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script lang="ts" setup>
import { ref } from 'vue';

const activeTab = ref('Orders (6)');

const tabs = ['Profitable Trades', 'Holdings', 'Orders (6)', 'History'];
</script>

<style lang="scss" scoped>
.top-bar {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.tabs {
  display: flex;
  gap: 2px;
  margin-left: 15px;
  background-color: #181616;
}

.tab-button {
  background-color: #181616;
  width: 115px;
  height: 25px;
  font-size: 10px;
  border: 1px solid #665f59;
  color: $lightColor;
  border-radius: 4px 4px 0 0;
  cursor: pointer;
  border-bottom: none;
  text-align: left;
  font-family: 'inter', sans-serif;
  /* white-space: nowrap; */
  line-height: 25px;
}

.tab-button.active {
  background: #1a1816;
  color: white;
  font-weight: bold;
}

.filter-button {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 80px;
  height: 20px;
  font-size: 10px;
  background: none;
  border: 1px solid #666;
  color: white;
  border-radius: 4px;
  cursor: pointer;
  white-space: nowrap;

  img {
    width: 10px;
  }
}

.filter-button:hover {
  background: #333;
}

.flex-itmes-row {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 3px;
}

.order-table {
  width: 100%;
  height: 30px;
  font-size: 10px;
  color: $lightColor;
  line-height: 30px;
  overflow: hidden;
  border-spacing: 0;
  border-collapse: separate;
  border-radius: 8px 8px 0 0;

  thead {
    background: #181616;
    font-size: 10px;

    img {
      width: 6px;
    }
  }

  tbody {
    background: #1f1c1c;

    tr {
      td {
        text-align: center;
        vertical-align: middle;
        padding: 5px;
      }
    }
    .token-image {
      position: relative;
      .img {
        width: 34px;
      }
      .img-token {
        width: 11px;
        position: absolute;
        right: 0px;
        bottom: 0px;
      }
    }

    .token-name {
      text-align: start;
      line-height: 12px;
      img {
        width: 8px;
      }
    }
    .icon {
      width: 10px;
      margin: 0 5px;
    }
  }
}

.status {
  padding: 0px 10px;
  height: 18px;
  border-radius: 2px;
  font-size: 10px;
  text-align: center;
  line-height: 18px;
  border: 1px solid #666;
}

.type {
  padding: 0px 10px;
  height: 18px;
  border-radius: 2px;
  font-size: 10px;
  text-align: center;
  line-height: 18px;
  border: 1px solid #666;
}
</style>
