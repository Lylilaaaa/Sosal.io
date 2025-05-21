package com.example.sosaldemo.service;

import com.example.sosaldemo.entity.CoinInfo;
import com.example.sosaldemo.mapper.CoinInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinInfoService {

    @Autowired
    private CoinInfoMapper coinInfoMapper;

    public List<CoinInfo> getAllCoins() {
        return coinInfoMapper.getAllCoinInfo();
    }

    public void addCoin(CoinInfo coinInfo) {
        coinInfoMapper.insertCoinInfo(coinInfo);
    }
}
