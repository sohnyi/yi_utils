package com.sohnyi.timeuti

import java.util.Calendar
import java.util.concurrent.TimeUnit

/**
 * Description：Calendar 拓展
 *
 * Create by yi on 2021/4/30
 */


/**
 * 是否是今天
 */
val Calendar.isToday: Boolean
    get() {
        val todayCalendar = Calendar.getInstance()
        return this.isSameDay(todayCalendar)
    }

/**
 * 当前与今天相隔多少天
 * 早于今天: <0
 * 今天为:   =0
 * 晚于今天: >0
 * @link CalendarEtx.kt
 */
val Calendar.apartToday: Int
    get() = this.apartDays(Calendar.getInstance())

/**
 * 计算给出的日期是否与当前日期为同一天
 * @param c 给定的日期
 * @return 是否为同一天
 */
fun Calendar.isSameDay(c: Calendar): Boolean {
    return (this.get(Calendar.YEAR) == c.get(Calendar.YEAR)
            && this.get(Calendar.DAY_OF_YEAR) == c.get(Calendar.DAY_OF_YEAR))
}

/**
 * 计算给出的日期是否与当前日期相差多少天
 * @param c 给定的日期
 *
 * @return 相差的天数
 * 早于今天: <0, 今天为: =0, 晚于今天: > 0
 */
fun Calendar.apartDays(c: Calendar): Int {
    if (this.time == c.time) {
        return 0
    }

    if (this.get(Calendar.YEAR) == c.get(Calendar.YEAR)
        && this.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_YEAR)
    ) {
        return 0
    }

    val apartMilliSeconds = this.time.time - c.time.time
    val days = TimeUnit.MILLISECONDS.toDays(apartMilliSeconds);

    // 默认使用 Int
    return days.toInt()
}




