package com.main;

import java.util.Scanner;

import com.main.db.DB;
import com.main.model.Employee;

public class App {

	public static void main(String[] args) {
		DB db = new DB();
		Employee employee = new Employee();
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********DB OPS********");
		System.out.println("1. Insert Employee");
		System.out.println("2. Show all Employees");
		System.out.println("3. Delete Employee");
		System.out.println("4. Update Employee");
		
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting... Bye!!!");
			break;
		}
		
		
		switch(input) {
		case 1:
			//Read the values from the User
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Employee Salary");
			String salary = sc.next();
			System.out.println("Enter Employee City");
			String city = sc.next();
			System.out.println("Enter Employee Department Name");
			String dpName = sc.next();
			// Attach these values to Employee Object
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		
		}
	
		}
		

	}


}
