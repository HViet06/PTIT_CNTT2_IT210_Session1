package org.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {

    @Value("Cyber Center Hoan Kiem")
    private String branchName;

    @Value("08:00 AM")
    private String openingHour;

    public void display() {
        System.out.println("Chi nhánh: " + branchName);
        System.out.println("Giờ mở cửa: " + openingHour);
    }
}
