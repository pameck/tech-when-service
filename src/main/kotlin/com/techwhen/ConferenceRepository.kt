package com.techwhen

import java.time.Instant
import java.util.Date

object ConferenceRepository {

    fun findAll(): List<Conference> {
       return listOf(
               Conference(
                   "KotlinConf",
                   "Melbourne",
                   "kotlinconf.com.au",
                   Date(Instant.now().toEpochMilli()),
                   Date(Instant.now().toEpochMilli()))
                )
    }
}