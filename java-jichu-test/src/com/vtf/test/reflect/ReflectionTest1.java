package com.vtf.test.reflect;

import com.vtf.test.reflect.entity.Person;

/**
 * @ProjectName: test
 * @ClassName: ReflectionTest1
 * @Description: TODO(反射测试)
 * @Author: VTF
 * @create: 2020-04-30 17:16
 */
public class ReflectionTest1{
    public static void main(String[] args) {
        Person p = new Person();
        Class<? extends Person> aClass = p.getClass(); // aClass 对象中就包含对象p所属的Person类的所有信息
        Class c0 = Person.class; //通过类名来创建指定类的Class实例
        Class c1 = p.getClass(); //通过类的实例对象的getClass方法 获取对应实例对象的Class实例
        try {
            //通过Class的静态方法forName(String className)来获取一个类的Class实例
            // forName(String className) 方法中的参数 是你要获取的Class 实例的全路径 (包名.类名)
            // 此方法需要捕获异常  此方法也比较常用
            Class c2 = Class.forName("com.vtf.test.reflect.entity.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
