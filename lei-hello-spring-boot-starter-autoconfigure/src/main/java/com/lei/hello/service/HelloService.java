package com.lei.hello.service;

import com.lei.hello.properties.Helloproperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 默认不放在容器中
 *
 * @author leiyunlong
 * @version 1.0
 * @since 2021/8/10 3:12 下午
 */
public class HelloService {
    private String name = "lei";
    private Integer age = 26;

    @Autowired
    Helloproperties helloproperties;

    public String sayHello(String name) {
        return helloproperties.getPrefix() + ":" + name + "," + helloproperties.getSuffix();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String sayHelloToo() {
        return "我叫" + name + "，" + "今年" + age;
    }
}
