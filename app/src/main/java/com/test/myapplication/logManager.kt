package com.test.myapplication

import javax.inject.Singleton

@Singleton
class logManager {
    companion object {
        fun print(msg: String) {
            print(msg)
        }
    }
}