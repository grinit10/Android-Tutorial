package com.example.kotlinexample

fun main() {
    val i12 = MobilePhone("iOS", "Apple", "iPhone 12", "2019")
    val s20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    val mate = MobilePhone("Android", "Huawei", "Mate X S")
    i12.displayPhone()
    s20.displayPhone()
    mate.displayPhone()
}

class MobilePhone(osName: String, brand: String, model: String) {
    private var releaseYear: String? = null
    var osName: String = osName
    var brand: String = brand
    var model: String = model

    constructor(osName: String, brand: String, model: String, releaseYear: String): this(osName, brand, model) {
        this.releaseYear = releaseYear;
    }

    fun displayPhone(){
        println("The phone $model from $brand uses $osName as its Operating System" + (if (releaseYear != null)  " and is release in $releaseYear" else ""))
    }
}
