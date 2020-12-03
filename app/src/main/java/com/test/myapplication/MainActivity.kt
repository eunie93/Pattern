package com.test.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var pattern: StatePattern? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val join = Join()
        val main = Main()
        val err = Err()
        val login = Login()
        var randomNum = Random()
        val num = randomNum.nextInt(4)
        var random = arrayOf("로그인", "로그아웃", "비회원", "세션만료", "서버응답없음")
        var state = random[num]

        Log.d("상태체크", "$num $state")

        when (state) {
            "로그인" -> {
                pattern = main
                pattern!!.showState()
            }
            "로그아웃", "세선만료" -> {
                pattern = login
                pattern!!.showState()
            }
            "비회원" -> {
                pattern = join
                pattern!!.showState()
            }
            "서버응답없음" -> {
                pattern = err
                pattern!!.showState()
            }
        }
    }

    class Main: StatePattern {
        override fun showState() {
            Log.d("상태체크", "Main 고고")
        }
    }

    class Login : StatePattern {
        override fun showState() {
            Log.d("상태체크", "로그인화면 고고")
        }
    }

    class Join : StatePattern {
        override fun showState() {
            Log.d("상태체크", "회원가입 고고")
        }
    }

    class Err : StatePattern {
        override fun showState() {
            Log.d("상태체크", "에러화면 고고고")
        }
    }
}