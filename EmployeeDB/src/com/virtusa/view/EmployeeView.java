package com.virtusa.view;

import java.util.List;

import com.virtusa.model.EmployeesModel;

public class EmployeeView 
{
	public void showEmployeeName(List<EmployeesModel> models)
	{
		for(EmployeesModel model:models)
		{
			System.out.print(model.getFullName()+" \n ");
		}
	}
	public void showEmployeeContact(List<EmployeesModel> models)
	{
		for(EmployeesModel model:models)
		{
			System.out.print(model.getContactDetails()+" \n ");
		}
	}
	public void showEmployeeSalary(List<EmployeesModel> models)
	{
		for(EmployeesModel model:models)
		{
			System.out.print(model.getTotalSalary()+" \n ");
		}
	}

}
