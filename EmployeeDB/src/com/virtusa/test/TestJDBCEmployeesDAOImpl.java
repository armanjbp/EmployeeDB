package com.virtusa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.virtusa.Dao.EmployeesDAO;
import com.virtusa.Dao.JDBCEmployeesDAOImpl;
import com.virtusa.entities.Employees;

class TestJDBCEmployeesDAOImpl {

	@Test
	public void testGetAllEmployees_positive() 
	{
	EmployeesDAO employeesDAO=	new JDBCEmployeesDAOImpl();
	try {
		List<Employees> employeeList=employeesDAO.getAllEmployees();
		assertEquals(true, employeeList.size()>0);
	} catch (ClassNotFoundException | SQLException e) {
		assertTrue(false);
	}
	
		
		
	}

}
