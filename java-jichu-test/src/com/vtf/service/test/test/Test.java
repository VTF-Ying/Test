package com.vtf.service.test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: test
 * @ClassName: Test
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-07-23 20:39
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "b");

        map.put("a", "c");

        map.put("b", "d");

        map.put("c", "d");

        System.out.println(map);
//获取秒数
//        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
//获取毫秒数
//        Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
//
//        System.out.println(second);
//        System.out.println(milliSecond);


//        Long remindTime = 1595650359L;  //时间戳
//        LocalDateTime dateTime =LocalDateTime.ofEpochSecond(remindTime,0, ZoneOffset.ofHours(8));
//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime localDateTime = now.plusYears(1L).plusHours(12L);
//        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

//        Date date = timestampToDate(1595458680000L);
//        System.out.println("*******************");
//        System.out.println(date.getYear());
//        System.out.println(date.getYear()+":"+date.getMonth()+":"+date.getDay()+":"+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
//        LocalDateTime of = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDay(), date.getHours(), date.getMinutes(), date.getSeconds());
//        String format = of.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//        System.out.println(format);
//        System.out.println("*******************");
//        boolean hourRange = isHourRange(date, 12);
//        System.out.println(hourRange);
//
//        String string = (new StringBuilder().append("中国").append("-").append("巴铁")).toString();
//    }
//    public static boolean isHourRange (Date date,int hour) {
//        Long hours = date.getHours() * 60 * 60 * 1000L;
//        Long minutes = date.getMinutes() * 60 * 1000L;
//        Long hoursMin = hours + minutes;
//        Long hourMin  = hour * 60 * 60 * 1000L;
//        return hoursMin - hourMin <= 0;
//    }
//
//    public static Date timestampToDate(Long timestamp) throws ParseException {
//        //时间戳转化为Sting或Date
//        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Long time=new Long(timestamp);
//        String d = format.format(time);
//        Date date=format.parse(d);
//        System.out.println("Format To String(Date):"+d);
//        System.out.println("Format To Date:"+date);
//        return date;
//    }
    }

    private static void HaoShi() {
        long start = System.currentTimeMillis();

        List<String> aList = new ArrayList();
        List<String> lList = new LinkedList<>();
        String k = "你瞅啥";
        for (int i = 0; i < 10000; i++) {
            k += "瞅你咋地" + i;
            lList.add(k);
        }
        for (String s : lList) {
            System.out.println(s);
        }
        long end = System.currentTimeMillis();
        System.out.println("总共耗时" + (end - start) + "毫秒");
    }


}
