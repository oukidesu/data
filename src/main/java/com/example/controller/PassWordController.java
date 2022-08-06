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

    // 数据插入
    @ResponseBody
    @PostMapping("/insert")
    public String userDateInsert(@RequestBody UserData userData) {
        if (passWordService.userInsert(userData))
            return "数据插入成功";
        else
            return "数据插入失败，请重试";
    }

    // 检索特定数据
    @ResponseBody
    @GetMapping("/select")
    public UserData userDataSelect(String web) {
        return passWordService.userDataSelect(web);
    }

    // 检索所有数据
    @ResponseBody
    @GetMapping("/selectall")
    public List<UserData> userDataSelectAll() {
        return passWordService.userDataSelectAll();
    }

    // 逻辑删除无用数据
    @ResponseBody
    @GetMapping("/delete")
    public boolean deleteData(String web) {
        return passWordService.deleteData(web);
    }

    // 恢复逻辑删除数据
    @ResponseBody
    @GetMapping("/reload")
    public boolean deleteReload(String web){
        return passWordService.deleteReload(web);
    }

    // 查询删除的数据
    @ResponseBody
    @GetMapping("/selectDelete")
    public UserData selectDelete(){
        return passWordService.selectDelete();
    }
}
