package com.hyt.AAbooks.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.hyt")
public class ConfigBean {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
