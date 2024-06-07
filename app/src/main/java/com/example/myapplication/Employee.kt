package com.example.myapplication;

public class Employee {
    String name;
    int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getname() {
        return this.name;
    }
    public void putname(String name){
        this.name = name;
    }
    public int getage() {
        return this.age;
    }
    public void putage(int age){
        this.age = age;
    }
}
