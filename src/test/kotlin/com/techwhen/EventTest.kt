package com.techwhen

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object EventSpec : Spek({
    describe("an event") {
        val event = Event()

        on("doing something") {
            val result = event.doSomething()

            it("returns true") {
                assertThat(result, equalTo(true))
            }
        }
    }
})