package com.vtf.service.test.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ProjectName: logtest
 * @ClassName: PropertiesDemo3
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 19:42
 */
public class PropertiesDemo3 {
    // void load(Reader reader)   将本地文件的键值对数据读取到集合中
    // void store(Writer writer,String comments) String comments 是注释  将集合中的数据 以键值对的方式保存在本地
    public static void main(String[] args) throws IOException {

        // method();
        // method2();
    }

    // 写入
    private static void method2() throws IOException {
        Properties prop = new Properties();
        prop.put("zhangsan","123");
        prop.put("lisi","456");
        prop.put("wangwu","789");

        FileWriter fw = new FileWriter("java-jichu-test/src/com/vtf/service/test/io/txt/prop.properties");
        prop.store(fw,"Test");
        fw.close();
    }

    private static void method() throws IOException {
        // 读取
        Properties prop = new Properties();
        FileReader fr = new FileReader("java-jichu-test/src/com/vtf/service/test/io/txt/prop.properties");
        // 调用完load方法之后  文件中的键值对数据已经在集合中了
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

}
