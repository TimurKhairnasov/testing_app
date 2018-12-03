package com.example.timur.testing_app

class Student(firstName: String, lastName: String){
    private var firstName = ""
    private var lastName = ""

    init {
        this.firstName = firstName
        this.lastName = lastName
    }

    fun getFirstName(): String{
        return firstName
    }

    fun getLastName(): String{
        return lastName
    }
}