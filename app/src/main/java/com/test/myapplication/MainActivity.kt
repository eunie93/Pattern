package com.test.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logManager.printMsg("출력")

        //shallow copy
        val userShallow = User("이름이다", 12)
        val copyShallow = userShallow
        copyShallow.name = "얕은사람"
        copyShallow.age = 17
        Log.d("체크해보자", userShallow.name + userShallow.age.toString() + "\n" + copyShallow.name + copyShallow.age.toString())

        //deep copy
        val userDeep = User("이름이다", 12)
        val copyDeep = userDeep.copy(name = "깊은사람", age = 99)
        Log.d("체크해보자", userDeep.name + userDeep.age.toString() + "\n" + copyDeep.name + copyDeep.age.toString())
    }
}