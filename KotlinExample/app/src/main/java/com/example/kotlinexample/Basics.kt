package com.example.kotlinexample

fun main() {
    MobilePhone("iOS", "Apple", "iPhone 12")
    MobilePhone("Android", "Samsung", "Galaxy S20")
    MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String) {
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}
