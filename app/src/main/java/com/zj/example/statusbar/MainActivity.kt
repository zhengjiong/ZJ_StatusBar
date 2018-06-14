package com.zj.example.statusbar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * CreateTime:18/6/14  08:35
 * @author 郑炯
 * @version 1.0
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setText("请看这个页面的Toolbar和状态栏重叠啦，怎么解决呢？不急不急，先说说沉浸式的原理吧！原理：其实沉浸式就是把整个布局拉伸到全屏显示，这样自然而然就会使得布局的最顶端和状态栏重合了，好吧，以下给出五种解决方案，大家根据项目需求自己看着使用哦，不可结合使用。")


        btn_one.setOnClickListener {
            startActivity(Intent(this@MainActivity, OneActivity::class.java))
        }

        btn_two.setOnClickListener {
            startActivity(Intent(this@MainActivity, TwoActivity::class.java))
        }
    }
}
