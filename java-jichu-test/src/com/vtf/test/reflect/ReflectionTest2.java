package com.vtf.test.reflect;

import java.lang.reflect.Constructor;

/**
 * @ProjectName: test
 * @ClassName: ReflectionTest2
 * @Description: TODO(反射的一些操作)
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
            Constructor[] constructor = clazz.getConstructors();  // 获取到类的公有的的构造方法
            for (Constructor c : constructor) {
                System.out.println("构造方法名称"+c.getName()); // 获取方法名称
                // getModifiers 取得方法的修饰符,返回数字1 代表 public
                System.out.println("构造方法"+c.getName()+"的修饰符是"+c.getModifiers()); // 获取构造方法的修饰符
                Class[] parameterTypes = c.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    System.out.println("构造方法名称"+c.getName()+"的参数类型是"+parameterType.getName());
                }
            }

            System.out.println("+++++++++++++++++++++++++++++++++++++++++");

            Constructor[] cons1 = clazz.getDeclaredConstructors(); // 获取所有的 构造方法 包括公有和私有的
            for (Constructor constructor1 : cons1) {
                System.out.println("=======================================");
                System.out.println("构造方法名称"+constructor1.getName()); // 获取方法名称
                // getModifiers 取得方法的修饰符,返回数字1 代表 public  返回数字2 代表是 private
                System.out.println("构造方法"+constructor1.getName()+"的修饰符是"+constructor1.getModifiers()); // 获取构造方法的修饰符
                Class[] parameterTypes = constructor1.getParameterTypes();  // 获取构造方法的参数类型 有几个参数 数组的元素就有几个
                for (Class parameterType : parameterTypes) {
                    System.out.println("构造方法名称"+constructor1.getName()+"的参数类型是"+parameterType.getName());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
