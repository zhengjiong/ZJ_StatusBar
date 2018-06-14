package com.zj.example.statusbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * 解决方法1:在布局界面添加view标签，高度指定为status_bar_height
 *
 * CreateTime:18/6/14  08:35
 * @author 郑炯
 * @version 1.0
 */
class OneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

    }
}