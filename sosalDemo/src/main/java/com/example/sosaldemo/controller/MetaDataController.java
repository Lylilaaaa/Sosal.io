package com.example.sosaldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/solana")
public class MetaDataController {

    private final RestTemplate restTemplate;

    @Autowired
    public MetaDataController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getMetadata")
    public ResponseEntity<Map<String, String>> getMetadataFromNodeAPI() {
        String mintAddress = "tEpPgQ8v27FjkyKPQy18BhHrP7LvLQbDpEG9hGppump";
        String bondingCurve = "FWURZSei1Nc8LSAwXPUqTeXRFfb1NYZM6EHuAcQxXiNn";

        String url = "http://localhost:3001/getMetadataPDA?mint=" + mintAddress;

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

        // 可以组合返回结果
        Map<String, String> result = Map.of(
                "mint", mintAddress,
                "bondingCurve", bondingCurve,
                "metadataPDA", (String) response.getBody().get("metadataPDA")
        );

        return ResponseEntity.ok(result);
    }
}

