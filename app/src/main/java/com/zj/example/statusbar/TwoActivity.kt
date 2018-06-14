package com.zj.example.statusbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gyf.barlibrary.ImmersionBar

/**
 * 解决方法2: android:fitsSystemWindows="true"
 *
 * fitSystemWindow属性可以让DecorView的内容区域(这里是内容区域并不是DecorView本身,可以用tools中的
 * Layout Inspect来查看, DecorView中有3个并列的控件分别是, 一个LinearLayout也就是内容区域, 一个statusBar,一个navigationBar)
 * 延伸到系统UI下方，也就是在状态栏下方绘制,
 * 防止在扩展时被覆盖，达到全屏、沉浸等不同体验效果。
 * 查看Layout Inspect发现, 其实就是给内容区域Linearlayout加了一个paddingTop
 *
 * CreateTime:18/6/14  08:35
 * @author 郑炯
 * @version 1.0
 */
class TwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        ImmersionBar.with(this)
                .statusBarColor(R.color.colorPrimary)
                .init();
    }
}