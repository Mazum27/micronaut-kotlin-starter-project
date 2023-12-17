package com.cogoport.example.api.student.entity

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity("students")
data class Student(
    @field:Id @GeneratedValue var id: Long?,
    var name: String,
)
