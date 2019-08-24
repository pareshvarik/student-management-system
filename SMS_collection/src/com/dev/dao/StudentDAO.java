package com.dev.dao;

import java.util.List;

import com.dev.beans.Student;

public interface StudentDAO {
	Boolean createProfile(Student student);
	Student searchStudent(Integer id);
	Boolean updateEmail(Integer id,String email, String password);
	Student deleteStudent(Integer id);
	List<Student>getAllStudents();
}
