package com.cogoport.example.api.student.controller

import com.cogoport.example.api.student.service.interfaces.StudentService
import com.cogoport.example.model.common.Response
import com.cogoport.example.model.student.StudentModel
import com.cogoport.example.model.student.request.CreateStudentRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller("student")
class StudentController {

    @Inject
    lateinit var studentService: StudentService
    @Get("/{id}")
    suspend fun getStudent(id: Long): Response<StudentModel> {
        return Response<StudentModel>().ok(HttpStatus.OK.name, studentService.getStudent(id))
    }

    @Post
    suspend fun createStudent(@Body studentModel: CreateStudentRequest): Response<Long?> {
        return Response<Long?>().ok(HttpStatus.OK.name, studentService.createStudent(studentModel))
    }
}
