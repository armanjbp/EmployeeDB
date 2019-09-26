package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.Dao.EmployeesDAO;
import com.virtusa.entities.Departments;
import com.virtusa.entities.Employees;
import com.virtusa.helper.FactoryEmployeeDB;
import com.virtusa.model.DepartmentsModel;
import com.virtusa.model.EmployeesModel;

public class EmployeesServiceImpl implements EmployeesService {

	private EmployeesDAO EmployeesDAO;

	public EmployeesServiceImpl() {
		this.EmployeesDAO = FactoryEmployeeDB.createEmployeesDAO();

	}

	@Override
	public List<EmployeesModel> retriveEmployees() {
		List<EmployeesModel> employeesModelsList = new ArrayList<>();
		try {
			List<Employees> employeeList = EmployeesDAO.getAllEmployees();
			for (Employees employees : employeeList) {
				EmployeesModel employeesModel = new EmployeesModel();
				employeesModel.setFullName(employees.getFirstName() + " " + employees.getLastName());
				employeesModel.setTotalSalary(employees.getSalary() + employees.getCommissionPCT());

				employeesModel.setContactDetails(employees.getPhoneNumber() + " , " + employees.getEmail());
				employeesModelsList.add(employeesModel);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return employeesModelsList;
	}

	@Override
	public EmployeesModel retriveDepartmentName(int employeeId) 
	{
		Employees employees=null;
		EmployeesModel employeesModel=new EmployeesModel();
		
		try {
			employees=EmployeesDAO.getDepartmentName(employeeId);
			Departments departments=employees.getDepartments();
			DepartmentsModel departmentsModel=new DepartmentsModel();
			departments.setDepartment_name(departments.getDepartment_name());
			departments.setDepartment_name(departments.getDepartment_name());
			employeesModel.setDepartmentsModel(departmentsModel);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return employeesModel;
	}

}
