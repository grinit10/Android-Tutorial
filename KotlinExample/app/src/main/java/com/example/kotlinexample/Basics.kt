package com.example.kotlinexample

import java.lang.IllegalArgumentException

fun main() {
    val i12 = MobilePhone("iOS", "Apple", "iPhone 12", 2023)
    val s20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    val mate = MobilePhone("Android", "Huawei", "Mate X S")
    i12.displayPhone()
    s20.displayPhone()
    mate.displayPhone()
}

class MobilePhone(osName: String, brand: String, model: String) {
    private var releaseYear: Int? = null
    var osName: String = osName
    var brand: String = brand
    var model: String = model

    constructor(osName: String, brand: String, model: String, releaseYear: Int): this(osName, brand, model) {
        this.releaseYear = if  ((releaseYear as Int) <2022) releaseYear else throw IllegalArgumentException("Release year must be less than 2022");
    }

    fun displayPhone(){
        println("The phone $model from $brand uses $osName as its Operating System" + (if (releaseYear != null)  " and is released in $releaseYear" else ""))
    }
}
