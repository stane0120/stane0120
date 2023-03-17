package edu.kh.jdbc.dto;

public class Employee2 {
	
	private String departmentTitle;
	private String jobName;
	private int empName;
	private String email;
	
	
	public Employee2() {} // 기본 생성자
	
	public Employee2(String departmentTitle, String jobName, int empName, 
			         String email) {
		
	     this.departmentTitle = departmentTitle;
	     this.jobName = jobName;
	     this.empName = empName;
	     this.email = email;	
	}

	public String getDepartmentTitle() {
		return departmentTitle;
	}

	public void setDepartmentTitle(String departmentTitle) {
		departmentTitle = departmentTitle;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		jobName = jobName;
	}

	public int getEmpName() {
		return empName;
	}

	public void setEmpName(int empName) {
		empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}
}
