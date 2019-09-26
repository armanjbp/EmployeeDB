package com.virtusa.entities;
/*Business Entity representing physical data model-Departments
 * DEPARTMENT_ID   NOT NULL NUMBER(4)    
   DEPARTMENT_NAME NOT NULL VARCHAR2(30) 
   MANAGER_ID               NUMBER(6)    
   LOCATION_ID              NUMBER(4)    

 * 
 */
public class Departments
{
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	
	public Departments() {}


	public int getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}


	public String getDepartment_name() {
		return department_name;
	}


	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}


	public int getManager_id() {
		return manager_id;
	}


	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}


	public int getLocation_id() {
		return location_id;
	}


	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}


	@Override
	public String toString() {
		return "Departments [department_id=" + department_id + ", department_name=" + department_name + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + department_id;
		result = prime * result + ((department_name == null) ? 0 : department_name.hashCode());
		result = prime * result + location_id;
		result = prime * result + manager_id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departments other = (Departments) obj;
		if (department_id != other.department_id)
			return false;
		if (department_name == null) {
			if (other.department_name != null)
				return false;
		} else if (!department_name.equals(other.department_name))
			return false;
		if (location_id != other.location_id)
			return false;
		if (manager_id != other.manager_id)
			return false;
		return true;
	}
	

}
