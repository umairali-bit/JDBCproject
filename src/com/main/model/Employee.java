package com.main.model;

public class Employee {
	private int ID;
	private String NAME;
	private String CITY;
	private double SALARY;
	private String departmentName;
	
	public Employee() {
		super();
		
	}

	public Employee(int iD, String nAME, String cITY, double sALARY, String departmentName) {
		super();
		ID = iD;
		NAME = nAME;
		CITY = cITY;
		SALARY = sALARY;
		this.departmentName = departmentName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public double getSALARY() {
		return SALARY;
	}

	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "employee [ID=" + ID + ", NAME=" + NAME + ", CITY=" + CITY + ", SALARY=" + SALARY + ", departmentName="
				+ departmentName + "]";
	}
	
	
	
	

}
