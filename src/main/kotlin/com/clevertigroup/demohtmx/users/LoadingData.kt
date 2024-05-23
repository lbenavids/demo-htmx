package com.clevertigroup.demohtmx.users

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
class LoadingData(val repository: UserRepository) : CommandLineRunner{
    private fun getRandomString(length: Int) : String {
        val allowedChars = ('a'..'z') + ('A'..'Z')
        return (1..length)
            .map { Random.nextInt(0, allowedChars.size) }
            .map(allowedChars::get)
            .joinToString("")
    }

    override fun run(vararg args: String?) {
        repository.deleteAll()

        // Generating a list of 5 random users
        val users = (1..50).map { User(name = getRandomString(Random.nextInt(0,10)), username = getRandomString(Random.nextInt(0,10))) }

        // Saving all the users
        repository.saveAll(users)
    }
}