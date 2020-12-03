package com.test.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var randomNum = Random()
        var random = arrayOf("인증", "가입", "푸시")
        val num = randomNum.nextInt(random.size - 1)
        var state = random[num]

        var btn = Button(Login(), Join(), Push())
        btn.setMode(num)
        btn.onClick()
        button.text = state

        val listener = View.OnClickListener {
            btn.onClick()
        }
        button.setOnClickListener(listener)
    }

    class Button(var login: Login, var join:Join, var push:Push) {
        var num = 0
        fun setMode(mode: Int) {
            this.num = mode
        }

        fun onClick() {
            when (num) {
                0 -> {
                    login.loginFun()
                }
                1 -> {
                    join.joinFun()
                }
                2 -> {
                    push.pushFun()
                }
            }
        }
    }


    class Login : CommandPattern {
        fun loginFun() {
            Log.d("체크해보자", "로그인")
        }
        override fun run() {
            loginFun()
        }
    }

    class Join : CommandPattern {
        fun joinFun() {
            Log.d("체크해보자", "가입")
        }
        override fun run() {
            joinFun()
        }
    }

    class Push : CommandPattern {
        fun pushFun() {
            Log.d("체크해보자", "푸시")
        }
        override fun run() {
            pushFun()
        }
    }
}