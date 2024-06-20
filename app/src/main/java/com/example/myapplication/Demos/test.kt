package com.example.myapplication.Demos

fun main() {
    var myStudent: Student = Student("Abhay",25, "Assam")
    println(myStudent.name)
    println(myStudent.age)
    myStudent.name = "Abdul"
    myStudent.age = 30
    println(myStudent.name)
    println(myStudent.age)
    var myEmployee: Employee = Employee("Abdul", 30)
    println(myEmployee.name)
    myEmployee.name = "Tanveer"
    println(myEmployee.name)
}