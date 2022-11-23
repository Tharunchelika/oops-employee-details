package java1;

import java.util.*;

class Emp_details{
	int id,experience;
	String name,mobile_number,gender,DOB,DOJ,address;
	long salary;
	Emp_details(int id,String name,long salary,String mobile_number,String gender,String address,String DOB,String DOJ,int experience){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.mobile_number=mobile_number;
		this.gender=gender;
		this.address=address;
		this.DOB=DOB;
		this.DOJ=DOJ;
		this.experience=experience;
	}
}


public class Employee {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Emp_details> al =new ArrayList<>();
		
		int id,experience;
		String name,mobile_number,gender,DOB,DOJ,address;
		long salary;
		
		while(true) {
			int c=0;
			System.out.println("1 : Add Employee Details");
			System.out.println("2 : View Single Employee");
			System.out.println("3 : View All Employee Details");
			System.out.println("4 : Update Employee Details");
			System.out.println("5 : Delete Employee Details");
			System.out.println("6 : EXIT");
			
			System.out.println("Enter your choice:");
			int option = sc.nextInt();
			if(option==1) {

			    sc.nextLine();
				System.out.println("enter employee details to add");
				System.out.println("enter emp_id");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter emp_name");
				name =sc.nextLine();
				System.out.println("enter salary");
				salary=sc.nextLong();
				System.out.println("enter mobile number");
				mobile_number=sc.next();
				System.out.println("enter gender");
				gender=sc.next();
				sc.nextLine();
				System.out.println("enter address");
				address =sc.nextLine();
				System.out.println("enter date of birth ");
				DOB=sc.nextLine();
				System.out.println("enter date of joining");
				DOJ=sc.nextLine();
				System.out.println("enter experience");
				experience =sc.nextInt();
				al.add(new Emp_details(id,name,salary,mobile_number,gender,address,DOB,DOJ,experience));
				System.out.println("employee details successfully added");	
				System.out.println();
			}
			else if(option == 2) {
				System.out.println("enter Employee id to display");
				id=sc.nextInt();
				Iterator<Emp_details> i =al.iterator();
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("|%10s |%15s |%8s |%15s |%8s |%30s |%11s |%11s |%11s |","employee_id","employee_name","salary","mobile_number","gender","address","DOB","DOJ","experience");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
				while(i.hasNext()) {
					Emp_details e = i.next();
					if(e.id==id) {
						System.out.printf("|%10s |%15s |%8s |%15s |%8s |%30s |%11s |%11s |%11s |",e.id,e.name,e.salary,e.mobile_number,e.gender,e.address,e.DOB,e.DOJ,e.experience);

						c=1;
					}
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
					
				}
				if(c==0) {
					System.out.println("not found employee id with"+id);
				}
				System.out.println();
			}
			else if(option == 3) {
				Iterator<Emp_details> i =al.iterator();
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("|%10s |%15s |%8s |%15s |%8s |%30s |%11s |%11s |%11s |","employee_id","employee_name","salary","mobile_number","gender","address","DOB","DOJ","experience");
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
				while(i.hasNext()) {
					Emp_details e = i.next();
					System.out.printf("|%10s |%15s |%8s |%15s |%8s |%30s |%11s |%11s |%11s |",e.id,e.name,e.salary,e.mobile_number,e.gender,e.address,e.DOB,e.DOJ,e.experience);
					c=1;
					System.out.println();
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

				}
				if(c==0) {
					System.out.println("no records to display");
				}
				System.out.println();
			}
			else if(option == 4) {
				System.out.println("enter employee id to update");
				id=sc.nextInt();
				Iterator<Emp_details> i =al.iterator();
				while(i.hasNext()) {
					Emp_details e = i.next();
					if(e.id==id) {
						c=1;
						System.out.println("1.id\n2.name\n3.salary\n4.address\n5.gender\n6.DOB\n7.DOJ\n8.experience");
						System.out.println("choose an option to update");
						int val=sc.nextInt();
						sc.nextLine();
						switch(val) {
						case(1):
							System.out.println("enter new id");
							int new_id=sc.nextInt();
							e.id=new_id;
							break;
						case(2):
							System.out.println("enter new name");
							name=sc.nextLine();
							e.name=name;
							break;
						case(3):
							System.out.println("enter new salary");
						    e.salary=sc.nextLong();
							break;
						case(4):
							System.out.println("enter new mobile number");
						    e.mobile_number=sc.nextLine();
							break;
						case(5):
							System.out.println("enter new address");
							e.address=sc.nextLine();
							break;
						case(6):
							System.out.println("enter gender");
							e.gender=sc.nextLine();
							break;
						case(7):
							System.out.println("enter DOB");
							e.DOB=sc.nextLine();
							break;
						case(8):
							System.out.println("enter DOJ");
							e.DOJ=sc.nextLine();
							break;
						case(9):
							System.out.println("enter experience");
							e.experience=sc.nextInt();
							break;
						}
					}
				}
				if(c==1) {
					System.out.println("Employee details updated successfully");
				}
				else {
					System.out.println("No employee found with id "+id);
				}
				System.out.println();
			}
			else if(option == 5) {
				System.out.println("enter Employee id to delete");
				id=sc.nextInt();
				Iterator<Emp_details> i =al.iterator();
				while(i.hasNext()) {
					Emp_details e = i.next();
					if(e.id==id) {
						i.remove();
						c=1;
						break;
					}
				}
				if(c==1) {
					System.out.println(id+" deleted successfully");
				}
				else {
					System.out.println(id+" is not found");
				}
				System.out.println();
			}
			else if(option == 6) {
				System.out.println("you are exited");
				break;
			}
		}
	}

}
