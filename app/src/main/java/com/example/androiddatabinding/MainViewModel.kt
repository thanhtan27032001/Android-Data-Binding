package com.example.androiddatabinding

class MainViewModel {

    var name: String? = null
    var age: Int? = null

    constructor(name: String?, age: Int?) {
        this.name = name
        this.age = age
    }

    constructor()


    fun getInfo(): String {
        return "$name - $age"
    }
}