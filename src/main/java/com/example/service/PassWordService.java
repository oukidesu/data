package com.example.service;

import com.example.dao.PassWord;
import com.example.dao.UserData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PassWordService {

    @Resource
    PassWord passWord;

    // 数据插入
    public boolean userInsert(UserData userData) {
        if (null == userData.getUserId() || null == userData.getWeb() || null == userData.getUserPassWord()) {
            return false;
        } else {
            return passWord.insert(userData) > 0;
        }
    }

    // 数据查询
    public UserData userDataSelect(String web) {
        if (web == null)
            return null;
        return passWord.select(web);
    }

    // 查询所有数据
    public List<UserData> userDataSelectAll() {
        return passWord.selectAll();
    }

    // 数据删除
    public boolean deleteData(String web) {
        if (null != passWord.select(web)) {
            if (null == web)
                return false;
            else return passWord.deleteDate(web) > 0;
        }
        else return false;
    }

}
