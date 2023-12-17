package com.cogoport.example.api
import io.micronaut.runtime.Micronaut.build
fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.cogoport.example.api")
        .start()
}
