import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

public class RefiectDemo02 {

  // 获取对象的实例 ，并操作对象
    public static void demo01() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class person = Class.forName("Person");
        Object o = person.newInstance();
        Person per = (Person) o;
        per.setName("zs");
        per.setAge(24);
        System.out.println(per.getName()+","+per.getAge());
    }

    // 操作属性
    public static void demo02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class person = Class.forName("Person");
        Object o = person.newInstance();
        Person per = (Person) o;
        Field id = person.getDeclaredField("id");

        /**
         *  per.setId(1);
         *
         *  per 是对象
         *  setId(); 是方法
         *  括号里的 1 是值
         *
         *
         */
        // id.set(per,1); 这里 id.set 是方法，per 是对象  1 是值  这两个方式可以画约等号 并不是一摸一样的

        //访问的是private修饰的id 但是private 是私有

        // 修改属性访问权限 如果不修改权限运行 id.set(per,1); 会报 Class RefiectDemo02 can not access a member of class Person with modifiers "private 错误
        id.setAccessible(true);

        // 使用反射时 如果因为访问修饰符限制造成异常   可以通过 setAccessible(true) 方法也有 setAccessible(true)
        id.set(per,1);

        System.out.println(per.getId());

        System.out.println("===========");
        //person.getDeclaredMethod("方法名","方法入参类型");
        Method privateMethod = person.getDeclaredMethod("privateMethod", null);
        privateMethod.setAccessible(true);
        privateMethod.invoke(per,null);   //方法是通过invoke 来调用
        System.out.println("===========================");

        Method privateMethod2 = person.getDeclaredMethod("privateMethod2", String.class);
        privateMethod2.setAccessible(true);

        privateMethod2.invoke(per,"张三");
    }

    // 操作构造
    public static void demo03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class person = Class.forName("Person");
        Constructor[] constructors = person.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }
        System.out.println("=======================");
        Constructor[] constructors2 = person.getDeclaredConstructors();
        for (Constructor constructor:constructors2){
            System.out.println(constructor);
        }

        System.out.println("=========获取指定构造方法========");


        //person.getConstructor(构造方法入参类型.class) int是int Integer 是 Integer
        Constructor constructor = person.getConstructor(int.class);
        System.out.println(constructor);


        Constructor constructor2 = person.getConstructor();
        Person instance = (Person)constructor2.newInstance();
        System.out.println(instance);
    }

    // 动态加载 类名和方法
    public static void demo04() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException, NoSuchMethodException, InvocationTargetException {
        Properties pro = new Properties();

        pro.load(new FileReader("java-fanshe-test/src/class.txt"));

        String classname = pro.getProperty("classname");
        String methodnaem = pro.getProperty("methodnaem");
        Class person = Class.forName(classname);

        Method method = person.getMethod(methodnaem);
        method.invoke(person.newInstance());
    }

    //反射可以越过泛型检查 就像此例 泛型制定了参数类型为 Integer 但是咱们越过了泛型添加了一个 参数类型为String的 参数
    //虽然可以通过 反射访问private 等访问修饰符不允许访问的属性和方法 也可以忽略掉泛型的约束 但实际开发不建议这样使用 因为可能造成程序的访问的混乱

    public static void demo05() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ArrayList<Integer> list = new ArrayList();
        list.add(123);
        list.add(3);
        list.add(2);
        Class aClass = list.getClass();
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(list,"张三");
        System.out.println(list);
    }

    public static void demo06() throws NoSuchFieldException, IllegalAccessException {
        Person per = new Person();
        PropertyUtil.setProperty(per,"name","张三");
        PropertyUtil.setProperty(per,"age",23);
        Student student = new Student();
        PropertyUtil.setProperty(student,"score",98);

        System.out.println(per.getName()+" "+ per.getAge());
        System.out.println(student.getScore());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IOException {
        //demo01();
        //demo02();
        //demo03();
        //demo04();
        //demo05();

        demo06();

    }
}
