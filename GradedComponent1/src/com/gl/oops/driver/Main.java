package com.gl.oops.driver;


import com.gl.oopss.AdminDepartment;
import com.gl.oopss.HrDepartment;
import com.gl.oopss.TechDepartment;

public class Main {
	 public static void main(String[] args) {
	        AdminDepartment adminDepartment = new AdminDepartment();
	        System.out.println(adminDepartment.departmentName());
	        System.out.println(adminDepartment.getTodaysWork());
	        System.out.println(adminDepartment.getWorkDeadline());
	        System.out.println(adminDepartment.isTodayAHoliday());

	        System.out.println();

	        HrDepartment hrDepartment = new HrDepartment();
	        System.out.println(hrDepartment.departmentName());
	        System.out.println(hrDepartment.getTodaysWork());
	        System.out.println(hrDepartment.getWorkDeadline());
	        System.out.println(hrDepartment.isTodayAHoliday());

	        System.out.println();

	        TechDepartment techDepartment = new TechDepartment();
	        System.out.println(techDepartment.departmentName());
	        System.out.println(techDepartment.getTodaysWork());
	        System.out.println(techDepartment.getWorkDeadline());
	        System.out.println(techDepartment.getTechStackInformation());
	        System.out.println(techDepartment.isTodayAHoliday());
	    }
}
