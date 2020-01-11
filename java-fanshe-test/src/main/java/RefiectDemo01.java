import java.lang.reflect.Method;

public class RefiectDemo01 {
   //通过反射获取类

    public static void demo01() throws ClassNotFoundException {
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
    public static void demo02() throws ClassNotFoundException {
        //Class入口来获取方法 推荐用class.forName 入口来获取
        //先获取CLass入口
        Class person = Class.forName("Person");
        //通过 入口获取方法  获取所有公共的方法(1.本类 以及 父类、接口中的所有方法 2.符合访问修饰符规律)
        Method[] methods = person.getMethods();
        for (Method method:methods){
            System.out.println(method);
        }
    }

    //获取所有接口
    public static void demo3() throws ClassNotFoundException {
        //获取Class反射 入口
        Class person = Class.forName("Person");

        //获取接口

    }


    public static void main(String[] args) throws ClassNotFoundException {
       // demo01();
        demo02();
    }
}
