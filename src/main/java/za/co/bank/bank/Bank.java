package za.co.bank.bank;
import za.co.bank.people.employee.Employee;
import java.util.Scanner;
public class Bank{

final String bankName = "Kenson";
final double registerNumber = 123456789;
final String address = "leyds st, 129 Glend Robin";
 public Employee [] employees;
Employee person = new Employee();

public void registerEmployee(Employee person, Scanner scanner){
                    employees = new Employee[3];			
                
					System.out.print("Enter Surname : ");
					String surname = scanner.nextLine();
					person.setSurname(surname);

					scanner.nextLine();

					System.out.print("Enter Name : ");
					String name = scanner.nextLine();
					person.setName(name);

					System.out.print("Enter age : ");
					int age =scanner.nextInt();
					person.setAge(age);

					System.out.print("Enter ID Number : ");
					long idNum = scanner.nextLong();
					person.setIdNum(idNum);

					System.out.print("Enter Phone Number : ");
					long phoneNum = scanner.nextLong();
					person.setPhoneNum(phoneNum);

					System.out.print("Enter email address : ");
					String email = scanner.nextLine();
					person.setEmail(email);

					scanner.nextLine();

					System.out.print("Enter Residential Address : ");
					String houseAddress = scanner.nextLine();
					person.setHouseAddress(houseAddress);

					System.out.print("Enter Position : ");
					String position = scanner.nextLine();
					person.setOccupation(position);

					person.setUserName(person.getSurname() + person.getAge());
					person.setPassword(person.getOccupation() + person.getAge());
                
					employees[0]=person;

			
	}




}