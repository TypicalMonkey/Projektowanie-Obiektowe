package com.singleton.zadanie_3

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RestController
class AuthController @Autowired constructor(private val authService: AuthService) {

    private val logger: Logger = LoggerFactory.getLogger(AuthController::class.java)

    @PostMapping("/login")
    fun login(@RequestParam username: String, @RequestParam password: String): String {
        logger.info("Login: $username")

        return if (authService.authenticate(username, password)) {
            logger.info("Login successful: $username")
            "Authentication successful"
        } else {
            logger.warn("Login failed: $username")
            "Authentication failed"
        }
    }

    @GetMapping("/data")
    fun getData(): List<String> {
        logger.debug("Losowe dane")
        return listOf("ab", "cd", "ef")
    }
}
