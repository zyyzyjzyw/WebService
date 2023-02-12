package com.tedu.java;

import com.tedu.java.service.impl.IUserServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Unit test for simple App.
 */
public class Server
{
    public static void main(String[] args) {
        // 创建发布服务的工程
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        // 设置服务的地址
        factoryBean.setAddress("http://localhost:8081/ws/");
        // 设置服务类
        factoryBean.setServiceBean(new IUserServiceImpl());
        // 发布服务
        factoryBean.create();
        System.out.println("发布服务成功,端口号为8081");
    }
}
