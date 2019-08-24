package com.dev.app;

import java.util.Scanner;
import com.dev.beans.Student;
import com.dev.exception.CreateProfileException;
import com.dev.exception.DeleteProfileException;
import com.dev.exception.GetAllStudentDetailsException;
import com.dev.exception.LoginErrorException;
import com.dev.exception.SearchProfileException;
import com.dev.exception.UpdateEmailException;
import com.dev.repo.Database;
import com.dev.services.StudentServiceImp;
import com.dev.services.StudentServices;

public class App 
{

	public static void main(String[] args) {
		
		int option = 0;
		int studentid=0;
		String updatedemail;
		String enteredpassword;
		StudentServices dao = new StudentServiceImp();
		
		Scanner  sc=new Scanner(System.in);
		System.out.println("Welcom to student Management System");
		
		outer:while(true){
			System.out.println();
			System.out.println("Enter the choice: ");
			System.out.println("1-create profile");
			System.out.println("2-search student");
			System.out.println("3-update email of student");
			System.out.println("4-delete student");
			System.out.println("5-to get all student detail");
			System.out.println("6-To login");
			System.out.println("7-To exit");
			option=sc.nextInt();
			switch(option){
			case 1:
				Student s6 = new  Student();
				System.out.println("enter the student id:");
				s6.setId(sc.nextInt());
				System.out.println("enter the student name:");
				s6.setName(sc.next());
				System.out.println("enter the student email id:");
				s6.setEmail(sc.next());
				System.out.println("enter the password");
				s6.setPassword(sc.next());
				boolean state = dao.createProfileService(s6);
				if(!state){
					throw new CreateProfileException();
				}else{
					System.out.println(s6);
					System.out.println("Success in Profile Creation");
				}
				break;
			case 2:
				System.out.println("enter the student id which u want to search:");
				studentid=sc.nextInt();
				Student a=dao.searchStudentService(studentid);
				if(a==null)
				{
					throw new  SearchProfileException();
				}
				else
				{
					System.out.println(a);
					System.out.println("Profile has been searched sucessfully");
					
				}
				break;
			case 3:
				System.out.println("enter the id of the student which u want to update the email");
				studentid=sc.nextInt();
				System.out.println("enter the email which u want to update");
				updatedemail=sc.next();
				System.out.println("enter the password which email u want to update");
				enteredpassword=sc.next();
				Boolean val=dao.updateEmailService(studentid, updatedemail,enteredpassword);
				if(!val){
					throw new UpdateEmailException();
				}else{
					System.out.println("Email updated sucessfully");
				}
				break;
			case 4://delete the student
				
				System.out.println("enter the student id which u want to delete");
				studentid=sc.nextInt();
				 Student value=dao.deleteStudentService(studentid);
				 if(value==null){
						throw new DeleteProfileException();
					}else{
						System.out.println(value);
						
					}
				 break;
			case 5://get all student details
				Database d=new Database();
				if(d.map.isEmpty())
				{
					throw new GetAllStudentDetailsException();
				}
				else {
				dao.getAllStudentsService();
				}
				break;
			case 6:
				System.out.println("Enter the student id which you want to login");
				studentid=sc.nextInt();
				System.out.println("Enter the password with student id "+studentid+" :");
				enteredpassword=sc.next();
				Student log=dao.login(studentid, enteredpassword);
				if(log==null)
				{
				   throw new LoginErrorException();	
				}
				else 
				{
					System.out.println("Login Sucessfull.....");
					System.out.println(log);
				}
				break;
			case 7:
					System.out.println("exit from the student management system");
					sc.close();
					break outer;
			}
		}
	}
}
