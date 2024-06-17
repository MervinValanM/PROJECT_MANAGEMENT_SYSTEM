package com.mervinvalan.studentsystem.service;



import com.mervinvalan.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
