package com.pisiewang.javalesson.dogfactory;

public class Test {
    public static void main(String[] args){
        Person p1=new Student("刘晓丽",20,"女");
        Person p2=new Student("孙梦迪",19,"女");
        Person p3= new Student("aaa",19,"女");
        Person p4=new Student("季鲁豫",19,"女",4,"201912520112");
        Person p5=new Teacher("周慧敏",18,"女",5,"201912520139");
        Person p6=new Teacher("柯俊君",19,"女",6,"201912520113");
//        Person p7=new Person();
        //System.out.println(p1.getStuId());
        Person[] persons={p1,p2,p3,p4,p5,p6};
        for(int i=0;i<persons.length;i++){
            System.out.print(persons[i].getID());
        }

//
//        System.out.print(sum(1,1));
    }



    public static int sum(int a,int b){ //加法
        int result;
        result=a+b;
        return result;
    }


    public static int sum(float a,float b){ //没有重复
        int result;
        result=(int)(a+b);
        return result;
    }

}
