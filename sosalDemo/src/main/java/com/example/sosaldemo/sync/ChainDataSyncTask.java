package com.example.sosaldemo.sync;


import com.example.sosaldemo.entity.CoinInfo;
import com.example.sosaldemo.mapper.CoinInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ChainDataSyncTask {
    @Autowired
    private CoinInfoMapper coinInfoMapper;

//    @Scheduled(fixedRate = 10000) // 每10秒执行一次
//    public void syncDataFromChain() {
//        // TODO: 实际调用 Helius API 获取链上数据
//        System.out.println("Syncing data from chain...");
//
//        // 示例：构造假数据
//        CoinInfo coin = new CoinInfo();
//        coin.setAddress("FakeAddress123");
//        coin.setCoinNameSimple("SOSAL");
//        coin.setCoinNameFull("Sosal Protocol");
//        coin.setXlink("https://x.com/fake");
//        coin.setWebLink("https://sosal.io");
//
//        coinInfoMapper.insertCoinInfo(coin);
//    }
}
