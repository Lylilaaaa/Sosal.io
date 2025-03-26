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
          <img class="share" src="/ui/Asset 57.svg" alt="" />
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
          <span class="smallText">Fees Rebat:</span>
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
      <div class="buySetting"></div>
      <div class="buyBottom"></div>
    </div>

    <div class="sportLight"></div>
  </div>
</template>

<script setup></script>

<style scoped>
.right-container {
  margin: 8px;
}

.sosoEarn {
  height: 70px;
  background-color: #141212;
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

  border: 1px solid transparent;
  border-image: linear-gradient(45deg, #e319a7, #9804dc, #4404c3) 1;
}

.avatar img.avatar2 {
  width: 15px;
  position: relative;
  top: -30px;
  left: 70px;
}

.info {
  flex: auto;
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
  height: 16px;
  flex: auto;
  margin-left: auto;
  flex-grow: 0;
}

.smallText {
  font-size: 8px;
  color: #b2a18f;
}

.bigText {
  font-size: 18px;
  color: #b2a18f;
  font-weight: bold;
}

.bold {
  font-weight: bold;
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
  gap: 3px;
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
  border: 1px solid #b2a18f;
  flex-grow: 1;
  text-align: center;
  color: #b2a18f;
  line-height: 38px;
  border-radius: 8px;
  /* font-weight: bold; */
}

.buyNav a {
  font-size: 12px;
  color: white;
  text-decoration: none;
  margin-right: 20px;
}

.buyNav a.select {
  font-weight: bold;
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
  border: 1px solid #b2a18f;
  line-height: 27px;
  border-radius: 4px;
}
.selectWalletTop .text {
  font-size: 12px;
}

span.text {
  font-size: 10px;
  color: #b2a18f;
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

.sportLight {
  background-color: #181616;
  border-radius: 8px;
}

.price {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border: 1px solid #b2a18f;
  border-radius: 4px;
  padding: 4px;
}
.price input {
  width: 230px;
  height: 27px;
  background-color: #181616;
  border: 1px solid #b2a18f;
  border-radius: 4px;
  color: #b2a18f;
  font-size: 12px;
  outline: none;
  border: 0;
  /* input默认文字样式设置 */
}

input::placeholder {
  color: #b2a18f;
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
  border: 1px solid #b2a18f;
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
  font-size: 12px;
}
.selectPrice img {
  width: 18px;
}

.mev {
  width: 100%;
  display: flex;
  justify-content: space-between;
  font-size: 12px;
  color: #b2a18f;

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
</style>
