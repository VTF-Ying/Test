package com.vtf.service.test.thread;

import com.vtf.service.test.entity.Student;
import java.util.*;
/**
 * @ProjectName: test
 * @ClassName: LocalDateTime
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-06-17 12:08
 */
public class LocalDateTime {
    public static void main(String[] args) {
       List<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1);

        boolean isRepeat = list.size() != new HashSet<Integer>(list).size();
        if(isRepeat){
            System.out.println("有重复" + isRepeat);
        }
    }
}
