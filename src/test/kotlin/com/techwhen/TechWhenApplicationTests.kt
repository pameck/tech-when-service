package com.techwhen

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
object TechWhenApplicationTests {

	@Test
	fun contextLoads() {
        val result = true
        assertThat(result, equalTo(false))
	}

}

