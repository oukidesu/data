package com.example.dao;

import org.springframework.beans.factory.annotation.Value;

public class UserData {
    @Value("web")
    private String web;

    @Value("userId")
    private String userId;

    @Value("userPassWord")
    private String userPassWord;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "web='" + web + '\'' +
                ", userId='" + userId + '\'' +
                ", userPassWord='" + userPassWord + '\'' +
                '}';
    }
}
