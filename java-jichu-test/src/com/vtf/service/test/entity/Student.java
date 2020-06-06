package com.vtf.service.test.entity;

/**
 * @ProjectName: test
 * @ClassName: student
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-27 16:23
 */
public class Student {
    private Long id;
    private String stuName;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
