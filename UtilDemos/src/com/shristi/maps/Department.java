package com.shristi.maps;

public class Department {

	private String deptHead;
	private int deptId;
	private String deptName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptHead, int deptId, String deptName) {
		super();
		this.deptHead = deptHead;
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptHead=" + deptHead + ", deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
