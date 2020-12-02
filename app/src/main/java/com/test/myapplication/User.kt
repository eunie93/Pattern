package com.test.myapplication

class User(var name: String, var age: Int) : Cloneable {
    public override fun clone(): User {
        return User(name = name, age = age)
    }
}