package com.example.service;

import com.example.controller.PassWordController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PassWordApplicationTests {

    @Autowired
    private PassWordController passWordController;

    @Test
    void contextLoads() {
        System.out.println("this is the life");
    }

    @Test
    void deleteTest() {
        System.out.println(passWordController.deleteData("test"));
    }
}
