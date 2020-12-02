package com.test.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logManager.printMsg("출력")
        val user = User("user",22)
        var copyShallow: User = user.clone()

        copyShallow.name = "얕은사람"
        copyShallow.age = 17
        Log.d("체크해보자", user.name + user.age.toString() + "\n" + copyShallow.name + copyShallow.age.toString())
    }
}