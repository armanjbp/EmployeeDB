package com.virtusa.controller;

import java.util.List;

import com.virtusa.entities.Employees;
import com.virtusa.helper.FactoryEmployeeDB;
import com.virtusa.helper.RequestType;
import com.virtusa.model.EmployeesModel;
import com.virtusa.service.EmployeesService;
import com.virtusa.view.EmployeeView;

public class EmployeeController {
	private EmployeesService employeesService;

	public EmployeeController() {
		this.employeesService = FactoryEmployeeDB.creaEmployeesService();
	}

	public void handleRetriveEmployees(RequestType request) {
		EmployeeView employeeview=new EmployeeView();
	
		List<EmployeesModel> models=employeesService.retriveEmployees();
		
		switch (request) {
		case NAME:employeeview.showEmployeeName(models);
			break;
		case CONTACT:employeeview.showEmployeeContact(models);
			break;
		case SALARY:employeeview.showEmployeeSalary(models);
			break;
		default:
			break;
		}
	}
	public void handleretrivedepartment(int employeeId)
	{
	EmployeesModel employees=employeesService.retriveDepartmentName(employeeId);
	}

}
