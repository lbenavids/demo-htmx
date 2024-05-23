package com.clevertigroup.demohtmx.users

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class LoadingData(val repository: UserRepository) : CommandLineRunner{
    override fun run(vararg args: String?) {
        val users = listOf("abc", "def").map { username -> User(name = username, username = username) }
        repository.saveAll(users)
    }
}