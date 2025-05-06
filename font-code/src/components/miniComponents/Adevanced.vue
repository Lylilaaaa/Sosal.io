<template>
  <div class="mev-container">
    <span class="text">STOP LOSS:</span>
    <div class="button">
      <svg
        xmlns="http://www.w3.org/2000/svg"
        width="25"
        height="25"
        viewBox="0 0 25 25"
        fill="none"
      >
        <path
          d="M19.5 9.5H5.5C3.84315 9.5 2.5 10.8431 2.5 12.5C2.5 14.1569 3.84315 15.5 5.5 15.5H19.5C21.1569 15.5 22.5 14.1569 22.5 12.5C22.5 10.8431 21.1569 9.5 19.5 9.5Z"
          fill="#FF8000"
        />
        <path
          d="M16.5 18.5C19.8137 18.5 22.5 15.8137 22.5 12.5C22.5 9.18629 19.8137 6.5 16.5 6.5C13.1863 6.5 10.5 9.18629 10.5 12.5C10.5 15.8137 13.1863 18.5 16.5 18.5Z"
          fill="#B2A18F"
        />
      </svg>
    </div>
    <div class="info">
      <svg
        xmlns="http://www.w3.org/2000/svg"
        width="12"
        height="12"
        viewBox="0 0 12 12"
        fill="none"
      >
        <path
          d="M5.99995 1.20001C3.35275 1.20001 1.19995 3.35281 1.19995 6.00001C1.19995 8.64721 3.35275 10.8 5.99995 10.8C8.64715 10.8 10.8 8.64721 10.8 6.00001C10.8 3.35281 8.64715 1.20001 5.99995 1.20001ZM5.99995 9.93601C3.83035 9.93601 2.06395 8.16961 2.06395 6.00001C2.06395 3.83041 3.83035 2.06401 5.99995 2.06401C8.16955 2.06401 9.93595 3.83041 9.93595 6.00001C9.93595 8.16961 8.16955 9.93601 5.99995 9.93601Z"
          fill="#3D3935"
        />
        <path
          d="M5.99995 4.88281C5.66875 4.88281 5.39995 5.15161 5.39995 5.48281V8.62081C5.39995 8.95201 5.66875 9.22081 5.99995 9.22081C6.33115 9.22081 6.59995 8.95201 6.59995 8.62081V5.48281C6.59995 5.15161 6.33115 4.88281 5.99995 4.88281Z"
          fill="#3D3935"
        />
        <path
          d="M6.42115 3.27001C6.36955 3.21001 6.30115 3.16681 6.23275 3.14161C6.07795 3.08161 5.91595 3.08161 5.76955 3.14161C5.70115 3.16681 5.63275 3.21001 5.57155 3.27001C5.51995 3.33001 5.47795 3.39001 5.44315 3.46801C5.41675 3.53641 5.39995 3.61321 5.39995 3.69121C5.39995 3.77641 5.41795 3.85441 5.44315 3.92281C5.47795 4.00081 5.51995 4.05961 5.57155 4.12081C5.63155 4.18081 5.69995 4.22401 5.76955 4.24921C5.84635 4.28401 5.92315 4.30081 6.00115 4.30081C6.07915 4.30081 6.15595 4.28401 6.23275 4.24921C6.30115 4.22281 6.36955 4.18081 6.42115 4.12081C6.48115 4.06081 6.52435 4.00081 6.55795 3.92281C6.58435 3.85441 6.60115 3.77761 6.60115 3.69121C6.60115 3.61441 6.58435 3.53761 6.55795 3.46801C6.52315 3.39121 6.48115 3.33121 6.42115 3.27001Z"
          fill="#3D3935"
        />
      </svg>
    </div>
  </div>
  <div class="trigger-container">
    <input type="text" />
    <div class="trigger-price">Trigger Price at</div>
    <div class="qujianxiaoyu">≤</div>
    <div class="qujiandayu">$</div>
  </div>

  <div class="trigger-container">
    <input type="text" />
    <div class="trigger-price">Current Price ↓</div>
    <div class="qujianxiaoyu">≥</div>
    <div class="qujiandayu">%</div>
  </div>

  <div class="trigger-on">Triggers on: $PRICE ≤ 0.0541552,SOL ≤ 0.0383104</div>

  <div class="slider-container">
    <SliderButton></SliderButton>
  </div>

  <div class="sell-expires">
    <div class="sell">
      <div class="sell-amount">Sell Amount</div>
      <div class="number">
        <input type="text" />
        <span>%</span>
      </div>
    </div>
    <div class="expires">
      <div class="expires-in-hrs">Expires in hrs</div>
      <div class="number">
        <input type="text" />
        <span>H</span>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, watch, onMounted } from 'vue';

const percentage = ref(30);
const sliderRef = ref(null); // ref 绑定 DOM 节点

watch(percentage, (newVal) => {
  if (sliderRef.value) {
    sliderRef.value.style.setProperty('--percent', newVal / 90);
  }
});

onMounted(() => {
  if (sliderRef.value) {
    sliderRef.value.style.setProperty('--percent', percentage.value / 90);
  }
});
</script>

<style lang="scss" scoped>
input[type='text'] {
  height: 27px;
  border-radius: 4px;
  border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
  background: var(--sosal_Dark3_181616, #181616);

  color: #d1cdcb;

  &::placeholder {
    color: #3d3935;
    font-family: Inter;
    font-size: 10px;
    font-style: normal;
    font-weight: 500;
    line-height: 27px;
    vertical-align: middle;
  }

  &:focus {
    outline: none;
    opacity: 1;
    background: #242021;
    box-shadow:
      0 0 0 1px rgba(255, 107, 0, 0.3),
      0 0 15px rgba(255, 107, 0, 0.1);
    border: 0.4px solid transparent;
    background-clip: padding-box;
  }
}

.mev-container {
  display: flex;
  align-items: center;

  .text {
    color: #665f59;
    font-family: Inter;
    font-size: 10px;
    font-style: normal;
    font-weight: 300;
    line-height: normal;
    text-transform: capitalize;
  }
  .button {
    left: 39px;
  }

  .info {
    margin-left: 4px;
    padding: 0;
  }
}

.trigger-container {
  width: 100%;
  height: 27px;
  flex-shrink: 0;
  position: relative;
  margin-bottom: 8px;

  input {
    width: 100%;
    height: 27px;
    padding-left: 158px;
    color: var(--WhiteTextD1CDCB, #d1cdcb);
    font-family: Inter;
    font-size: 10px;
    font-style: normal;
    font-weight: 640;
    line-height: normal;
  }
  .trigger-price {
    position: absolute;
    top: 0px;
    width: 137px;
    height: 27px;
    line-height: 27px;
    padding-left: 8px;
    color: var(--sosal_Lighten3_B2A18F, #b2a18f);
    font-family: Inter;
    font-size: 10px;
    font-style: normal;
    font-weight: 500;
    flex-shrink: 0;
    border-radius: 4px 0px 0px 4px;
    border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
    border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
    border-left: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
    background: var(--sosal_Lighten1_3D3935, #3d3935);
  }

  .qujianxiaoyu {
    width: 27px;
    height: 27px;
    line-height: 27px;
    position: absolute;
    top: 0px;
    margin-left: 144px;
    color: var(--sosal_Lighten2_665F59, #665f59);
    font-family: Inter;
    font-size: 10px;
    font-style: normal;
    font-weight: 640;
  }

  .qujiandayu {
    width: 27px;
    height: 27px;
    line-height: 27px;
    position: absolute;
    top: 0px;
    margin-left: 260px;
    color: var(--sosal_Lighten2_665F59, #665f59);
    font-family: Inter;
    font-size: 10px;
    font-style: normal;
    font-weight: 640;
  }
}

.trigger-on {
  margin-top: -4px;
  color: var(--sosal_Lighten2_665F59, #665f59);
  font-family: Inter;
  font-size: 10px;
  font-style: normal;
  font-weight: 500;
  line-height: normal;
  margin-bottom: 17px;
}

.slider-container {
  margin-bottom: 11px;
}

.sell-expires {
  display: flex;
  justify-content: space-between;
  .sell {
    position: relative;
    display: flex;
    align-items: center;

    .sell-amount {
      position: absolute;
      width: 86.5px;
      height: 27px;
      color: var(--sosal_Lighten3_B2A18F, #b2a18f);
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 500;
      line-height: 27px;
      padding-left: 8px;
      border-radius: 4px 0px 0px 4px;
      background: var(--sosal_Lighten1_3D3935, #3d3935);
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-left: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
    }
    .number {
      display: flex;
      align-items: center;
      input {
        width: 133px;
        height: 27px;
        flex-shrink: 0;
        border-radius: 4px;
        border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
        background-color: #181616;
        padding-left: 96px;
        color: #d1cdcb;
        font-size: 10px;
        font-style: normal;
        font-weight: 640;
      }
      span {
        position: absolute;
        right: 7px;
        color: var(--sosal_Lighten2_665F59, #665f59);
        font-family: Inter;
        font-size: 10px;
        // font-style: normal;
        font-weight: 500;
        vertical-align: middle;
      }
    }
  }
  .expires {
    position: relative;
    display: flex;
    align-items: center;

    .expires-in-hrs {
      position: absolute;
      width: 86.5px;
      height: 27px;
      color: var(--sosal_Lighten3_B2A18F, #b2a18f);
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 500;
      line-height: 27px;
      padding-left: 8px;
      border-radius: 4px 0px 0px 4px;
      background: var(--sosal_Lighten1_3D3935, #3d3935);
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-left: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
    }
    .number {
      display: flex;
      align-items: center;
      input {
        width: 133px;
        height: 27px;
        flex-shrink: 0;
        border-radius: 4px;
        border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
        background-color: #181616;
        padding-left: 96px;
        color: #d1cdcb;
        font-size: 10px;
        font-style: normal;
        font-weight: 640;
      }
      span {
        position: absolute;
        right: 7px;
        color: var(--sosal_Lighten2_665F59, #665f59);
        font-family: Inter;
        font-size: 10px;
        // font-style: normal;
        font-weight: 500;
        vertical-align: middle;
      }
    }
  }
}
</style>
