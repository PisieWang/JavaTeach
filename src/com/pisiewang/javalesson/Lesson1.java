package com.pisiewang.javalesson;

public class Lesson1 {

    int a;
    long b=11100l;
    String c;
    char d;
    double e;


    public static void main(String[] args){
        for(int i=0;i<20;i++){
            int a=0;
            if(i<10) {
                a=i;
            }else{
                a=19-i;
            }
            for (int j = 0; j <= a; j++) {   //逐行输出a个星星
                System.out.print("*");
            }

            System.out.println();
        }

    }

    //找出所有水仙花数

}
