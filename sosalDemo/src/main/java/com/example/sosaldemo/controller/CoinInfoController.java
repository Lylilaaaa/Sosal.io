package com.example.sosaldemo.controller;

import com.example.sosaldemo.entity.CoinInfo;

import com.example.sosaldemo.service.CoinInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coins")
public class CoinInfoController {

    @Autowired
    private CoinInfoService coinInfoService;

    @GetMapping("/getAll") //15.168.90.221:8081/api/coins/getAll
    public List<CoinInfo> getAllCoinInfo() {
        return coinInfoService.getAllCoins();
    }

    @PostMapping("/add")
    public void insertCoinInfo(@RequestBody CoinInfo coinInfo) {
        coinInfoService.addCoin(coinInfo);
    }
}
