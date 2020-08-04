package com.vtf.service.test.entity;

import java.io.Serializable;

/**
 * @ProjectName: test
 * @ClassName: student
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-27 16:23
 */
// Serializable  是一个 标记性接口 只要实现这个 接口 就代表 这个对象 可被 序列化 和 反序列化

public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(Long id, String name, int age, String className) {
        super(id, name, age);
        this.className = className;
    }

    public Student(String className) {
        this.className = className;
    }

    public Student() {
    }

    public Student(Long id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +"id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ",className='" + className + '\'' +
                "} ";
    }
}
