package com.virtusa.model;

public class EmployeesModel 
{
	private String fullName;
	private double totalSalary;
	private String contactDetails;
	private DepartmentsModel departmentsModel;
	public EmployeesModel() {
		
	}
	public DepartmentsModel getDepartmentsModel() {
		return departmentsModel;
	}
	public void setDepartmentsModel(DepartmentsModel departmentsModel) {
		this.departmentsModel = departmentsModel;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "EmployeesModel [fullName=" + fullName + ", totalSalary=" + totalSalary + ", contactDetails="
				+ contactDetails + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactDetails == null) ? 0 : contactDetails.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		EmployeesModel other = (EmployeesModel) obj;
		if (contactDetails == null) {
			if (other.contactDetails != null)
				return false;
		} else if (!contactDetails.equals(other.contactDetails))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (Double.doubleToLongBits(totalSalary) != Double.doubleToLongBits(other.totalSalary))
			return false;
		return true;
	}
	
	

}
