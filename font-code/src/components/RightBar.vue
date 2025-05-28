<template>
  <div class="right-container">
    <div class="sosoEarn">
      <div class="avatar">
        <img class="avatar1" src="/ui/Asset 1.svg" alt="" />
        <div class="text">sosoEARN</div>
        <img class="avatar2" src="/ui/Asset 73.svg" alt="" />
      </div>
      <div class="info">
        <div class="firstLine">
          <span>Ee7v…Rk</span>
          <img src="/ui/Asset 76.svg" alt="" />
          <img src="/ui/Asset 77.svg" alt="" />
          <img src="/ui/Asset 78.svg" alt="" />
          <img src="/ui/Asset 78.svg" alt="" />
          <div class="share">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="18"
              height="18"
              viewBox="0 0 18 18"
              fill="none"
            >
              <path
                d="M13.2732 11.1078C12.5064 11.1078 11.8224 11.4444 11.3418 11.9682L7.21622 9.5868C7.29542 9.3366 7.35122 9.0738 7.35122 8.7966C7.35122 8.5194 7.29722 8.2584 7.21622 8.0064L11.3418 5.625C11.8224 6.1506 12.5064 6.4872 13.2732 6.4872C14.7222 6.4872 15.8994 5.31 15.8994 3.861C15.8994 2.412 14.7222 1.2366 13.2732 1.2366C11.8242 1.2366 10.6488 2.4138 10.6488 3.861C10.6488 4.1382 10.7028 4.3992 10.7838 4.6494L6.65822 7.0308C6.17762 6.5052 5.49362 6.1704 4.72682 6.1704C3.27962 6.1704 2.10242 7.3476 2.10242 8.7966C2.10242 10.2456 3.27962 11.421 4.72682 11.421C5.49362 11.421 6.17762 11.0862 6.65822 10.5606L10.7838 12.942C10.7046 13.1922 10.6488 13.4532 10.6488 13.7304C10.6488 15.1776 11.826 16.3566 13.2732 16.3566C14.7204 16.3566 15.8994 15.1794 15.8994 13.7304C15.8994 12.2814 14.7222 11.106 13.2732 11.106V11.1078Z"
                fill="#665F59"
              />
            </svg>
          </div>
        </div>
        <div class="secondLine">
          <span class="smallText">7d Pnl</span>
          <span class="bigTextGreen">+1,238%</span>
          <span class="smallText">win Rate</span>
          <span class="bigText">78%</span>
        </div>
        <div class="thirdLine">
          <span class="smallText">Referral:</span>
          <img src="/ui/Asset 74.svg" alt="" />
          <span class="smallText bold">27</span>
          <span class="smallText">Rewards:</span>
          <img src="/ui/Asset 75.svg" alt="" />
          <span class="smallText bold">1.2815</span>
          <span class="smallText">Points:</span>
          <span class="smallText bold">128,870</span>
        </div>
      </div>
    </div>
    <div class="buy">
      <div class="buyTop">
        <div class="defaultButton selectButton">BUY</div>
        <div class="defaultButton">SELL</div>
      </div>
      <div class="buyContainer">
        <div class="buyNav">
          <a class="select" href="">BUY NOW</a>
          <a href="">BUY DIP</a>
        </div>
        <div class="selectWallet">
          <div class="selectWalletTop">
            <img class="wallet" src="/ui/Asset 79.svg" alt="" />
            <span class="text">Select Wallet</span>
            <img class="select" src="/ui/Asset 80.svg" alt="" />
          </div>
          <span class="text">BAL:12.2349 SOL</span>
        </div>
        <div class="price">
          <input type="text" placeholder="Input amount to buy in SOL" />
          <span>SOL</span>
          <img src="/ui/Asset27.svg" alt="" />
        </div>
        <div class="selectPrice">
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>0.05</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>0.10</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>0.25</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>0.50</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>1</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>2</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>5</span>
          </div>
          <div class="clickPrice">
            <img src="/ui/Asset27.svg" alt="" />
            <span>10</span>
          </div>
          <div class="mev">
            <span>
              <span class="opacity">MEV PROTECTION:</span>
              <span>ON</span>
            </span>
            <span>
              <span>0.018</span>
              <span class="opacity">:PRIORITY (SOL)</span>
            </span>
          </div>
          <div class="mev">
            <span>
              <span class="opacity">SLIPPAGE:</span>
              <span>Auto(<span class="red">30%</span>)</span>
            </span>
            <span>
              <span>0.012</span>
              <span class="opacity">:BRIBERY(SOL)</span>
            </span>
          </div>
        </div>
      </div>
      <div class="buySetting">
        <div class="setting">
          <img class="left" src="/ui/Asset 49.svg" alt="" />
          <span>Advanced Settings</span>
          <img class="right" src="/ui/Asset 80.svg" alt="" />
        </div>
        <!-- Advanced Settings组件  -->
        <div class="advanced">
          <div class="mev-container">
            <span class="text">MEV PROTECTION:</span>
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

          <div class="slippage-container">
            <span class="text">SLIPPAGE LIMIT:</span>
            <div class="button">
              <div class="input-wrapper">
                <input type="text" class="input" placeholder="input slippage limit" />
                <span class="unit">%</span>
              </div>
              <div class="custom">Custom your slippage limit</div>
            </div>
          </div>
          <div class="priority-container">
            <span class="text">PRIORITY FEE:</span>
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
            <div class="priority-button">
              <div class="default">DEFAULT</div>
              <div class="auto">AUTO</div>
              <div class="icon">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="12"
                  height="12"
                  viewBox="0 0 12 12"
                  fill="none"
                >
                  <circle cx="6" cy="6" r="6" fill="#B2A18F" />
                </svg>
              </div>
            </div>
          </div>
          <div class="speed-container">
            <div class="speed speed1">
              <div class="top">
                <span class="text1">speed</span>
                <span class="text2">x1</span>
              </div>
              <div class="bottom text3">0.002SOL</div>
            </div>
            <div class="speed speed5">
              <div class="top">
                <span class="text1">speed</span>
                <span class="text2">x5</span>
              </div>
              <div class="bottom text3">0.008SOL</div>
            </div>
            <div class="speed speed10">
              <div class="top">
                <span class="text1">speed</span>
                <span class="text2">x10 </span>
              </div>
              <div class="bottom text3">0.012SOL</div>
            </div>
            <div class="speed speed20">
              <div class="top">
                <span class="text1">speed</span>
                <span class="text2">x20</span>
              </div>
              <div class="bottom text3">0.018SOL</div>
            </div>
          </div>
          <div class="fee-container">
            <input type="text" />
            <div class="text">SOL</div>
          </div>
          <div class="customInfo">Custom your priority fee (Max: 0.2 SOL)</div>
          <div class="bribery-container">
            <span class="text">BRIBERY:</span>
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
            <div class="bribery-button">
              <div class="default">DEFAULT</div>
              <div class="auto">AUTO</div>
              <div class="icon">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="12"
                  height="12"
                  viewBox="0 0 12 12"
                  fill="none"
                >
                  <circle cx="6" cy="6" r="6" fill="#B2A18F" />
                </svg>
              </div>
            </div>
          </div>

          <div class="bribery-r">
            <div class="lower">
              <div>Lower</div>
              <div class="sol">0.006 SOL</div>
            </div>
            <div class="default">
              <div>Default</div>
              <div class="sol">0.012 SOL</div>
            </div>
            <div class="enter">
              <input type="text" />
              <div class="sol">SOL</div>
            </div>
          </div>
          <div class="bribery-info">Custom your bribery (Max: 0.2 SOL)</div>
        </div>
        <div class="setting">
          <img class="left" src="/ui/Asset 49.svg" alt="" />
          <span>Auto TP/SL Settings</span>
          <img class="right" src="/ui/Asset 80.svg" alt="" />
        </div>
        <div>
          <Adevanced></Adevanced>
        </div>
      </div>
      <div class="buyBottom">
        <a href="">
          <div class="buyButton">
            <img src="/ui/Asset 22.svg" alt="" />
            <span>BUY <span>0.25</span> SOL ($<span>46.28</span>)</span>
          </div>
        </a>
        <div class="warning">
          Once you click on <strong>BUY</strong> , your transaction is sent immediately.<br />
          And all above your <strong>TP/SL ORDERS</strong> will be created at the same time.
        </div>
      </div>
    </div>

    <SportLight class="sport-light" />
  </div>
</template>

<script setup>
import SportLight from './SportLight.vue';
</script>

<style lang="scss" scoped>
$darkColor: #181616;

input {
  border-radius: 4px;
  border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
  background: var(--sosal_Dark3_181616, #181616);
}
.right-container {
  margin: 8px;
}

.sosoEarn {
  height: 70px;
  background-color: $darkColor;
  margin-bottom: 8px;
  border-radius: 8px;
  display: flex;
}

.avatar {
  text-align: center;
  margin: 0 0 0 8px;
}

.avatar img {
  width: 64px;
  display: block;
  object-fit: cover;
}

.avatar .text {
  position: relative;
  z-index: 1;
  font-size: 12px;
  background: linear-gradient(45deg, #e319a7, #9804dc, #4404c3);
  -webkit-background-clip: text;
  background-clip: text;
  color: transparent;
  padding: 2px;
  top: -13px;
  font-weight: bold;
}

.avatar .text::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: -1;
  border-radius: 2px;
  mask:
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  mask-composite: exclude;
  padding: 1px;

  border: 0.4px solid transparent;
  border-image: linear-gradient(45deg, #e319a7, #9804dc, #4404c3) 1;
}

.avatar img.avatar2 {
  width: 15px;
  position: relative;
  top: -30px;
  left: 70px;
}

.info {
  border-radius: 0 8px 8px 0;
  padding: 8px;
  margin-left: 17px;
}

.info .firstLine {
  font-size: 12px;
  color: #fff;
  font-weight: bold;
  display: flex;
  gap: 4px;
  justify-content: space-between;
  align-items: end;
}

.firstLine img {
  height: 12px;
}

.info .firstLine .share {
  margin-right: 7px;
}

.smallText {
  font-size: 8px;
  color: #665f59;
}

.bigText {
  font-size: 18px;
  color: #665f59;
  font-weight: bold;
}

.bold {
  font-weight: bold;
  color: #b2a18f;
}

.bigTextGreen {
  font-size: 18px;
  color: #2bffbc;
  font-weight: bold;
}
.secondLine {
  font-size: 8px;
  display: flex;
  gap: 4px;
  margin-top: 4px;
}

.thirdLine {
  display: flex;
  font-size: 7px;
  justify-content: space-between;
  margin-top: 8px;
  white-space: nowrap;
}

.thirdLine img {
  height: 5px;
  vertical-align: middle;
  margin-top: 2px;
}
.buy {
  background-color: #181616;
  margin-bottom: 8px;
  border-radius: 8px;
  padding: 8px;
}
.buyTop {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 8px;
  margin-bottom: 8px;
}

.defaultButton {
  font-size: 14px;
  height: 38px;
  border: 0.4px solid #665f59;
  flex-grow: 1;
  text-align: center;
  color: #b2a18f;
  line-height: 38px;
  border-radius: 8px;

  color: var(--sosal_Lighten1_3D3935, #3d3935);
  text-align: center;
  font-family: Inter;
  font-size: 12px;
  font-weight: bold;
}

.buyNav a {
  color: var(--sosal_Lighten1_3D3935, #3d3935);
  font-family: Inter;
  font-size: 12px;
  font-style: normal;
  font-weight: 640;
  margin-right: 20px;
}

.buyNav a.select {
  color: var(--WhiteTextD1CDCB, #d1cdcb);
  font-family: Inter;
  font-size: 12px;
  font-weight: 640;
}

.selectButton {
  border-color: #ff8000;
  color: #ff8000;
  font-weight: bold;
}
.selectWallet {
  display: flex;
  border-radius: 4px;
  margin: 8px 0;
  justify-content: space-between;
  align-items: end;
}
.selectWalletTop {
  display: flex;
  justify-content: flex-start;
  align-items: center;
  gap: 5px;
  width: 150px;
  height: 27px;
  color: #b2a18f;
  border: 0.4px solid #665f59;
  line-height: 27px;
  border-radius: 4px;
}
.selectWalletTop .text {
  font-size: 12px;
}

span.text {
  color: var(--sosal_Lighten2_665F59, #665f59);
  text-align: right;
  font-family: Inter;
  font-size: 10px;
  font-style: normal;
  font-weight: 500;
  line-height: normal;
  text-transform: capitalize;
}

.selectWalletTop img {
  width: 13px;
}

.selectWalletTop .wallet {
  margin-left: 8px;
}
.selectWalletTop .select {
  margin-left: auto;
  margin-right: 5px;
}

.sport-light {
  background-color: #181616;
  border-radius: 8px;
}

.price {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border: 0.4px solid #665f59;
  border-radius: 4px;
  padding: 4px;
}
.price input {
  width: 230px;
  height: 27px;
  line-height: 27px;
  background-color: #181616;
  border: 0.4px solid #665f59;
  border-radius: 4px;
  color: #b2a18f;
  font-size: 12px;
  outline: none;

  border: 0;
  /* input默认文字样式设置 */
}

input::placeholder {
  color: #665f59;
  font-weight: normal;
  font-size: 12px;
  opacity: 0.4;
}

.price span {
  color: #b2a18f;
  font-size: 12px;
}

.price img {
  width: 20px;
  margin: 0 10px;
}

.selectPrice {
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 8px;
  flex-wrap: wrap;
}
.clickPrice {
  width: 70px;
  border: 0.4px solid #665f59;
  gap: 5px;
  padding: 8px;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  border-radius: 4px;
  color: #b2a18f;
  margin-bottom: 8px;
}

.clickPrice span {
  color: var(--sosal_Lighten3_B2A18F, #b2a18f);
  font-family: Inter;
  font-size: 10px;
  font-style: normal;
  font-weight: 500;

  text-transform: capitalize;
}

.selectPrice img {
  width: 18px;
}

.mev {
  width: 100%;
  display: flex;
  justify-content: space-between;

  color: var(--sosal_Lighten2_665F59, #665f59);
  font-family: Inter;
  font-size: 10px;
  font-weight: 300;
  text-transform: capitalize;

  margin-bottom: 6px;
}

.opacity {
  opacity: 0.4;
}

.mev .red {
  color: #e70089;
  font-weight: bold;
}

.mev span span {
  color: #b2a18f;
  margin: 2px;
}

.buySetting {
  .setting {
    span {
      color: var(--WhiteTextD1CDCB, #d1cdcb);
      font-family: Inter;
      font-size: 12px;
      font-style: normal;
      font-weight: 500;
      line-height: normal;
    }
  }
}

.advanced {
  margin-top: 15px;

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

    .info {
      margin-left: 4px;
      padding: 0;
    }
  }

  .slippage-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin: 12px 0;

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
      .input-wrapper {
        position: relative;
        display: block;
        align-items: center;

        input {
          width: 174px;
          height: 27px;
          padding: 0 30px 0 8px;
          line-height: 27px;
          font-size: 10px;
          padding-right: 30px;
          flex-shrink: 0;
          border-radius: 4px;
          border: 0.4px solid #665f59;
          background: #181616;
          box-sizing: border-box;
          vertical-align: middle;
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
            border: 1px solid transparent;
            background-clip: padding-box;
          }
        }

        span.unit {
          position: absolute;
          top: 50%;
          right: 7px;
          transform: translateY(-50%);
          color: #665f59;
          font-family: Inter;
          font-size: 10px;
          font-weight: 500;
          line-height: 27px;
        }
      }

      .custom {
        margin-top: 3px;
        color: #665f59;
        font-family: Inter;
        font-size: 7px;
        font-style: normal;
        font-weight: 300;
        line-height: normal;
        text-transform: capitalize;
      }
    }
  }

  .priority-container {
    display: flex;
    justify-content: flex-start;
    align-items: center;
    margin-top: 12px;

    .text {
      color: #665f59;
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 300;
      line-height: normal;
      text-transform: capitalize;
    }
    .info {
      margin: 0px 13px 0px 8px;

      padding: 0px;
    }

    .priority-button {
      display: flex;
      justify-content: start;
      position: relative;
      .info {
        margin-left: 8px;
      }
      .default {
        color: var(--sosal_Lighten1_3D3935, #3d3935);
        text-align: center;
        font-family: Inter;
        font-size: 6px;
        font-style: normal;
        font-weight: 500;
        line-height: 12px;
        width: 50px;
        height: 12px;
        flex-shrink: 0;
        border-radius: 6px;
        border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
        background: var(--sosal_Dark3_181616, #181616);
      }
      .auto {
        color: var(--sosal_Main_FF8000, #ff8000);
        text-align: center;
        font-family: Inter;
        font-size: 6px;
        font-style: normal;
        font-weight: 500;
        line-height: 12px;
        width: 50px;
        height: 12px;
        flex-shrink: 0;
        border-radius: 6px;
        border: 0.4px solid var(--sosal_Main_FF8000, #ff8000);
        background: var(--SelectedButton12-FF8000, rgba(255, 128, 0, 0.12));
        position: relative;
        left: -12px;
      }
      .icon {
        position: absolute;
        left: 38px;
      }
    }
  }

  .speed-container {
    display: flex;
    justify-content: space-between;
    margin: 8px 0;
    .speed {
      width: 62.5px;
      height: 27px;

      border-radius: 4px;
      border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Dark3_181616, #181616);
      text-align: center;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      .top {
        display: flex;
        gap: 2px;
      }

      .text1 {
        color: var(--sosal_Lighten2_665F59, #665f59);
        font-family: Inter;
        font-size: 8px;
        font-style: normal;
        font-weight: 300;
        line-height: normal;
      }
      .text2 {
        color: var(--sosal_Lighten3_B2A18F, #b2a18f);
        font-family: Inter;
        font-size: 8px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
      }
      .text3 {
        color: var(--sosal_Lighten2_665F59, #665f59);
        font-family: Inter;
        font-size: 8px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
      }
    }
  }

  .fee-container {
    display: flex;
    align-items: center;
    position: relative;
    input {
      width: 100%;
      height: 27px;
      color: var(--WhiteTextD1CDCB, #d1cdcb);
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 640;
      line-height: normal;
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
        border: 1px solid transparent;
        background-clip: padding-box;
      }
    }

    div {
      position: absolute;
      right: 7px;

      color: var(--sosal_Lighten2_665F59, #665f59);
      text-align: right;
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 500;
      line-height: normal;
    }
  }
  .customInfo {
    color: var(--sosal_Lighten2_665F59, #665f59);
    font-family: Inter;
    font-size: 7px;
    font-style: normal;
    font-weight: 300;
    line-height: normal;
    text-transform: capitalize;
    margin-top: 4px;
    margin-bottom: 11px;
  }
  .bribery-container {
    display: flex;
    justify-content: flex-start;
    align-items: center;
    margin-top: 12px;

    .text {
      color: #665f59;
      font-family: Inter;
      font-size: 10px;
      font-style: normal;
      font-weight: 300;
      line-height: normal;
      text-transform: capitalize;
    }
    .info {
      margin: 0px 39px 0px 8px;

      padding: 0px;
    }

    .bribery-button {
      display: flex;
      justify-content: start;
      position: relative;
      .info {
        margin-left: 8px;
      }
      .default {
        color: var(--sosal_Lighten1_3D3935, #3d3935);
        text-align: center;
        font-family: Inter;
        font-size: 6px;
        font-style: normal;
        font-weight: 500;
        line-height: 12px;
        width: 50px;
        height: 12px;
        flex-shrink: 0;
        border-radius: 6px;
        border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
        background: var(--sosal_Dark3_181616, #181616);
      }
      .auto {
        color: var(--sosal_Main_FF8000, #ff8000);
        text-align: center;
        font-family: Inter;
        font-size: 6px;
        font-style: normal;
        font-weight: 500;
        line-height: 12px;
        width: 50px;
        height: 12px;
        flex-shrink: 0;
        border-radius: 6px;
        border: 0.4px solid var(--sosal_Main_FF8000, #ff8000);
        background: var(--SelectedButton12-FF8000, rgba(255, 128, 0, 0.12));
        position: relative;
        left: -12px;
      }
      .icon {
        position: absolute;
        left: 38px;
      }
    }
  }

  .bribery-r {
    display: flex;
    justify-content: space-between;
    margin-top: 11px;
    margin-bottom: 4px;
    .lower {
      width: 62.5px;
      height: 27px;
      flex-shrink: 0;

      border-radius: 4px;
      border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Dark3_181616, #181616);
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      div {
        color: var(--sosal_Lighten2_665F59, #665f59);
        font-family: Inter;
        font-size: 8px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
      }
    }
    .default {
      width: 62.5px;
      height: 27px;
      flex-shrink: 0;
      border-radius: 4px;
      border: 0.4px solid var(--sosal_Lighten2_665F59, #665f59);
      background: var(--sosal_Dark3_181616, #181616);

      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      div {
        color: var(--sosal_Lighten2_665F59, #665f59);
        text-align: center;
        font-family: Inter;
        font-size: 8px;
        font-style: normal;
        font-weight: 300;
        line-height: normal;
      }
      & div:nth-child(2) {
        color: var(--sosal_Lighten3_B2A18F, #b2a18f);
        font-family: Inter;
        font-size: 8px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
      }
    }
    .enter {
      display: flex;
      justify-content: center;
      align-items: center;
      position: relative;
      input {
        width: 134px;
        height: 27px;
        color: var(--WhiteTextD1CDCB, #d1cdcb);
        font-family: Inter;
        font-size: 10px;
        font-style: normal;
        font-weight: 640;
        line-height: normal;
        color: #d1cdcb;
        padding-left: 8px;
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
          border: 1px solid transparent;
          background-clip: padding-box;
        }
      }
      .sol {
        position: absolute;
        right: 7px;
        color: var(--sosal_Lighten2_665F59, #665f59);
        text-align: right;
        font-family: Inter;
        font-size: 10px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
      }
    }
  }

  .bribery-info {
    color: var(--sosal_Lighten2_665F59, #665f59);
    font-family: Inter;
    font-size: 7px;
    font-style: normal;
    font-weight: 300;
    line-height: normal;
    text-align: end;
    padding-right: 16px;
  }
}

.setting {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-top: 0.4px solid rgba(178, 161, 143, 0.4);
  border-bottom: 0.4px solid rgba(178, 161, 143, 0.4);
  margin: 4px 0;
  padding: 8px 0;
  color: white;
  font-weight: bold;
  font-size: 12px;
}

.setting img {
  width: 15px;
}

.setting img.left {
  margin-right: 8px;
}
.setting img.right {
  margin-left: auto;
}

.buyButton {
  width: 80%;
  height: 40px;
  background-color: #ff8000;
  display: flex;
  justify-content: center;
  align-items: center;
  border-radius: 8px;
  margin: 20px auto;
}

a {
  text-decoration: none;
}

.buyButton img {
  width: 15px;
  vertical-align: middle;
  margin-right: 5px;
}
.buyButton span {
  color: white;
  font-weight: bold;
  font-size: 14px;
}

.warning {
  padding: 0 12px;
  color: #ff8000;
  font-size: 8px;
  text-align: center;
  margin-bottom: 10px;
}

div strong {
  font-weight: bold;
}
</style>
