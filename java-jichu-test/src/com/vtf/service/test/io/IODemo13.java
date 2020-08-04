package com.vtf.service.test.io;

import com.vtf.service.test.entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo13
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 15:28
 */
public class IODemo13 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student(123L,"张三",24,"五年级");
        BufferedWriter bw = new BufferedWriter(new FileWriter("java-jichu-test/src/com/vtf/service/test/io/txt/e.txt"));
        bw.write("主键id:"+stu.getId());
        bw.newLine();
        bw.write("姓名:"+stu.getName());
        bw.newLine();
        bw.write("年龄:"+stu.getAge()+"");
        bw.newLine();
        bw.write("班级:"+stu.getClassName());
        bw.close();
    }
}
