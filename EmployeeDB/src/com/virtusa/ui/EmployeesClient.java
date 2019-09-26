package com.virtusa.ui;

import java.util.Scanner;

import com.virtusa.controller.EmployeeController;
import com.virtusa.helper.RequestType;

public class EmployeesClient {

	public static void main(String[] args) 
	{
try(Scanner scanner =new Scanner(System.in);
		
		)
{
	System.out.println("1 view Employee Name");
	System.out.println("2 view Employee Contact");
	System.out.println("3 view Employee Salary");
	System.out.print("Enter choice :");
	int option=scanner.nextInt();
	EmployeeController employeeController=new EmployeeController();
	if(option==1)
	{
		employeeController.handleRetriveEmployees(RequestType.NAME);
	}
	if(option==2)
	{
		employeeController.handleRetriveEmployees(RequestType.CONTACT);
	}
	if(option==3)
	{
		employeeController.handleRetriveEmployees(RequestType.SALARY);
	}
}catch(Exception e)
{e.printStackTrace();
	
}

	}

}
