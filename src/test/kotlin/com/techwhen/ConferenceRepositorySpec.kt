package com.techwhen

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object ConferenceRepositorySpec : Spek({
    describe("conference repository") {

        on("finding all") {
            val result = ConferenceRepository.findAll()

            it("returns a list of conferences") {
                assertThat(result.size, equalTo(1))
            }
        }
    }
})