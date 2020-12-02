package com.test.myapplication

import javax.inject.Singleton


@Singleton
class logManager {
    companion object {
        fun printMsg(msg: String) {
            print(msg)
        }
    }
}