package com.vtf.service.test.entity;

/**
 * @ProjectName: test
 * @ClassName: student
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-27 16:23
 */
public class Student {
    private String id;
    private String stuName = "张三";


    public void setId(String id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                '}';
    }

}
