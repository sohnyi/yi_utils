package com.sohnyi.timeuti

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.Calendar


/**
 * Date 拓展类
 * Create by yi on 5/2/21
 */

private const val DEFAULT_FORMAT_PATTERN: String = "yyyy/MM/dd HH:mm:ss"

/**
 * 日期格式化
 */
fun Date.toDateString(
    pattern: String = DEFAULT_FORMAT_PATTERN,
    locale: Locale = Locale.getDefault()
): String {
    val format = SimpleDateFormat(pattern, locale)
    return format.format(this)
}

/**
 * 是否为今天
 */
val Date.isToady: Boolean
    get() {
        return if (this == Date()) {
            true
        } else {
            Calendar.getInstance().apply {
                time = this@isToady
            }.isToday
        }
    }

