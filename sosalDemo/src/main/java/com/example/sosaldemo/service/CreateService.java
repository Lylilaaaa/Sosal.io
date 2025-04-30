package com.example.sosaldemo.service;

import com.example.sosaldemo.entity.CreateInfo;
import com.example.sosaldemo.mapper.CreateInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CreateService {
    @Autowired
    private CreateInfoMapper createInfoMapper;

    public List<CreateInfo> getAllCreateInfo() {
        return createInfoMapper.getAllCreateInfo();
    }

    public void addCreateInfo(CreateInfo createInfo) {
        createInfoMapper.insertCreateInfo(createInfo);
    }
}
