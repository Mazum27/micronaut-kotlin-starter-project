package com.cogoport.example.api.student.repository

import com.cogoport.example.api.student.entity.Student
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository

@R2dbcRepository(dialect = Dialect.POSTGRES)
interface StudentRepository : CoroutineCrudRepository<Student, Long>
