package com.vtf.service.test.io;

import java.io.File;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: FileDemo6Test
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-07-30 15:39
 */
public class FileDemo6Test {
    public static void main(String[] args) throws IOException {
        File file = new File("java-jichu-test\\aaa");
        if (!file.exists()) {
            file.mkdirs();
        }
        File newFile = new File(file, "a.txt");
        boolean result = newFile.createNewFile();
        System.out.println(result);
    }
}
