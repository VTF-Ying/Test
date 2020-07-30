package com.vtf.service.test.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @ProjectName: test
 * @ClassName: GuessTheSize
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-07-24 10:34
 */
public class GuessTheSize {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int i = random.nextInt(100);
        System.out.println("***********************比大小游戏正式开始***********************");
       boolean k = true;

       while (k){
           System.out.println("输入数字来进行比较");
           int b = sc.nextInt();
           if(b<i){
               System.out.println("猜小了");
           }else if(b>i){
               System.out.println("猜大了");
           }else {
               System.out.println("恭喜你猜中了");
               k=false;
           }
       }

    }
}
