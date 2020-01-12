import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefiectDemo01 {
   //通过反射获取类

    public static void demo1() throws ClassNotFoundException {
        /**获取反射对象(反射入口): Class类型
         *  获取反射有三种方法
         *  1.Class.forName(全类名:包名加类名)
         *  2.类名.class
         *  3.对象.getClass()
         */
        //1.Class.forName(全类名:包名+类名)  我这没有包所以直接写类名
        Class person = Class.forName("Person");
        System.out.println(person);
        System.out.println("返回值是一个class类  反射的入口");

        /**
         * 我玩过的游戏:
         *     魔兽争霸 星际争霸 帝国时代 1.2.3  文明 4.5.6
         *     cs cs.go cs online 要塞 帝国与文明 红警
         *     骑马与砍杀 缺氧 异星工厂 GTAV H1Z1 战地一
         *     我的世界 兄弟连 全面战争系列 DNF 英雄联盟 修仙模拟器
         *     模拟城市 森林 传送门 CF 荒岛余生
         */

        //2.类名.class
        Class person2 = Person.class;
        System.out.println(person2);
        System.out.println("返回值是一个class类  反射的入口");

        //3.对象.getClass
        Person per = new Person();
        Class person3 = per.getClass();
        System.out.println(person3);
        System.out.println("返回值是一个class类  反射的入口");
    }

    //获取方法
    public static void demo2() throws ClassNotFoundException {
        //Class入口来获取方法 推荐用class.forName 入口来获取
        //先获取CLass入口
        Class person = Class.forName("Person");
        //通过 入口获取方法  获取所有公共的方法(1.本类 以及 父类、接口中的所有方法 2.符合访问修饰符规律)
        Method[] methods = person.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("===============");
        //获取当前类的所有方法(1.只能是当前类   2.忽略访问修饰符限制)      .getMethods()获取所有公共的方法  .getDeclaredMethods()所有方法 包含私有方法
        Method[] declaredMethods = person.getDeclaredMethods();
        for (Method method1 : declaredMethods) {
            System.out.println(method1);
        }
    }
    //获取所有接口
    public static void demo3() throws ClassNotFoundException {
        //获取Class反射 入口
        Class person = Class.forName("Person");

        //获取接口
        Class[] interfaces = person.getInterfaces();

        for (Class inter:interfaces){
            System.out.println(inter);
        }
    }

    //获取所有父类
    public static void demo4() throws ClassNotFoundException {
        //获取Class反射 入口
        Class person = Class.forName("Person");

        Class superclass = person.getSuperclass();

        //java 是单继承多实现 所以只有一个父类
        System.out.println(superclass);
    }

    //获取所有构造方法
    public static void demo5() throws ClassNotFoundException {
        //获取Class反射 入口
        Class person = Class.forName("Person");

        Constructor[] constructors = person.getConstructors();

        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }
    }

    //获取所有的公共属性
    public static void demo6() throws ClassNotFoundException {
        //获取Class反射 入口
        Class person = Class.forName("Person");
        Field[] fields = person.getFields();
        for (Field field:fields){
            System.out.println(field);
        }


        System.out.println("=================");
        Field[] declaredFields = person.getDeclaredFields();
        for (Field field1:declaredFields){
            System.out.println(field1);
        }
    }

    //获取当前反射所有类(接口) 的对象 (实例)
    public static void demo7() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取Class反射 入口
        Class person = Class.forName("Person");

        Object o = person.newInstance();

        Person per =  (Person)o;
        per.interfaceMethod2();
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //demo1();
        //demo2();
        //demo3();
        //demo4();
        //demo5();
        //demo6();
        demo7();
    }
}
