package com.singleton.zadanie_3

import org.springframework.stereotype.Service
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class AuthService private constructor() {

    private val logger: Logger = LoggerFactory.getLogger(AuthService::class.java)

    init {
        logger.debug("Singleton created")
    }

    fun authenticate(username: String, password: String): Boolean {
        logger.debug("Authentication: $username")
        return username == "exampleUser" && password == "examplePassword"
    }

    companion object {
        private val instance: AuthService = AuthService()
        fun getInstance(): AuthService {
            return instance
        }
    }
}
