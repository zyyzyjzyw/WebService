package com.tedu.java.service.impl;

import com.tedu.java.service.HelloService;

/**
 * @author： zyy
 * @date： 2023/2/11 13:27
 * @description： TODO
 * @version: 1.0
 * @描述：
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+",Welcome to China!";
    }
}
