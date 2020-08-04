package com.vtf.service.test.io;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ProjectName: logtest
 * @ClassName: PropertiesDeom1
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 19:20
 */
public class PropertiesDeom1 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        // 增
        properties.put("小龙女", "尹志平");
        properties.put("郭襄", "杨过");
        properties.put("黄蓉", "欧阳克");
        System.out.println(properties);

        // 删
//        properties.remove("郭襄");
//        System.out.println(properties);

        // 改
        properties.put("小龙女", "杨过");
        System.out.println(properties);

        // 查
        Object obj = properties.get("黄蓉");
        System.out.println(obj);

        // 遍历方式一
        for (Object o : properties.keySet()) {
            Object value = properties.get(o);
            System.out.println(o + "=" + value);
        }

        System.out.println("=================================");

        // 遍历方式二
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            // 1. System.out.println(entry);
            // 2. System.out.println(key + "=" + value);
        }

    }

}
