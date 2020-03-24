package com.pisiewang.javalesson;

public class Lesson3 {

    public static void main(String[] args) {

        //我们



    }

    public static void listMatix(int[] ints){
        for(int i=0;i<ints.length;i++){
            System.out.println("第"+i+"个数字为:"+ints[i]);
        }
    }
    //给你   字符串英语  的一句话 返给我一个int数组记录着这句话里每一个字母有多少个
    public static int[] getWordsNum(String words){


        String[] names= words.split(" ");
        int[] sums = new int[26];
        //遍历
        for(int i=0;i<names.length;i++){
            String line=names[i];
            char[] str=line.toCharArray();
            for(int j=0;j<str.length;j++){
                for(int k='a';k<='z';k++){
                    if(k==str[j]){
                        sums[k-97]++;
                    }

                }


            }
        }

        return sums;
    }
}
