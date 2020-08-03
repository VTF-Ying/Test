package com.vtf.service.test.test;

import com.vtf.service.test.entity.Person;
import com.vtf.service.test.entity.Student;

/**
 * @ProjectName: logtest
 * @ClassName: NullEqualsTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-03 10:41
 */
public class NullEqualsTest {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        student.setAge(12);
        student.setId(20200803L);
        student.setName("郭德纲");
        student.setClassName("五年级");

        student1.setAge(13);
        student1.setId(20200803L);
        student1.setName("于谦");
        student1.setClassName(null);

       if(student.getClassName()!=null){
           if(student.getClassName().equals(student1.getClassName())){
               System.out.println("没问题");
           }else{
               System.out.println("不符要求");
           }
       }else{
           System.out.println("没进方法");
       }
    }
}
