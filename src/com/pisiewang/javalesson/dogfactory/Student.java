package com.pisiewang.javalesson.dogfactory;

public class Student extends Person {

    public int bednumber;
    public String studid;

    Student(String name,int age,String sex){
        super(name,age,sex);//super指代的是父类所对应的对象  this指代的是本类对应的对象
    }

    Student(String name,int age,String sex,int bednumber,String studid){
        super(name,age,sex);
        this.bednumber=bednumber;
        this.studid=studid;
        this.age=age;
    }

    public int getBednumber() {
        return bednumber;
    }


    @Override
    public String getID(){
        return "安是学生"+studid;
    }

    @Override
    public int getAttck() {
        return 0;
    }

    @Override
    public int getDefend() {
        return 0;
    }

    @Override
    public String getAblilty() {
        return ablity;
    }
}
