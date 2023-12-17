package com.cogoport.example.model.student

import io.micronaut.core.annotation.Introspected

@Introspected
data class StudentModel(
    var id: Long?,
    var name: String
)
