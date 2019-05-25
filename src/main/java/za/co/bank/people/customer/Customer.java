package za.co.bank.people.customer;
import za.co.bank.people.person.Person;
import za.co.bank.account.Account;
import java.util.Scanner;

public class Customer extends Person{




public void deposit(Account account, Scanner scanner ){
            System.out.print("Enter Account Number : ");
            int accountNum = scanner.nextInt();
            if(accountNum == account.getAccountNum()){
            System.out.println("Is the account Holder's name correct : " + getName() + " " + getSurname());
          System.out.print("Enter Amount to be Deposited : ");
            double amount = scanner.nextInt();
           account.setAmount(amount); 
            System.out.println("Your Account has been loaded with : R" + amount);
          amount = amount +  account.getBalance();
          account.setBalance(amount); 
            System.out.println("New balance : R" + account.getBalance());
            System.out.println();
}else {
System.out.println("incorrect account Number : ");
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