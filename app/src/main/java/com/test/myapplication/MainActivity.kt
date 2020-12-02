package com.test.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logManager.printMsg("출력")

        // Shallow Copy
        // 단순 대입이라 다른 리스트 값에 영향을 미침
        var copy1 = ArrayList<String>()
        copy1.add("A")
        copy1.add("B")
        var copy2 = ArrayList<String>()
        copy2 = copy1
        copy2.removeAt(1)

        // Deep Copy
        // 다른 리스트로부터 아이템만 복사해와서 값을 삭제해도 영향을 미치지 않음
        var copy3 = ArrayList<String>()
        copy3.add("A")
        copy3.add("B")
        var copy4 = ArrayList<String>()
        copy4.addAll(copy3)
        copy4.removeAt(1)
    }
}