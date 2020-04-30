package com.vtf.test.reflect;

import java.lang.reflect.Constructor;

/**
 * @ProjectName: test
 * @ClassName: ReflectionTest2
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-04-30 18:17
 */
public class ReflectionTest2 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.vtf.test.reflect.entity.Student");  //通过全类名调用.forName方法  获取指定类的Class实例
            Class superclazz = clazz.getSuperclass(); // 获取父类
            System.out.println("父类--->" + superclazz.getName());
            Class[] interfaces = clazz.getInterfaces(); // 获取当前类的所有接口
            for (Class anInterface : interfaces) {
                System.out.println("接口---->" + anInterface.getName());
            }
            Constructor constructor = clazz.getConstructor();
            System.out.println(constructor.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
