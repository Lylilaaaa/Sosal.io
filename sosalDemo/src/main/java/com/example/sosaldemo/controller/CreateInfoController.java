package com.example.sosaldemo.controller;

import com.example.sosaldemo.entity.CreateInfo;

import com.example.sosaldemo.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/create")
public class CreateInfoController {
    @Autowired
    private CreateService createInfoService;

    @GetMapping("/getAll") //15.168.90.221:8081/api/create/getAll
    public List<CreateInfo> getAllCreateInfo() {
        return createInfoService.getAllCreateInfo();
    }

    @PostMapping("/add")
    public void insertCreateInfo(@RequestBody CreateInfo createInfo) {
        createInfoService.addCreateInfo(createInfo);
    }
}
