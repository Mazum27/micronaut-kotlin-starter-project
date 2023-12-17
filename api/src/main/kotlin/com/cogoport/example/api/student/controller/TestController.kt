package com.cogoport.example.api.student.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("test")
class TestController {
    @Get
    suspend fun testController(): Boolean {
        return true
    }
}
