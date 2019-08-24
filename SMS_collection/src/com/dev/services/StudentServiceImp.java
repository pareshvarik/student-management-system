package com.dev.services;

import java.util.List;

import com.dev.beans.Student;
import com.dev.dao.RepoImpl;
import com.dev.dao.StudentDAO;
import com.dev.repo.Database;

public class StudentServiceImp implements StudentServices {

	StudentDAO obj=new RepoImpl();
	@Override
	public Boolean createProfileService(Student student) {
		return obj.createProfile(student);
	}

	@Override
	public Student searchStudentService(Integer id) {
		return obj.searchStudent(id);
	}

	@Override
	public Boolean updateEmailService(Integer id, String email, String password) {
		return obj.updateEmail(id, email, password);
	}

	@Override
	public Student deleteStudentService(Integer id) {
		return obj.deleteStudent(id);
	}

	@Override
	public List<Student> getAllStudentsService() {
		return obj.getAllStudents();
	}
	@Override
	public Student login(Integer id,String password)
	{
		Database d=new Database();
		Student s = d.map.get(id);
		if(s != null){
			if(s.getPassword().equals(password)){
				
				return s;
			}
			else{
				return null;
			}
		}else{
			return null;
		}
	}

}
