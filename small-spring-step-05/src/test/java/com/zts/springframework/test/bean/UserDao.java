package com.zts.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 07 05 00 00
 * @describe：
 **/
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static{
        hashMap.put("10001", "张三");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}