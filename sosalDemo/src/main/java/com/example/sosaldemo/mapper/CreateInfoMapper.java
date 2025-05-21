package com.example.sosaldemo.mapper;

import com.example.sosaldemo.entity.CreateInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CreateInfoMapper {
    @Select("SELECT * FROM create_table")
    List<CreateInfo> getAllCreateInfo();

    @Insert("INSERT INTO create_table (" +
            "Mint, Fee_payer, Bonding_curve, Asso_bonding_curve" +
            ") VALUES (" +
            "#{mint}, #{fee_payer}, #{bonding_curve}, #{asso_bonding_curve})")
    void insertCreateInfo(CreateInfo createInfo);
}