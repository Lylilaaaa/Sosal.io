<template>
  <div class="take-profit">
    <div class="left">
      <div class="tp">TP {{ count }}</div>
      <div class="price">Price ↑</div>
      <div class="up-percent">
        <input
          type="number"
          max="100"
          min="0"
          v-model.number="value1"
          @input="onInput('value1', $event)"
        />
        <div>%</div>
      </div>
      <div class="sell">Sell</div>
      <div class="down-percent">
        <input
          type="number"
          max="100"
          min="0"
          v-model.number="value2"
          @input="onInput('value2', $event)"
        />
        <div>%</div>
      </div>
    </div>
    <div class="right">
      <div class="del">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="15"
          height="15"
          viewBox="0 0 15 15"
          fill="none"
        >
          <path
            d="M12.1787 4.19682H10.1141V2.94844C10.1141 2.68882 9.90285 2.47754 9.64323 2.47754H5.35814C5.09852 2.47754 4.88724 2.68882 4.88724 2.94844V4.19682H2.82271C2.56309 4.19682 2.35181 4.40811 2.35181 4.66773C2.35181 4.92735 2.56309 5.13863 2.82271 5.13863H3.66371V11.3308C3.66371 12.1594 4.33762 12.8333 5.16619 12.8333H9.83381C10.6624 12.8333 11.3363 12.1594 11.3363 11.3308V5.13725H12.1773C12.4369 5.13725 12.6482 4.92597 12.6482 4.66635C12.6482 4.40673 12.4369 4.19544 12.1773 4.19544L12.1787 4.19682ZM6.28752 5.13725H7.02909V11.8901H6.28752V5.13725ZM7.9709 5.13725H8.71247V11.8901H7.9709V5.13725ZM5.82904 3.41797H9.17233V4.19544H5.82904V3.41797ZM4.60414 11.3294V5.13725H5.34571V11.8901H5.16481C4.85547 11.8901 4.60276 11.6388 4.60276 11.3281L4.60414 11.3294ZM10.3959 11.3294C10.3959 11.6388 10.1431 11.8915 9.83381 11.8915H9.6529V5.13725H10.3945V11.3294H10.3959Z"
            fill="#B2A18F"
          />
        </svg>
      </div>
      <div class="add">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="15"
          height="15"
          viewBox="0 0 15 15"
          fill="none"
        >
          <path d="M11.7353 6.99736H3.26318V8.69179H11.7353V6.99736Z" fill="#B2A18F" />
          <path d="M6.65204 3.60986V12.082H8.34647V3.60986H6.65204Z" fill="#B2A18F" />
        </svg>
      </div>
    </div>
  </div>
</template>

<script lang="ts" setup>
import { ref } from 'vue';

const value1 = ref<number>(0);
const value2 = ref<number>(0);

defineProps<{ count: string }>();

function onInput(field: 'value1' | 'value2', e: Event) {
  const target = e.target as HTMLInputElement;
  let val = Number(target.value);

  if (val > 100) val = 100;
  if (val < 0) val = 0;

  if (field === 'value1') {
    value1.value = val;
  } else {
    value2.value = val;
  }
}
</script>

<style lang="scss" scoped>
.take-profit {
  width: 100%;
  display: flex;
  justify-content: space-between;

  .left {
    display: flex;
    align-items: center;
    .tp {
      width: 46px;
      height: 27px;
      flex-shrink: 0;
      border-radius: 4px 0px 0px 4px;
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-left: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Dark3_181616, #181616);

      color: var(--sosal_Lighten3_B2A18F, #b2a18f);
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 500;
      line-height: 27px;
      text-align: center;
    }
    .price {
      width: 51px;
      height: 27px;
      flex-shrink: 0;
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-left: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Lighten1_3D3935, #3d3935);
      color: var(--sosal_Lighten3_B2A18F, #b2a18f);
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 500;
      line-height: 27px;
      text-align: center;
    }

    .up-percent {
      width: 51px;
      height: 27px;
      flex-shrink: 0;
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Dark3_181616, #181616);
      display: flex;
      align-items: center;
      position: relative;
      input {
        appearance: none;
        -webkit-appearance: none;
        border: none;
        padding-left: 10.5px;
        padding-right: 19.5px;
        margin: 0;
        font: inherit;
        width: 51px;
        height: 100%;
        box-sizing: border-box;
        background-color: #181616;

        color: var(--WhiteTextD1CDCB, #d1cdcb);
        font-family: Inter;
        font-size: 10px;
        font-style: normal;
        font-weight: 640;
        line-height: 10px;
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

        &[type='number']::-webkit-inner-spin-button,
        &[type='number']::-webkit-outer-spin-button {
          -webkit-appearance: none;
          margin: 0;
        }
        input[type='number'] {
          -moz-appearance: textfield;
        }
      }

      div {
        position: absolute;
        right: 10.5px;
        color: var(--sosal_Lighten2_665F59, #665f59);
        text-align: right;
        font-family: Inter;
        font-size: 10px;
        font-style: normal;
        font-weight: 500;
        pointer-events: none;
      }
    }

    .sell {
      width: 51px;
      height: 27px;
      flex-shrink: 0;
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-left: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Lighten1_3D3935, #3d3935);

      color: var(--sosal_Lighten3_B2A18F, #b2a18f);
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 500;
      line-height: 27px;

      text-align: center;
    }

    .down-percent {
      width: 51px;
      height: 27px;
      flex-shrink: 0;
      border-radius: 0px 4px 4px 0px;
      border-top: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-right: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      border-bottom: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Dark3_181616, #181616);
      display: flex;
      align-items: center;
      position: relative;
      input {
        appearance: none;
        -webkit-appearance: none;
        border: none;
        padding-left: 10.5px;
        padding-right: 19.5px;
        margin: 0;
        font: inherit;
        width: 100%;
        height: 100%;
        box-sizing: border-box;
        background-color: #181616;
        border-radius: 0px 4px 4px 0px;

        color: var(--WhiteTextD1CDCB, #d1cdcb);
        font-family: Inter;
        font-size: 10px;
        font-style: normal;
        font-weight: 640;
        line-height: 10px;
        box-sizing: border-box;
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

        &[type='number']::-webkit-inner-spin-button,
        &[type='number']::-webkit-outer-spin-button {
          -webkit-appearance: none;
          margin: 0;
        }
        input[type='number'] {
          -moz-appearance: textfield;
        }
      }

      div {
        position: absolute;
        right: 10.5px;
        color: var(--sosal_Lighten2_665F59, #665f59);
        text-align: right;
        font-family: Inter;
        font-size: 10px;
        font-style: normal;
        font-weight: 500;
        pointer-events: none;
      }
    }
  }
  .right {
    width: 23px;
    height: 27px;
    display: flex;
    flex-direction: column;

    .del {
      width: 13.81px;
      height: 13.81px;
      flex-shrink: 0;
    }
    .add {
      width: 13.81px;
      height: 13.81px;
      flex-shrink: 0;
    }
  }
}
</style>
