package com.vtf.service.test.thread;


import com.vtf.service.test.entity.Student;

import java.util.*;

/**
 * @ProjectName: test
 * @ClassName: HelloWorld
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-22 12:09
 */
public class HelloWorld {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Student stu = new Student();
            stu.setId(1L);
            stu.setStuName("好");
            list.add(stu);
        }
      list.forEach(e-> e.setAge(100));
        for (Student student : list) {
            System.out.println(student.getId()+"-"+student.getAge()+"-"+student.getStuName());
        }
       
    }
}
