package com.gl.application;


import com.gl.department.AdminDepartment;
import com.gl.department.HrDepartment;
import com.gl.department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment a = new AdminDepartment();
		a.departmentName();
		a.getTodaysWork();
		a.getWorkDeadline();
		a.isTodayAHoliday();
		
		System.out.println();
		
		HrDepartment b = new HrDepartment();
		b.departmentName();
		b.doActivity();
		b.getTodaysWork();
		b.getWorkDeadline();
		b.isTodayAHoliday();
		
		System.out.println();
		
		TechDepartment c = new TechDepartment();
		c.departmentName();
		c.getTodaysWork();
		c.getWorkDeadline();
		c.getTechStackInformation();
		c.isTodayAHoliday();
	}

}
