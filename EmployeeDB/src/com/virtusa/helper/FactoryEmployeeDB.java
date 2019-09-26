package com.virtusa.helper;

import com.virtusa.Dao.EmployeesDAO;
import com.virtusa.Dao.JDBCEmployeesDAOImpl;
import com.virtusa.service.EmployeesService;
import com.virtusa.service.EmployeesServiceImpl;

public class FactoryEmployeeDB {
	public static EmployeesDAO createEmployeesDAO() {
		EmployeesDAO employeesDAO = new JDBCEmployeesDAOImpl();
		return employeesDAO;

	}

	public static EmployeesService creaEmployeesService() {
		EmployeesService employeesService = new EmployeesServiceImpl();
		return employeesService;
	}

}
