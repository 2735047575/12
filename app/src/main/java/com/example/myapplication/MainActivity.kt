package com.example.myapplication

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        addLinearLayout()
    }
}

fun addLinearLayout(){
    //创建容器
    val container = LinearLayout(this).apply {
        //设置宽高
        layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        )

        //布局方向
        orientation = LinearLayout.VERTICAL

        //设置颜色
        background = getDrawable(R.color.colorAccent)
    }.also { setContentView(it)}
        //添加容器至Activity
        //创建第一个控件
    LinearLayout(this).apply{
        //获取密度
        //设置高度
        layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,dp2px(100))

        orientation = LinearLayout.HORIZONTAL

        background = getDrawable(R.color.colorAccent)

        container.addView(this)
    }.apply {
        ImageView(this@MainActivity).apply {
            layoutParams =LinearLayout.LayoutParams(
                dp2px(120),
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            setImageResource(R.drawable.header)

            addView(this)
        }
    }
TextView(this).apply {
    layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
    )

    background = getDrawingRect(R.color.colorPrimary)
    container.addView(this)
}
}