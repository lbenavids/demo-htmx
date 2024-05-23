package com.clevertigroup.demohtmx.users

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/users")
class UserController(
    private val userRepository: UserRepository,
    repository: UserRepository
) {

    @GetMapping
    fun index(model: Model): String = "index"

    @GetMapping("all")
    fun all(model: Model): String {

        val findAll = userRepository.findAll()

        model.addAttribute("users", findAll)


        return "fragments/list"
    }

}