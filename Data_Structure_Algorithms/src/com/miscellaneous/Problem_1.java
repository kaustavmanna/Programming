package com.miscellaneous; /**
 * @author kaustavmanna
 *
 */

/* 
 * @Problem Statement ---> Use custom Comparator to sort objects
 * 
 * */

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	private String name;
	private int salary;
	
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
}

class SalaryComparator implements Comparator<Employee>
{
	public int compare(Employee a, Employee b)
	{
		if(a.getSalary() < b.getSalary())
			return 1;
		else if(a.getSalary() == b.getSalary())
			return 0;
		else
			return -1;
	}
}

public class Problem_1
{
	public static void main(String[] args)
	{
		List<Employee> emp = new ArrayList<Employee>();
		Scanner in = new Scanner(System.in);
		try
		{
			int n = in.nextInt();
			for(int i = 0; i < n; i++)
			{
				String name = in.next();
				int salary = in.nextInt();
				Employee a = new Employee(name, salary);
				emp.add(a);
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Wrong Input!");
		}
		
		emp.sort(new SalaryComparator());
		
		System.out.println(emp.get(0).getName() + ": " + emp.get(0).getSalary());
		in.close();
	}
}
