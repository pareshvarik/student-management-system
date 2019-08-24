package com.dev.repo;

import java.util.HashMap;
import java.util.Map;

import com.dev.beans.Student;

public class Database {
	
	public Map<Integer,Student> map;
	
	public Database() {
		map = new HashMap<>();
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Paresh Varik");
		s1.setPassword("root");
		s1.setEmail("varikparesh@gmail.com");
		map.put(s1.getId(), s1);
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Vinyas BT");
		s2.setPassword("1234");
		s2.setEmail("vinyas@gmail.com");
		map.put(s2.getId(), s2);
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("santosh Bhandari");
		s3.setPassword("12345");
		s3.setEmail("santosh@gmail.com");
		map.put(s3.getId(), s3);
		
		Student s4 = new Student();
		s4.setId(104);
		s4.setName("Vinyas BT");
		s4.setPassword("123456");
		s4.setEmail("vinyas@gmail.com");
		map.put(s4.getId(), s4);
		
		Student s5 = new Student();
		s5.setId(105);
		s5.setName("Dinga");
		s5.setPassword("1234567");
		s5.setEmail("dinga@gmail.com");
		map.put(s5.getId(), s5);
		
		
	}
}
