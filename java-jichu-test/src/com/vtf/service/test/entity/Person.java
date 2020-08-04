package com.vtf.service.test.entity;

import java.io.Serializable;

/**
 * @ProjectName: test
 * @ClassName: Person
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-06-05 10:32
 */
 public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

}
