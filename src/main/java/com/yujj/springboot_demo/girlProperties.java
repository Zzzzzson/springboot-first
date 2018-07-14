package com.yujj.springboot_demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class girlProperties {
    private String cupSize;
    private String age;

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public String getAge() {
        return age;
    }
}
