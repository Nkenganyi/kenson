package za.co.bank.people.customer;
import za.co.bank.people.person.Person;
import za.co.bank.account.Account;
import za.co.bank.people.employee.Employee;
import java.util.Scanner;

public class Customer extends Person{




public void deposit(Account account, Scanner scanner, Employee employee ){
            System.out.print("Enter Account Number : ");
            int accountNum = scanner.nextInt();

            for(int a=0; a<employee.accounts.length; a++ ){

            if(accountNum == employee.accounts[a].getAccountNum()){
            System.out.println("Is the account Holder's name correct : " + employee.customers[a].getName() + " " + employee.customers[a].getSurname());

          System.out.print("Enter Amount to be Deposited : ");
            double amount = scanner.nextInt();
           employee.accounts[a].setAmount(amount); 
            System.out.println("Your Account has been loaded with : R" + amount);
          amount = amount +  employee.accounts[a].getBalance();
          employee.accounts[a].setBalance(amount); 
            System.out.println("New balance : R" + employee.accounts[a].getBalance());
            System.out.println();
}else {
System.out.println("incorrect account Number : ");
}
}
}
public void withdraw(Account account,  Scanner scanner){
        System.out.println();
        System.out.println("Current balance : " + account.getBalance());
        System.out.println();
        System.out.print("Enter the amount to be Withdrawn : ");
        double balance = scanner.nextDouble();
        account.setBalance(account.getBalance() - balance);

        System.out.println("R " + balance+ " has been withdrawn from your Account");
        System.out.println("Your current balance is : " + account.getBalance());
}

public void checkBalance(Account account){
         System.out.println();
        System.out.println("Your balance is R" + account.getBalance());
         System.out.println();



}



}