package com.will.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.will.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //在kotlin中使用viewBinding 可以有效到控制控件引用的作用域，防止引用别的layout中的控件
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.textView.text = "haha"

        binding.textView2.text = "look"
        binding.textView3.text = "flag"

    }
}