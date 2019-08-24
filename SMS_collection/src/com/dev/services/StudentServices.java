package com.dev.services;

import java.util.List;

import com.dev.beans.Student;

public interface StudentServices {
	Boolean createProfileService(Student student);
	Student searchStudentService(Integer id);
	Boolean updateEmailService(Integer id,String email, String password);
	Student deleteStudentService(Integer id);
	List<Student>getAllStudentsService();
	Student login(Integer id,String password);

}
