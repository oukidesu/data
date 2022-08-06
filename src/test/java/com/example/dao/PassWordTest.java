package com.example.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PassWordTest {

    @Autowired
    PassWord passWord;

    @Test
    public void test() {
        UserData steam = passWord.select("steam");
        System.out.println(steam.getWeb() + steam.getUserPassWord() + steam.getUserPassWord());
    }
}
