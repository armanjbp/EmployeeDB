package com.virtusa.Dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Employees;

/*
 * Declartion of data Operations for business Entity Employees;
 * 
 * 
 */
public interface EmployeesDAO {
	public List<Employees> getAllEmployees() throws ClassNotFoundException, SQLException;

	public Employees getDepartmentName(int employeeId) throws ClassNotFoundException, SQLException;

}
