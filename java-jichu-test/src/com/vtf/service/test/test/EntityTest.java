package com.vtf.service.test.test;

import com.vtf.service.test.entity.Student;

/**
 * @ProjectName: test
 * @ClassName: EntityTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-07-30 18:09
 */
public class EntityTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId("12");
        System.out.println(stu);
    }
}
