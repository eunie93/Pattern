package com.test.myapplication

class PrototypeService {
    private val showcase = HashMap<String, Product>()
    fun register(name: String, proto: Product) {
        showcase.put(name, proto)
    }
    fun create(name: String?): Product? {
        return (showcase.get(name) as Product).createClone()
    }
}