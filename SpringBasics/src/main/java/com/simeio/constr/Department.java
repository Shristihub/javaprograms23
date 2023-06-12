package com.simeio.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Department {

	private String deptHead;
	private String deptName;
	public String getDeptHead() {
		return deptHead;
	}
	@Value("${student.department.head}")
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public String getDeptName() {
		return deptName;
	}
	@Value("${student.department.name}")
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptHead=" + deptHead + ", deptName=" + deptName + "]";
	}
	
}
