package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public class Employee {
	
	private Loader loader;

	public Employee(Loader loader) {
		this.loader = loader;
	}

	public void employeeWithHighestSalary() throws FileNotFoundException, IOException
	{
		Set<String> setList = loader.loading();
		int salary = 0;
		String empName = null;
		for (String set : setList) {
			String[] words = set.split(",");
			if (salary < Integer.parseInt(words[5])) {
				empName = words[1];
				salary = Integer.parseInt(words[5]);
			}
		}
		System.out.println("Employee with highest salary - " + empName);
		System.out.println("Salary is : " + salary);
		System.out.println();
	}

	public void employeeByDeptNumber(int deptNumber) throws FileNotFoundException, IOException
	{
		Set<String> list = loader.loading();
		int count = 0;
		System.out.println("Employees from department no. " + deptNumber + " are ->");
		for (String set : list)
		{
			String[] words = set.split(",");
			if (Integer.parseInt(words[7]) == deptNumber)
			{
				System.out.println(words[1]);
				count++;
			}
		}
		System.out.println("Total no. of employees : " + count);
		System.out.println();
	}

	public void employeeByDesignation(String designation) throws FileNotFoundException, IOException
	{
		Set<String> list = loader.loading();
		int count = 0;
		System.out.println("Employees of designation " + designation + " are ->");
		for (String set : list)
		{
			String[] words = set.split(",");
			if (set.contains(designation))
			{
				System.out.println(words[1]);
				count++;
			}
		}
		System.out.println("Total no. of employees : " + count);
		System.out.println();
	}

	public void numberOfTotalEmployees() throws FileNotFoundException, IOException
	{
		Set<String> list = loader.loading();
		System.out.println("Total no. of employess : " + list.size());
		System.out.println("-----------------------------------------------\n");
	}

}
