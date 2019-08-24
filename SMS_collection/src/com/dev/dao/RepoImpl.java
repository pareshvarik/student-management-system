package com.dev.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.dev.beans.Student;
import com.dev.repo.Database;

public class RepoImpl implements StudentDAO {

	private Database repo = new Database();

	@Override
	public Boolean createProfile(Student student) 
	{
		student = repo.map.put(student.getId(), student);
		return true;
		/*if(student != null){
			return true;
		}else{
			return false;
		}*/
	}

	@Override
	public Student searchStudent(Integer id)
	{

		if(repo.map.containsKey(id))
		{
			Student a=repo.map.get(id);
			return a;
		}
		else
		{
			return null;
		}	
	}

	@Override
	public Boolean updateEmail(Integer id, String email, String password) {
		Student s = repo.map.get(id);
		if(s != null){
			if(s.getPassword().equals(password)){
				s.setEmail(email);
				return true;
			}
			else{
				return false;
			}
		}else{
			return false;
		}
	}

	@Override
	public Student deleteStudent(Integer id) {

		if(repo.map.containsKey(id)) 
		{
			//remove the data and return the removed data
			Student q=repo.map.get(id);
			repo.map.remove(id);
			return q;
		}
		else {
			return null;
		} 

	}

	@Override
	public List<Student> getAllStudents() {
		Set show=repo.map.entrySet();
		Iterator n=show.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}

		return null;
	}

}

