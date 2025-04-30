package com.example.sosaldemo.mapper;

import com.example.sosaldemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM coininformation_1")
    List<User> getAllUser();

    @Insert("INSERT INTO coininformation_1 (" +
            "    CoinNameSimple, CoinNameFull, Address, Xlink, WebLink, TelegramLink, PumpFunLink, RaydiumLink, " +
            "    PriceSol, PriceUSD, FDV, Liquidity, MKTCap, Persentage5M, Persentage1H, Persentage6H, Persentage24H, " +
            "    Volume, Txns, Makers, BuysVol, SellsVol, BuyS, Sells, Buyers, Sellers) " +
            "VALUES (" +
            "    #{coinNameSimple}, #{coinNameFull}, #{address}, #{xlink}, #{webLink}, #{telegramLink}, #{pumpFunLink}, #{raydiumLink}, " +
            "    #{priceSol}, #{priceUSD}, #{fdv}, #{liquidity}, #{mktCap}, #{persentage5M}, #{persentage1H}, #{persentage6H}, #{persentage24H}, " +
            "    #{volume}, #{txns}, #{makers}, #{buysVol}, #{sellsVol}, #{buyS}, #{sells}, #{buyers}, #{sellers})")
    void insertUser(User user);
}
