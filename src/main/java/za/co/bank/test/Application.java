package za.co.bank.test;
import za.co.bank.account.Account;
import za.co.bank.bank.Bank;
import za.co.bank.people.customer.Customer;
import za.co.bank.people.employee.Employee;
import za.co.bank.people.person.Person;
import java.util.Scanner;

public class Application{
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);
Account account = new Account();
Customer customer = new Customer();
Bank bank = new Bank();
Employee employee = new Employee();

//bank.registerEmployee(employee, scanner);

for(int a=0; a<5; a++){
System.out.println();
System.out.println("what would you like to do?");
System.out.println("1. Create Account ");
System.out.println("2. Deposit");
System.out.println("3. check Balance");
System.out.println("4. withdraw");
System.out.println();

int option = scanner.nextInt();

if(option == 1){

employee.createAccount(customer, scanner, account);

}
else if(option == 2){

        customer.deposit(account, scanner, employee);
        System.out.println();
}
else if(option == 3){

       customer.checkBalance(account);
}
else if(option ==4){

       customer.withdraw(account, scanner);
 }
} // end of loop/


}
}