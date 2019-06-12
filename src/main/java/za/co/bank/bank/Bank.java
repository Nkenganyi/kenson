package za.co.bank.bank;
import za.co.bank.people.employee.Employee;
import java.util.Scanner;
public class Bank{

final String bankName = "Kenson";
final double registerNumber = 123456789;
final String address = "leyds st, 129 Glend Robin";
 public Employee [] employees;
Employee employee = new Employee();

public void registerEmployee(Employee employee, Scanner scanner){
                    System.out.println();
                    System.out.println("how many number of Employee do you want to register");
                    int num = scanner.nextInt();
                    employees = new Employee[num];			
                
                    for(int a=0; a<num; a++){
                    System.out.println();
					System.out.print("Enter Surname : ");
					String surname = scanner.nextLine();
					employee.setSurname(surname);

					scanner.nextLine();

					System.out.print("Enter Name : ");
					String name = scanner.nextLine();
					employee.setName(name);

					System.out.print("Enter age : ");
					int age =scanner.nextInt();
					employee.setAge(age);

					System.out.print("Enter ID Number : ");
					long idNum = scanner.nextLong();
					employee.setIdNum(idNum);

					System.out.print("Enter Phone Number : ");
					long phoneNum = scanner.nextLong();
					employee.setPhoneNum(phoneNum);

					System.out.print("Enter email address : ");
					String email = scanner.nextLine();
					employee.setEmail(email);

					scanner.nextLine();

					System.out.print("Enter Residential Address : ");
					String houseAddress = scanner.nextLine();
					employee.setHouseAddress(houseAddress);

					System.out.print("Enter Position : ");
					String position = scanner.nextLine();
					employee.setOccupation(position);

					employee.setUserName(employee.getSurname() + employee.getAge());
					employee.setPassword(employee.getOccupation() + employee.getAge());
                
					employees[a] = employee;
                    
			         System.out.println("User Name : " + employee.getUserName());
                     System.out.println("User Name : " + employee.getPassword());
	   }


    }

}