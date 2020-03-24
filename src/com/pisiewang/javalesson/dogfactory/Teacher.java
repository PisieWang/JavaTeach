package com.pisiewang.javalesson.dogfactory;

public class Teacher extends Person {

    public int bednumber;
    public String teacherid;

    Teacher(String name, int age, String sex){
        super(name,age,sex);//super指代的是父类所对应的对象  this指代的是本类对应的对象
    }

    Teacher(String name, int age, String sex, int bednumber, String teacherid){
        super(name,age,sex);
        this.bednumber=bednumber;
        this.teacherid=teacherid;
        this.age=age;
    }


    @Override
    public String getID(){
        return "老子是老师"+teacherid;
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
