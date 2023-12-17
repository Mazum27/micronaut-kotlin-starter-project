package com.cogoport.example.api.student.service.implementation

import com.cogoport.example.api.student.entity.Student
import com.cogoport.example.api.student.repository.StudentRepository
import com.cogoport.example.api.student.service.interfaces.StudentService
import com.cogoport.example.model.student.StudentModel
import com.cogoport.example.model.student.request.CreateStudentRequest
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class StudentServiceImpl : StudentService {
    @Inject
    lateinit var studentRepository: StudentRepository
    override suspend fun getStudent(id: Long): StudentModel {
        var student = studentRepository.findById(id) ?: throw Exception("Invalid Id")
        return StudentModel(student.id, student.name)
    }

    override suspend fun createStudent(student: CreateStudentRequest): Long? {
        var studentResponse = studentRepository.save(Student(null, student.name))
        return studentResponse.id
    }
}
