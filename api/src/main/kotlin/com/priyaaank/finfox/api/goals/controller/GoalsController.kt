package com.priyaaank.finfox.api.goals.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/goals")
class GoalsController {

    @Get("/all")
    fun index(): String {
        return "Welcome to Goals Controller"
    }

}