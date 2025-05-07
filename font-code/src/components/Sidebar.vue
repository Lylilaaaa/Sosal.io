<template>
  <div class="sidebar-container">
    <div class="darkBg">
      <!-- 货币信息区域 -->
      <div class="coin-profile">
        <img src="/ui/Asset 33.svg" alt="" />
        <div class="coin-av">
          <div class="coin-name">
            $ABCDE
            <span>Full Name</span>
          </div>
          <div class="coin-address">
            <span>8vqG...Abcd</span>
            <img src="/ui/Asset 9.svg" alt="" />
            <img src="/ui/Asset 13.svg" alt="" />
            <img src="/ui/Asset 12.svg" alt="" />
            <img src="/ui/Asset 11.svg" alt="" />
            <img src="/ui/Asset 10.svg" alt="" />
          </div>
          <div class="bit">
            <img src="/ui/Asset27.svg" alt="" />
            <span>SOL</span>
            <span>></span>
            <img src="/ui/Asset 25.svg" alt="" />
            <img src="/ui/Asset 24.svg" alt="" />
            <span>Raydium</span>
            <div>AMM</div>
          </div>
        </div>
        <div class="icon">
          <img src="/ui/Asset 54.svg" alt="" />
          <img src="/ui/Asset 55.svg" alt="" />
          <img src="/ui/Asset 57.svg" alt="" />
        </div>
      </div>
      <div class="shrink">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="15"
          height="20"
          viewBox="0 0 15 20"
          fill="none"
        >
          <path
            d="M0 4C0 1.79086 1.79086 0 4 0H15V20H4C1.79086 20 0 18.2091 0 16V4Z"
            fill="#FF8000"
          />
          <path
            d="M10.8326 15.6896C11.0558 15.4665 11.0558 15.1036 10.8326 14.8805L6.3798 10.4293L10.8326 5.97651C11.0558 5.75335 11.0558 5.39052 10.8326 5.16736C10.6095 4.94421 10.2466 4.94421 10.0235 5.16736L5.16694 10.0239C5.05962 10.1312 5 10.276 5 10.4293C5 10.5827 5.05962 10.7274 5.16694 10.8348L10.0235 15.6913C10.2466 15.9145 10.6095 15.9145 10.8326 15.6913V15.6896Z"
            fill="#181616"
          />
        </svg>
      </div>

      <!-- 进度条 -->
      <div class="progress-container">
        <span>100%</span>
        <div class="progress-bar orange-bar"></div>
      </div>

      <!-- Quick Explore -->
      <div class="quick-Exp">
        <div class="quick-Exp-title">
          <span>Quick Explore</span>
          <SvgIcon class="icon" name="sodian"></SvgIcon>
        </div>
        <div class="quick-Exp-right">
          <div class="right-item ticker">Ticker</div>
          <div class="right-item cs">CA</div>
          <div class="right-item f100">F100</div>
          <div class="right-item bubble">Bubble</div>
        </div>
      </div>

      <!-- 警告提示区 -->
      <div class="warning-section">
        <img src="/ui/Asset 62.svg" alt="" />
        <div class="warning-text">WARNINGS !!! RISK CHECK FAIL</div>
        <div class="warning-icon">▼</div>
      </div>
    </div>
    <div class="lightBg">
      <!-- 价格信息区 -->
      <div class="price-section">
        <div class="price-box">
          <div class="price-label">PRICE (SOL)</div>
          <div class="price-value">0.0001436 SOL</div>
        </div>
        <div class="price-box priceBoxR">
          <div class="price-label">PRICE (USD)</div>
          <div class="price-value">$0.02764</div>
        </div>
      </div>

      <!-- 交易数据区 -->
      <div class="trading-data">
        <div class="data-row">
          <div class="data-box">
            <div class="data-label">FDV</div>
            <div class="data-value">$1.73B</div>
          </div>
          <div class="data-box">
            <div class="data-label">LIQUIDITY</div>
            <div class="data-value">$20.8M</div>
          </div>
          <div class="data-box">
            <div class="data-label">MKT CAP</div>
            <div class="data-value">$1.73B</div>
          </div>
        </div>

        <!-- 时间交易数据 -->
        <div class="time-stats">
          <div class="time-stat">
            <div class="time-label">5M</div>
            <div class="time-value positive">+138%</div>
          </div>
          <div class="time-stat time-select">
            <div class="time-label">1H</div>
            <div class="time-value negative">-684%</div>
          </div>
          <div class="time-stat">
            <div class="time-label">6H</div>
            <div class="time-value positive">+2451%</div>
          </div>
          <div class="time-stat">
            <div class="time-label">24H</div>
            <div class="time-value positive">+6187%</div>
          </div>
        </div>
        <!-- 百分比图 -->
        <div class="data-down">
          <div class="left">
            <div class="volume-box">
              <div class="volume-label">VOLUME</div>
              <div class="volume-value">$1.73B</div>
            </div>
            <div class="txns-box">
              <div class="txns-label">Txns</div>
              <div class="txns-value">84.0K</div>
            </div>
            <div class="makers-box">
              <div class="makers-label">MAKERS</div>
              <div class="makers-value">7.04K</div>
            </div>
          </div>
          <div class="downright">
            <div class="double">
              <div class="volume-box">
                <div class="volume-label">BUY Vol.</div>
                <div class="volume-value">$1.55M</div>
              </div>
              <div class="txns-box">
                <div class="txns-label label-aline">SELL VOL</div>
                <div class="txns-value label-aline">$1.55M</div>
              </div>
            </div>

            <div class="volume-progress">
              <div class="buy-progress"></div>
              <div class="sell-progress"></div>
            </div>
            <div class="double">
              <div class="txns-box">
                <div class="txns-label">BUYS</div>
                <div class="txns-value">6.11K</div>
              </div>
              <div class="txns-box">
                <div class="txns-label label-aline">SELLS</div>
                <div class="txns-value label-aline">2.29K</div>
              </div>
            </div>

            <div class="txns-progress">
              <div class="buy-progress"></div>
              <div class="sell-progress"></div>
            </div>
            <div class="double">
              <div class="makers-box">
                <div class="makers-label">BUYERS</div>
                <div class="makers-value">4.06K</div>
              </div>
              <div class="makers-box">
                <div class="makers-label label-aline">SELLERS</div>
                <div class="makers-value label-aline">2.98K</div>
              </div>
            </div>

            <div class="makers-progress">
              <div class="buy-progress"></div>
              <div class="sell-progress"></div>
            </div>
          </div>
          <div class="line"></div>
        </div>

        <div class="pair-section">
          <div class="pair-box">
            <div class="pair-label">PAIR AGE</div>
            <div class="pair-value">2d 21h ago</div>
          </div>
          <div class="pair-box align-center">
            <div class="pair-label">TOTAL SUPPLY</div>
            <div class="pair-value">1B</div>
          </div>
          <div class="pair-box align-right">
            <div class="pair-label">HOLDERS</div>
            <div class="pair-value">2,369</div>
          </div>
        </div>

        <div class="pooled-section">
          <div class="left">
            <div class="pooled-label">POOLED</div>
            <div class="pooled-token">SOL</div>
            <div class="pooled-token">$ABCDE</div>
          </div>
          <div class="center align-center">
            <div class="pooled-label">LIQ/INIT.LIQ</div>
            <div class="pooled-value">36.56K / 79.01 (+<span class="positive">99K%</span>)</div>
            <div class="pooled-value">261.3M / 200.8M (20.02%)</div>
          </div>

          <div class="right align-right">
            <div class="pooled-label">HOLDERS</div>
            <div class="pooled-usd">$816.5M</div>
            <div class="pooled-usd">$816.5M</div>
          </div>
        </div>

        <div class="address-section">
          <div class="address-row">
            <div class="address-label">PIRE ADDRESS</div>
            <div class="address-value">8VqG...pump</div>
            <div class="address-icon">
              <img src="/ui/Asset 9.svg" alt="" /><span>EXP</span
              ><img src="/ui/Asset 58.svg" alt="" />
            </div>
          </div>
          <div class="address-row">
            <div class="address-label">CONTRACT ADDRESS</div>
            <div class="address-value">8VqG...pump</div>
            <div class="address-icon">
              <img src="/ui/Asset 9.svg" alt="" /><span>EXP</span
              ><img src="/ui/Asset 58.svg" alt="" />
            </div>
          </div>
        </div>

        <!-- 风险检查区 -->
        <div class="risk-section">
          <div class="risk-header">
            <div class="risk-check"><img src="/ui/Asset 20.svg" alt="" />RISK CHECKED / AUDIT</div>
            <div class="risk-score">⚠ 4/5</div>
          </div>

          <div class="risk-row">
            <div class="risk-label">MINT AUTHORITY <img src="/ui/Asset 64.svg" alt="" /></div>
            <div class="risk-value enabled">ENabled</div>
          </div>
          <div class="risk-row">
            <div class="risk-label">FREEZE AUTHORITY<img src="/ui/Asset 64.svg" alt="" /></div>
            <div class="risk-value enabled">ENabled</div>
          </div>
          <div class="risk-row">
            <div class="risk-label">LP BURNED / LOCKED<img src="/ui/Asset 64.svg" alt="" /></div>
            <div class="risk-value">0%</div>
          </div>
          <div class="risk-row">
            <div class="risk-label">TOP 10 HOLDERS<img src="/ui/Asset 64.svg" alt="" /></div>
            <div class="risk-value">75.1%</div>
          </div>
          <div class="risk-row">
            <div class="risk-label">LP CREATOR<img src="/ui/Asset 64.svg" alt="" /></div>
            <div class="risk-value">8VqG...pump<img src="/ui/Asset 9.svg" alt="" /></div>
          </div>
          <div class="risk-row">
            <div class="risk-label">
              DEV / DEPLOYER ADDRESS<img src="/ui/Asset 64.svg" alt="" />
            </div>
            <div class="risk-value">8VqG...pump<img src="/ui/Asset 9.svg" alt="" /></div>
          </div>
          <div class="risk-row">
            <div class="risk-label">
              DEV / DEPLOYER BALANCE<img src="/ui/Asset 64.svg" alt="" />
            </div>
            <div class="risk-value zero">0%</div>
          </div>
        </div>
      </div>

      <!-- 分享按钮 -->
      <div class="share-button">
        <!-- 图标占位 -->
      </div>
    </div>
  </div>
</template>

<script setup>
/**
 * 侧边栏组件 - 显示代币详细信息及市场数据
 * 功能包括：
 * 1. 代币基本信息展示
 * 2. 实时价格显示
 * 3. 市场数据可视化
 * 4. 流动性池信息
 * 5. 风险检查面板
 */
// 组件逻辑可以在这里添加

// 示例数据
// const tokenData = {}

fetch('/api/api/coins/getAll') // 改为相对路径，由Vite代理
  .then((response) => response.json())
  .then((data) => console.log(data));
</script>

<style lang="scss" scoped>
/* 货币区域样式 */
.coin-profile {
  display: flex;
  width: 100%;
  height: 64px;
}
.darkBg {
  background-color: $darkColor;
  padding: 8px 12px 0 12px;
  border-radius: 12px 12px 0 0;
  position: relative;
  .shrink {
    position: absolute;
    top: 30px;
    right: 0;
  }
}

.lightBg {
  background-color: $mainColorT;
  padding: 10px 12px;
}
.coin-profile img {
  width: 54px;
  height: 54px;
  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
  cursor: pointer;
}
.coin-profile img:hover {
  transform: scale(1.05);
  filter: brightness(1.2);
}
.sidebar-container {
  margin: 8px;

  background-color: #181616;
  border-radius: 8px;
}
div .coin-name {
  display: flex;
  align-items: flex-end;
  gap: 6px;

  font-weight: bold;
  color: var(--WhiteTextD1CDCB, #d1cdcb);
  font-family: Inter;
  font-size: 16px;
  font-style: normal;
  font-weight: 640;
  line-height: 16px;
  text-transform: capitalize;
  margin-bottom: 5px;
  cursor: pointer;
  transition:
    color 0.2s ease,
    text-shadow 0.2s ease;
}

.coin-name:hover {
  color: #ff9d00;
  text-shadow: 0 0 8px rgba(255, 157, 0, 0.4);
}
div .coin-name span {
  color: var(--sosal_Lighten2_665F59, #665f59);
  font-family: Inter;
  font-size: 10px;
  font-style: normal;
  font-weight: 640;
  line-height: normal;
  text-transform: capitalize;
}
.coin-av {
  flex: 1 1 auto;
  margin-left: 5px;
}

.coin-address {
  display: flex;
  gap: 2px;
  width: 143px;
  align-items: flex-end;
}

.coin-address span {
  font-size: 10px;
  color: #b2a18f;
  cursor: pointer;
  transition:
    color 0.2s ease,
    text-decoration 0.2s ease;
}

.coin-address span:hover {
  color: #ffffff;
  text-decoration: underline;
}

.coin-address img {
  width: 12px;
  height: 12px;
  margin-right: 4px;
  cursor: pointer;

  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
}

.coin-address img:hover {
  transform: scale(1.2);
  filter: brightness(1.5);
}

.icon {
  display: flex;
  width: 40px;
  flex-wrap: wrap;
  align-items: flex-start;
  justify-content: flex-end;
  margin-right: 10px;
  gap: 5px;
}

.icon img {
  width: 15px;
  height: 15px;
  margin: 0.5px;
  cursor: pointer;
  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
}

.icon img:hover {
  transform: scale(1.2);
  filter: brightness(1.5);
}

.icon img:last-child {
  margin-top: -15px;
}

.bit {
  display: flex;
  align-items: center;
  gap: 2px;
  margin-top: 4px;
  color: #d1cdcb;
}
.bit img {
  width: 15px;
  height: 15px;
  cursor: pointer;
  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
}

.bit img:hover {
  transform: scale(1.1);
  filter: brightness(1.3);
}
.bit span {
  font-size: 12px;
}
.bit span:nth-child(3) {
  margin-top: -2px;
}
.bit img:nth-child(5) {
  margin-left: -5px;
}
.bit div {
  margin-left: 2px;
  font-size: 8px;
  color: #665f59;
  border-radius: 4px;
  padding: 3px;
  border: 1px solid #665f59;
  cursor: pointer;
  transition:
    background-color 0.2s ease,
    color 0.2s ease;
}

.bit div:hover {
  background-color: #b2a18f;
  color: #181616;
}

/* 进度条样式 */
.progress-container {
  height: 6px;
  display: flex;
  font-size: 10px;
  color: #b2a18f;
  align-items: center;
  margin-bottom: 10px;
}
.progress-container span {
  margin: 10px;
}
.progress-bar {
  width: 260px;
  height: 6px;
  background-color: #ff6b00;
  border-radius: 3px;
  position: relative;
}

.progress-text {
  position: absolute;
  left: 5px;
  top: -7px;
  font-size: 10px;
  color: #d1cdcb;
}

.orange-bar {
  background: linear-gradient(90deg, #ff6b00, #ff9d00);
}

/* Quick Explore 区域 */
.quick-Exp {
  display: flex;
  justify-content: space-between;
  width: 100%;
  padding: 8px 0;
  border-top: 0.4px solid #665f59;

  .quick-Exp-title {
    color: #665f59;
    font-family: Inter;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 10px;
    font-weight: 300;
    line-height: normal;
    text-transform: capitalize;
    border-right: 0.4px solid #665f59;

    .icon {
      width: 15px;
      height: 15px;
      flex-shrink: 0;
      aspect-ratio: 1/1;
      margin: 0 5px;
    }
  }
  .quick-Exp-right {
    display: flex;
    justify-content: space-between;

    align-items: center;
    font-size: 10px;
    color: #b2a18f;
    .right-item {
      text-align: center;
      width: 46px;
      height: 22px;
      line-height: 22px;
      border-right: 0.4px solid #665f59;
    }
  }
}

/* 警告区域样式 */
.warning-section {
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: rgba(255, 0, 0, 0.2);
  color: rgba(255, 153, 153, 1);
  font-size: 12px;
  margin: 0 -12px;
  height: 28px;
  cursor: pointer;
  transition:
    background-color 0.3s ease,
    color 0.3s ease;
}

.warning-section:hover {
  background-color: #ff3333;
  color: #ffffff;
}

.warning-section img {
  width: 16px;
  margin-right: 5px;
}

/* 价格信息区域样式 */
.price-section {
  height: 38px;
  display: flex;
  gap: 5px;
  margin-bottom: 5px;
}

.price-box {
  flex: 1;
  background-color: $mainColor;
  border: 0.4px solid #665f59;
  border-radius: 8px 4px 4px 4px;
  color: #d1cdcb;
  display: flex;
  flex-direction: column;
  justify-content: center;
  text-align: center;
  padding: 4px 0;
}
.priceBoxR {
  border-radius: 4px 8px 4px 4px;
}

.price-label {
  font-size: 10px;
  color: #665f59;
  height: 10px;
  margin-bottom: 3px;
  line-height: 10px;
}

.price-value {
  font-size: 12px;
  line-height: 12px;
}

/* 交易数据区域样式 */
.trading-data {
  display: flex;
  flex-direction: column;
  font-size: 12px;
  color: #d1cdcb;
  gap: 5px;
}

.data-row {
  display: flex;
  gap: 5px;
}

.data-box {
  flex: 1;

  height: 38px;
  border: 0.4px solid #665f59;
  border-radius: 5px;
  padding: 4px 6px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 5px;
}

.data-label {
  font-size: 10px;
  color: #665f59;
}

.data-value {
  font-size: 12px;
}

/* 时间统计区域样式 */
.time-stats {
  display: flex;
  border: 0.4px solid #665f59;
  border-radius: 5px 5px 0 0;
}

.time-stat {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  height: 38px;
  text-align: center;
  border-right: 0.4px solid #665f59;
}

.time-stat.time-select {
  background-color: #242021;
}

.time-stat:last-child {
  border-right: none;
}

.time-label {
  font-size: 10px;
  color: #665f59;
  margin-bottom: 2px;
}

.time-value {
  font-size: 12px;
  font-weight: bold;
}

.data-down {
  border: 0.4px solid #665f59;
  border-top: none;
  margin-top: -5px;
  padding: 12px;
  display: flex;
  border-radius: 0 0 5px 5px;
  position: relative;
  justify-content: space-between;
}
.line {
  position: absolute;
  border-left: 0.4px solid #665f59;
  height: 80%;
  top: 50%;
  left: 30%;
  transform: translateY(-50%);
}

.left {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.downright {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  margin-left: auto;
  gap: 5px;
}
.center {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  gap: 5px;
}
.right {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.double {
  display: flex;
  justify-content: space-between;
}

.volume-label,
.txns-label,
.makers-label {
  font-size: 10px;
  color: #665f59;
  margin-bottom: 5px;
}

.label-aline {
  text-align: right;
}

.positive {
  color: #2bffbc;
}

.negative {
  color: #e70089;
}

.volume-progress,
.txns-progress,
.makers-progress {
  height: 4px;
  display: flex;
  margin-top: 5px;
  border-radius: 2px;
}

.buy-progress {
  width: 110px;
  background-color: #2bffbc;
  margin-right: 2px;
  border-radius: 2px;
}

.sell-progress {
  width: 50px;
  background-color: #e70089;
  border-radius: 2px;
}

/* 配对信息区域样式 */
.pair-section {
  display: flex;
  margin: 8px 0;
  justify-content: space-between;
}

.pair-label {
  font-size: 10px;
  color: #665f59;
  margin-bottom: 5px;
}

.pair-value {
  font-size: 12px;
  font-weight: bold;
}

.align-right {
  text-align: right;
}
.align-center {
  text-align: center;
}

/* 池子信息区域样式 */
.pooled-section {
  display: flex;
  justify-content: space-between;
  margin-bottom: 5px;
}

.pooled-label {
  font-size: 9px;
  color: #665f59;
  margin-bottom: 2px;
}

.pooled-token {
  font-size: 12px;
  font-weight: bold;
}

.pooled-value {
  font-size: 10px;
  color: #d1cdcb;
}

.pooled-usd {
  font-size: 12px;
  font-weight: bold;
}

/* 地址信息区域样式 */
.address-section {
  margin-bottom: 8px;
}

.address-row {
  display: flex;
  margin-bottom: 4px;
}

.address-row img {
  width: 10px;
  cursor: pointer;
  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
}
.address-row img:hover {
  transform: scale(1.2);
  filter: brightness(1.5);
}
.address-row span {
  font-size: 10px;
  color: #665f59;
  margin: 0 5px;
  cursor: pointer;
  transition: color 0.2s ease;
}
.address-row span:hover {
  color: #ffffff;
}

.address-label {
  width: 100px;
  font-size: 10px;
  color: #665f59;
  flex: 1;
}

.address-value {
  font-size: 10px;
  color: #b2a18f;
  cursor: pointer;
  transition:
    color 0.2s ease,
    text-decoration 0.2s ease;
}

.address-value:hover {
  color: #ffffff;
  text-decoration: underline;
}

.address-icon {
  display: flex;
  font-size: 10px;
  color: #665f59;
  margin: 0 5px;
  justify-content: flex-end;
  position: relative;
  right: -5px;
}

/* 风险检查区域样式 */
.risk-section {
  margin-bottom: 8px;
}

.risk-section img {
  width: 12px;
  margin-right: 5px;
  cursor: pointer;
  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
}

.risk-section img:hover {
  transform: scale(1.2);
  filter: brightness(1.5);
}

.risk-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 5px;
}

.risk-check {
  display: flex;
  align-items: center;
  font-size: 12px;
  font-weight: bold;
  color: #2bffbc;
}

.risk-score {
  font-size: 12px;
  color: #f4ea63;
}

.risk-row {
  display: flex;
  justify-content: space-between;
  margin-bottom: 5px;
}

.risk-label {
  display: flex;
  font-size: 9px;
  color: #665f59;
}

.risk-label img {
  width: 8px;
  margin-left: 5px;
}

.risk-value {
  display: flex;
  font-size: 9px;
  font-weight: bold;
}
.risk-value img {
  width: 8px;
  margin-left: 5px;
  position: relative;
  right: -5px;
  cursor: pointer;
  transition:
    transform 0.2s ease,
    filter 0.2s ease; /* 交互动效配置 */
}

.risk-value img:hover {
  transform: scale(1.2);
  filter: brightness(1.5);
}

.risk-value.enabled {
  color: #f44336;
  cursor: pointer;
  transition:
    color 0.2s ease,
    text-shadow 0.2s ease;
}

.risk-value.enabled:hover {
  color: #ff6b6b;
  text-shadow: 0 0 5px rgba(244, 67, 54, 0.5);
}

.risk-value.zero {
  color: #2bffbc;
  cursor: pointer;
  transition:
    color 0.2s ease,
    text-shadow 0.2s ease;
}

.risk-value.zero:hover {
  color: #2bffbc;
  text-shadow: 0 0 5px rgba(76, 175, 80, 0.5);
}

/* 分享按钮样式 */
.share-button {
  display: flex;
  justify-content: flex-end;
  margin-bottom: 5px;
  height: 20px;
  cursor: pointer;
  transition: transform 0.2s ease;
}

.share-button:hover {
  transform: scale(1.05);
}
</style>
