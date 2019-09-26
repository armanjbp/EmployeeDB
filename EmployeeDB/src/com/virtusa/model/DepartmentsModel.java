package com.virtusa.model;

public class DepartmentsModel 
{
	private String DepaartmentName;
	public void DepaartmentName() {}
	public String getDepaartmentName() {
		return DepaartmentName;
	}
	public void setDepaartmentName(String depaartmentName) {
		DepaartmentName = depaartmentName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DepaartmentName == null) ? 0 : DepaartmentName.hashCode());
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
		DepartmentsModel other = (DepartmentsModel) obj;
		if (DepaartmentName == null) {
			if (other.DepaartmentName != null)
				return false;
		} else if (!DepaartmentName.equals(other.DepaartmentName))
			return false;
		return true;
	}

}
