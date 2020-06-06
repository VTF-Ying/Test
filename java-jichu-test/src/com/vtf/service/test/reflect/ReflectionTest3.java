package com.vtf.service.test.reflect;

import com.vtf.service.test.reflect.entity.Student;

import java.lang.reflect.Constructor;

/**
 * @ProjectName: test
 * @ClassName: ReflectionTest3
 * @Description: TODO(如何用反射的构造方法来创建对象)
 * @Author: VTF
 * @create: 2020-05-06 11:39
 */
public class ReflectionTest3 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.vtf.service.test.reflect.entity.Student");
            // Object obj = clazz.newInstance(); // 相当于调用 Student 类的无参公有的构造方法
            // Student stu = (Student) obj;
            Constructor constructor = clazz.getConstructor(String.class);
            Student stu1 = (Student) constructor.newInstance("第一中学");
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

