package com.sohnyi.timeuti

import java.util.Date
import java.util.Calendar

/**
 * Description：Long 的拓展
 *
 * Create by yi on 2021/4/30
 */

/// 日期相关

/**
 * 是否是今天
 * @link CalendarEtx.kt
 */
val Long.isToady: Boolean
    get() {
        val c = Calendar.getInstance()
        c.time = Date(this)
        return c.isToday
    }

/**
 * 于今天相隔多少天
 * 早于今天: <0
 * 今天为:   =0
 * 晚于今天: >0
 * @link CalendarEtx.kt
 */
val Long.apartToady: Int
    get() {
        val c = Calendar.getInstance()
        c.time = Date(this)
        return c.apartToday
    }

///
