package com.pisiewang.javalesson.dogfactory;

public class Dog {
    private int age;   //成员变量有默认值0
    private int height;
    private double weight;
    private int iq;
    private String name;  //默认值 null

    Dog(){

    }

//自己调整构造函数
    Dog(int age,double weight){
        this.age=age;
        this.weight=weight;
    }

    void act(){
    }

    void scream(){ //喊出自己多少岁    作为一个完美的javabean  所有的成员变量不能从外部访问  必须封装到方法里
        for (int i=0;i<age;i++){
            System.out.println("汪");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
