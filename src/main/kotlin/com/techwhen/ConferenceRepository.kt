package com.techwhen

import java.time.LocalDateTime

object ConferenceRepository {

    fun findAll(): List<Conference> {
       return listOf(
           Conference(
               "KotlinConf",
               "Melbourne",
               "kotlinconf.com.au",
               LocalDateTime.of(2018, 7, 19, 0, 0),
               LocalDateTime.of(2018, 7, 19, 0, 0)),
           Conference(
               "RubyConf",
               "Melbourne",
               "rubyconf.com.au",
               LocalDateTime.of(2018,10, 9, 0, 0),
               LocalDateTime.of(2018, 10, 9, 0, 0)),
           Conference(
               "YOW",
               "Melbourne",
               "yow.com.au",
               LocalDateTime.of(2018,12, 3, 0, 0),
               LocalDateTime.of(2018, 12, 5, 0, 0))
       )
    }
}
