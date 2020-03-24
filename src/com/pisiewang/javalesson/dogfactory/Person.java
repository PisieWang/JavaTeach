package com.pisiewang.javalesson.dogfactory;

public abstract class  Person implements Xman {
    public  String name;
    public  int age=20;
    public  String sex;
    String ablity;


    Person(){

    }




    //函数的重载/重构
    Person(String name,int age,String sex){

        this.age=age;
    }


    public String getName(){
        return name;
    }


    abstract String getID ();



}