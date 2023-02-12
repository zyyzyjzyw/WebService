package com.tedu.java.service.impl;

import com.tedu.java.pojo.Car;
import com.tedu.java.pojo.User;
import com.tedu.java.service.IUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： zyy
 * @date： 2023/2/12 9:56
 * @description： TODO
 * @version: 1.0
 * @描述：
 **/
public class IUserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user:"+user);
    }

    @Override
    public void update(User user) {
        System.out.println("update user:"+user);
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("小明");
        user1.setCity("北京");

        List<Car> carList1 = new ArrayList<>();
        Car car1 = new Car();
        car1.setId(101);
        car1.setCarName("保时捷");
        car1.setPrice(1000000d);
        carList1.add(car1);
        Car car2 = new Car();
        car2.setId(102);
        car2.setCarName("宝马");
        car2.setPrice(2000000d);
        carList1.add(car2);
        user1.setCars(carList1);
        users.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("小丽");
        user2.setCity("上海");
        users.add(user2);

        return users;
    }

    @Override
    public User findUserById(Integer id) {
        if(id==1){
            User user1 = new User();
            user1.setId(1);
            user1.setUsername("小明");
            user1.setCity("北京");
            return user1;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user id:"+id);
    }
}
