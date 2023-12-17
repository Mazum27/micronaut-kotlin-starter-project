package com.cogoport.example.api.student.service.interfaces

import com.cogoport.example.model.student.StudentModel
import com.cogoport.example.model.student.request.CreateStudentRequest

interface StudentService {
    suspend fun getStudent(id: Long): StudentModel
    suspend fun createStudent(student: CreateStudentRequest): Long?
}
