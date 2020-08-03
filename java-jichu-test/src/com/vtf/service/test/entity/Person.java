package com.vtf.service.test.entity;

/**
 * @ProjectName: test
 * @ClassName: Person
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-06-05 10:32
 */
 public class Person {

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
}
