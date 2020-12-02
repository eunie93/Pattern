package com.test.myapplication

class MessageBox(private val deco: String) : Product {
    override fun use(s: String?): String? {
        return deco + s + deco
    }
    override fun createClone(): Product? {
        var p: Product? = null
        try {
            p = clone() as Product?
        } catch (ex: CloneNotSupportedException) {
            ex.printStackTrace()
        }
        return p
    }
}