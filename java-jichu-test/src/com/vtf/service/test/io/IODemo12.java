package com.vtf.service.test.io;

import java.io.*;
import java.util.Arrays;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo12
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 14:51
 */
public class IODemo12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("java-jichu-test/src/com/vtf/service/test/io/txt/d.txt"));
        // 输出流一定不要放在这里
        // BufferedWriter fw = new BufferedWriter(new FileWriter("java-jichu-test/src/com/vtf/service/test/io/txt/d.txt"));
        String s = br.readLine();
        System.out.println("读取到的数据" + s);
        br.close();

        // 2.按照空格进行切割
        String[] split = s.split(" ");
        // 3. 把字符串 转换成 int
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            Integer integer = Integer.valueOf(split[i]);
            arr[i] = integer;
        }
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));
        BufferedWriter fw = new BufferedWriter(new FileWriter("java-jichu-test/src/com/vtf/service/test/io/txt/d.txt"));
        for (int i = 0; i < arr.length; i++) {
            fw.write(arr[i] + " ");
            fw.flush();
        }
        fw.close();
    }
}
