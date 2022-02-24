package com.example.less13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.less13.presintation.MainFragment
import com.example.less13.presintation.SecondFragment
import com.example.less13.presintation.utils.navigateTo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.navigateTo(fragment = MainFragment())
    }
}