package com.example.sosaldemo.controller;

import com.example.sosaldemo.entity.CreateInfo;
import com.example.sosaldemo.mapper.CreateInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/helius")
public class WebhookController {

    @Autowired
    private CreateInfoMapper createInfoMapper;

    @PostMapping("/webhook")  // https://15.168.90.221:8081/api/helius/webhook/mint=?address&feePayer=?address
    public void receiveWebhook(@RequestBody List<Map<String, Object>> data) {
//        System.out.println("✅ Received webhook: " + data);
        for (Map<String, Object> payload : data) {
            Object feePayer = payload.get("feePayer");
            System.out.println("🔔 New Webhook Received - Fee Payer: " + feePayer);
            String feePayer_ = feePayer != null ? feePayer.toString() : null;

            List<Map<String, Object>> instructions = (List<Map<String, Object>>) payload.get("instructions");
            if (instructions != null) {
                for (Map<String, Object> instruction : instructions) {
                    List<String> accounts = (List<String>) instruction.get("accounts");

                    if (accounts != null && accounts.size() > 3) {
                        String mint = accounts.get(0);
                        String bondingCurve = accounts.get(2);
                        String associatedBondingCurve = accounts.get(3);

                        if (!mint.endsWith("pump")) {
                            System.out.println("⛔ Skipped mint (does not end with 'pump'): " + mint);
                            continue;
                        }

                        System.out.println("🚀 Create Instruction Detected:");
                        System.out.println("   - Mint: " + mint);
                        System.out.println("   - Bonding Curve: " + bondingCurve);
                        System.out.println("   - Associated Bonding Curve: " + associatedBondingCurve);

                        // ✅ 保存进数据库
                        CreateInfo createInfo = new CreateInfo();
                        createInfo.setAddress_id(mint);
                        createInfo.setFee_payer(feePayer_);
                        createInfo.setMint(mint);
                        createInfo.setBonding_curve(bondingCurve);
                        createInfo.setAsso_bonding_curve(associatedBondingCurve);

                        try {
                            createInfoMapper.insertCreateInfo(createInfo);
                            System.out.println("✅ Saved CreateInfo to DB.");
                        } catch (Exception e) {
                            System.err.println("❌ Failed to insert CreateInfo: " + e.getMessage());
                        }
                    }
                }
            }
        }
    }
}
