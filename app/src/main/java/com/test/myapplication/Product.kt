package com.test.myapplication

interface Product : Cloneable {
    fun use(use: String?): String?
    fun createClone(): Product?
    companion object {
        val maps: Map<String, String> = HashMap()
    }
    override fun clone(): Any {
        return super.clone()
    }
}