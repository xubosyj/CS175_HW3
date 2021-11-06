package com.bytedance.compicatedcomponent.homework

import android.app.Activity
import android.os.Bundle
import com.bytedance.compicatedcomponent.R

/**
 *  author : neo
 *  time   : 2021/10/30
 *  desc   :
 */
//定时发送更新消息给UI线程
//handler获取实时时间，给控件属性赋值
//控件改写为通过属性拿到值来draw转动度数
//默认值为当前时间
class ClockActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)
    }
}