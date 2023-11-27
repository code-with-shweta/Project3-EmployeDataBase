package edbms;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Wlcome To The Employee DataBase Project");
	System.out.println("------------------------------------");
	Scanner scan=new Scanner(System.in);
	EmployeeManagementSystem ems=new EmployeeManagementSystemImpl();
	while(true) {
		System.out.println("1:add Employee\n2:display Employee\n3:display All Employee\n4:remove Employee\n5:remove All Employee");
		System.out.println("6:update Employe\n7:count Employee\n8:sort Employee\n9:get Employee With Highest Salary\n10:get Employee With Lowest Salary");
		System.out.println("11.Exit\nEnter Choice:");
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			ems.addEmployee();
			break;
		case 2:
			ems.displayEmployee();
		    break;
		case 3:
			ems.displayAllEmployee();
		    break;
		case 4:
			ems.removeEmployee();
            break;
		case 5:
			ems.removeAllEmployee();
			break;
			
		case 6:
			ems.updateEmployee();
			break;
		case 7:
			ems.countEmployee();
			break;
		case 8:
			ems.sortEmployee();
			break;
		case 9:
			ems.getEmployeeWithHighestSalary();
			break;
			
		case 10:
			ems.getEmployeeWithLowestSalary();
			break;
		}
	}
			
}
}

