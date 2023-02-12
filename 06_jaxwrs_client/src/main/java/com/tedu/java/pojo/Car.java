package com.tedu.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author： zyy
 * @date： 2023/2/12 9:45
 * @description： TODO
 * @version: 1.0
 * @描述：
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="Car")
public class Car {
    private Integer id;
    private String carName;
    private Double price;
}
