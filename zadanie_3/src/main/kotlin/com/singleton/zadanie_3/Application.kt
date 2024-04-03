package com.singleton.zadanie_3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application(private val authService: AuthService) {
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
