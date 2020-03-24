package com.pisiewang.javalesson;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

public class Lesson5 {


    public static void main(String[] args) throws Exception {
        String map[][]=new String[][]{{"济南","淄博","东营","日照","威海","烟台"},
                {"郑州","洛阳","漯河","开封","信阳","三门峡"}};

        for(int k=0;k<map.length;k++) {//每一行单独排序 循环2次

            for (int i = 0; i < map[k].length; i++) {   //排序挨个拍数
                for (int j = 0; j < map[k].length-1; j++) {  //一次冒泡操作
                    System.out.println(pinyin(map[k][j]).toCharArray());
                    if (pinyin(map[k][j]).toCharArray()[0] > pinyin(map[k][j + 1]).toCharArray()[0]) {
                        String t;
                        t = map[k][j];
                        map[k][j] = map[k][j + 1];
                        map[k][j + 1] = t;
                    }
                }
            }
        }



        for(int i=0;i<map.length;i++){
            System.out.println();
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");


            }
        }

    }
    public static String pinyin(String hanzi) throws Exception{
        // 创建汉语拼音处理类
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // 输出设置，大小写，音标方式
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);
        String pinyin=PinyinHelper.toHanYuPinyinString(hanzi, defaultFormat,"",true);
        return pinyin;
    }
}
