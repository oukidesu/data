package com.example.controller;

import com.example.dao.UserData;
import com.example.service.PassWordService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@MapperScan("com.example.dao")
public class PassWordController {

    @Resource
    PassWordService passWordService;

    @ResponseBody
    @PostMapping("/insert")
    public String userDateInsert(@RequestBody UserData userData) {
        if (passWordService.userInsert(userData))
            return "数据插入成功";
        else
            return "数据插入失败，请重试";
    }

    @ResponseBody
    @GetMapping("/select")
    public UserData userDataSelect(String web) {
        return passWordService.userDataSelect(web);
    }

    @ResponseBody
    @GetMapping("/selectall")
    public List<UserData> userDataSelectAll() {
        return passWordService.userDataSelectAll();
    }

    @ResponseBody
    @GetMapping("/delete")
    public boolean deleteData(String web) {
        return passWordService.deleteData(web);
    }
}
