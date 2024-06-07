package com.example.myapplication

class Employee internal constructor(var name: String, var age: Int) {
    fun getname(): String {
        return this.name
    }

    fun putname(name: String) {
        this.name = name
    }

    fun getage(): Int {
        return this.age
    }

    fun putage(age: Int) {
        this.age = age
    }
}
