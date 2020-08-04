package com.vtf.service.test.io;

import com.vtf.service.test.entity.Student;

import java.io.*;
import java.util.ArrayList;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo14
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 15:54
 */
public class IODemo14 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //  method();
        //  method2();
        // method4();
        // method5();


        ObjectInputStream iut = new ObjectInputStream(new FileInputStream("java-jichu-test/src/com/vtf/service/test/io/txt/f.txt"));
        ArrayList<Student> list = (ArrayList<Student>) iut.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        iut.close();

    }

    // 批量反序列化 方式一
    private static void method5() throws IOException, ClassNotFoundException {
        ObjectInputStream iut = new ObjectInputStream(new FileInputStream("java-jichu-test/src/com/vtf/service/test/io/txt/f.txt"));
        Object obj;
        while (true) {
            try {
                Object o = iut.readObject();
                System.out.println(o);
            } catch (IOException e) {
                break;
            }
        }
        iut.close();
    }

    // 批量序列化
    private static void method4() throws IOException {
        Student stu1 = new Student(123L, "张三", 20, "一年级");
        Student stu2 = new Student(456L, "李四", 21, "二年级");
        Student stu3 = new Student(789L, "王五", 22, "三年级");
        Student stu4 = new Student(987L, "麻子", 23, "四年级");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("java-jichu-test/src/com/vtf/service/test/io/txt/f.txt"));
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        out.writeObject(list);
        out.close();
    }

    // 反序列化
    private static void method2() throws IOException, ClassNotFoundException {
        ObjectInputStream iut = new ObjectInputStream(new FileInputStream("java-jichu-test/src/com/vtf/service/test/io/txt/f.txt"));
        Student o = (Student) iut.readObject();
        System.out.println(o.toString());
        iut.close();
    }

    // 序列化
    private static void method() throws IOException {
        Student stu = new Student(123L, "张三", 24, "五年级");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("java-jichu-test/src/com/vtf/service/test/io/txt/f.txt"));
        out.writeObject(stu);
        out.close();
    }
}
