package com.techwhen

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

data class Conference(
        val name: String,
        val city: String,
        val website: String,
        private val startDate: LocalDateTime,
        private val endDate: LocalDateTime) {
    private val formatter: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)

    val displayStartDate =  startDate.format(formatter)
    val displayEndDate =  endDate.format(formatter)
}

