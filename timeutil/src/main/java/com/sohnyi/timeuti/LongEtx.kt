package com.sohnyi.timeuti

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Calendar
import java.util.Locale
import java.util.concurrent.TimeUnit

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
        val today = Date()
        return if (this == today.time) {
            true
        } else {
            val c = Calendar.getInstance()
            c.time = today
            c.isToday
        }
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
        val apartMilliSeconds = this - Date().time
        return if (apartMilliSeconds == 0L) {
            0
        } else {
            TimeUnit.MILLISECONDS.toDays(apartMilliSeconds).toInt()
        }
    }

/**
 * 计算给定的时间与当前时间相隔多少天
 * @param time 给定的时间内
 */
fun Long.apartDays(time: Long): Int {
    return if (this == time) {
        0
    } else {
        val apart = this - time
        TimeUnit.MICROSECONDS.toDays(apart).toInt()
    }
}

fun Long.dateString(pattern: String, locale: Locale = Locale.getDefault()): String {
    val format = SimpleDateFormat(pattern, locale)
    return format.format(Date(this))
}

///
