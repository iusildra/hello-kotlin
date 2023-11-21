package com.tempotalent.landing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
@RestController
class LandingApplication {
	@GetMapping("/")
	fun home(): String {
		return "Hello World from Kotlin!"
	}
}

fun main(args: Array<String>) {
	runApplication<LandingApplication>(*args)
}

