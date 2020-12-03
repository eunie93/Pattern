package com.test.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*  val join = Join()
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
          }*/
        var randomNum = Random()
        var random = arrayOf("인증", "가입", "푸시")
        val num = randomNum.nextInt(random.size-1)
        var state = random[num]

        Log.d("상태체크", "$num $state")
        button.text = state
        button.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var command = commandFunc()
        var login = Login()
        var join = Join()
        var push = Push()

        when(p0){
            button->{
                when(button.text){
                    "인증"->{
                        command.setPattern(login)
                        command.run()
                    }
                    "가입"->{
                        command.setPattern(join)
                        command.run()
                    }
                    "푸시"->{
                        command.setPattern(push)
                        command.run()
                    }
                }
            }
        }
    }

    class commandFunc {
        var command: CommandPattern? = null

        fun setPattern(command: CommandPattern) {
            this.command = command
        }
        fun run() {
            command!!.run()
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

  /*  class Main : StatePattern {
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
    }*/
}