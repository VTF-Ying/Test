package com.vtf.service.test.reflect.entity;

/**
 * @ProjectName: test
 * @ClassName: Student
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-04-30 18:12
 */
public class Student extends Person implements Move, Study {

    String school;

    public Student() {
        System.out.println("调用的是 public Student()");
    }

    public Student(String school) {
        this.school = school;
        System.out.println("调用的是 public Student(String school)");
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用的是 private Student(String name,int age) ");
    }

    public void showInfo() {
        System.out.println("学校是" + school);
    }

    @Override
    public void moveType() {
        System.out.println("学习的中学的知识");
    }

    @Override
    public void studyInfo() {
        System.out.println("骑自行车上学");
    }
}
