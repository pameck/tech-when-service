package com.techwhen

import java.time.LocalDateTime

object ConferenceRepository {

    fun findAll(): List<Conference> {
       return listOf(
           Conference(
               "KotlinConf",
               "Melbourne",
               "kotlinconf.com.au",
               LocalDateTime.now(),
               LocalDateTime.now())
       )
    }
}