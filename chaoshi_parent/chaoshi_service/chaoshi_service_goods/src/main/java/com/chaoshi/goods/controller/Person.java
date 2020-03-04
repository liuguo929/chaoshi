package com.chaoshi.goods.controller;

public class Person {
    public static String name = "zs";
    public static int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public static String sleep(){
        return "睡觉~~~~";
    }
}
