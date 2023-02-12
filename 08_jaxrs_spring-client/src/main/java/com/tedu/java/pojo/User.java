package com.tedu.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author： zyy
 * @date： 2023/2/12 9:46
 * @description： TODO
 * @version: 1.0
 * @描述：基于restful风格的webservice，客户端与服务端之间通讯可以传递xml数据，json数据。
 * XmlRootElement指定对象序列化为xml或json数据根节点的名称
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="User")
public class User {
    private Integer id;
    private String username;
    private String city;
    private List<Car> cars = new ArrayList<>();
}
