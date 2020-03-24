package com.pisiewang.javalesson;




//我们要从这个类开始 构建自己的程序  这个程序的主要作用是根据城市的首字母进行排序
public class Lesson4 {


    public static void main(String[] args) {
        String[] citys = {"xian", "jinan", "zhengzhou", "wuhan"};
        paiXu(citys);


    }

    public static String[] paiXu(String[] citys) {
        for (int j = 0; j < citys.length; j++) {
            for (int i = 0; i < citys.length - 1; i++) {
                if (citys[i].toCharArray()[0] > citys[i + 1].toCharArray()[0]) {
                    String t;
                    t = citys[i];
                    citys[i] = citys[i + 1];
                    citys[i + 1] = t;
                }
            }
        }
        shuChu(citys);
        return citys;

    }

    public static void shuChu(String[] citys) {
        for (int i = 0; i < citys.length; i++)
            System.out.println(citys[i]);


    }
}