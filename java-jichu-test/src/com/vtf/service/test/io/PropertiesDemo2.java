package com.vtf.service.test.io;

import java.util.Properties;
import java.util.Set;

/**
 * @ProjectName: logtest
 * @ClassName: PropertiesDemo2
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 19:37
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("安徽","南京");
        prop.setProperty("山东","济南");
        System.out.println(prop);

        // 查询
        String value = prop.getProperty("江苏");
        System.out.println(value);


        // 遍历
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String property = prop.getProperty(key);
            System.out.println(key+"="+property);
        }
    }
}
