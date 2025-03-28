<template>
  <div class="sportLight">
    <div class="nav">
      <img src="/ui/Asset 83.svg" alt="" />
      <a><img src="@/assets/Asset16.svg" alt="" /><span>SportLight</span></a>
      <a>Trending</a>
    </div>
    <div class="time">
      <div>5M</div>
      <div>1H</div>
      <div>6H</div>
      <div>24</div>
    </div>
    <div class="order">
      <div class="token-vol">
        <span class="token">Token</span>|
        <span class="vol">Vol</span>
        <img src="/ui/Asset 92.svg" alt="" />
      </div>
      <div class="price-change">
        <img src="/ui/Asset 92.svg" alt="" />
        <span class="price">Price</span>| <span class="change">Change</span>%
      </div>
    </div>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped>
.sportLight {
  .nav {
    display: flex;
    align-items: center;
    justify-content: flex-start;
    gap: 10px;
    padding: 8px;
    a {
      font-size: 12px;
      color: $textColor;
      font-weight: bold;
      display: flex;
      align-items: center;
      gap: 4px;
      img {
        width: 10px;
      }
      span {
        color: white;
        font-weight: bold;
      }
    }
    img {
      width: 14px;
    }
  }
}
.time {
  display: flex;
  justify-content: flex-start;
  align-items: center;
  margin: 0 8px;
  gap: 4px;
  div {
    width: 18px;
    height: 18px;
    border: 1px solid $lightColor;
    border-radius: 3px;
    background-color: #282623;
    color: $lightColor;
    font-size: 9px;
    line-height: 18px;
    text-align: center;
    &:hover {
      background-color: $mainColor;
      color: white;
    }
  }
}
.order {
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-size: 10px;
  color: $lightColor;
  border-bottom: 1px solid $lightColor;
  margin: 8px;
  padding: 0 0 4px 0;

  .token-vol {
    display: flex;
    justify-content: flex-start;
    align-items: center;
    gap: 5px;

    img {
      width: 8px;
    }
  }
  .price-change {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    gap: 5px;

    img {
      width: 8px;
    }
  }
}
</style>
