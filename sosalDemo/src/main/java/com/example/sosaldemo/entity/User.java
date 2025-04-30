package com.example.sosaldemo.entity;

import lombok.Data;

@Data
public class User {
    private String coinNameSimple;
    private String coinNameFull;
    private String address;
    private String xlink;
    private String webLink;
    private String telegramLink;
    private String pumpFunLink;
    private String raydiumLink;

    private double priceSol;
    private double priceUSD;
    private double fdv;
    private double liquidity;
    private double mktCap;

    private double persentage5M;
    private double persentage1H;
    private double persentage6H;
    private double persentage24H;

    private int volume;
    private int txns;
    private int makers;
    private double buysVol;
    private double sellsVol;

    private int buyS;
    private int sells;
    private int buyers;
    private int sellers;
}
