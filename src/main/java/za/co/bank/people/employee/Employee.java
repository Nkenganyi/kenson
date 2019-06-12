package za.co.bank.people.employee;
import  za.co.bank.people.person.Person;
import za.co.bank.people.customer.Customer;
import za.co.bank.account.Account;

import java.util.Scanner;

public class Employee extends Person{

private String userName;
private String password;

public void setUserName(String userName){
    this.userName = userName;
}

public String getUserName(){
    return this.userName;
}

public void setPassword(String password){
    this.password = password;
}

public String getPassword(){
    return this.password;
}



public Account [] accounts;
public Customer [] customers;

public void createAccount(Customer customer, Scanner scanner, Account account){
        
        System.out.println();
        System.out.println("......................Welcomre to kenson Banking System.......................");
        System.out.println();
        System.out.print("                            Create Account here"           );
        System.out.println();

        System.out.println("enter Number of account you want to create");
        int number = scanner.nextInt();

        customer = new Customer();
        account = new Account();

        accounts = new Account[number];
        customers = new Customer[number];
        
            for(int a=0; a<number; a++){
        System.out.println("Account Name: " + Account.accountName);
        scanner.nextLine();
        System.out.print("enter name : ");
        String name = scanner.nextLine();
        customer.setName(name);
    
        System.out.print("enter Surname : ");
        String surname = scanner.nextLine();
        customer.setSurname(surname);

        System.out.print("enter age : ");
        int age = scanner.nextInt();
        customer.setAge(age);

        System.out.print("enter id Num : ");
        long idNum = scanner.nextLong();
        customer.setIdNum(idNum);

        scanner.nextLine();
        System.out.print("ente Occupation :");
        String occupation = scanner.nextLine();
        customer.setOccupation(occupation);

        System.out.print("enter phone Number : ");
        long phone = scanner.nextLong();
        customer.setPhoneNum(phone);

        System.out.print("enter house Address : ");
        String address = scanner.nextLine();
          customer.setHouseAddress(address);
    
         scanner.nextLine();
        System.out.print("enter Email : ");
        String email = scanner.nextLine();
        customer.setEmail(email);

        System.out.print("Enter Account Num : ");
        long accountNum = scanner.nextLong();
        account.setAccountNum(accountNum);

        System.out.print("enter Pin : ");
        int pin = scanner.nextInt();
        account.setPin(pin);

        String username = customer.getName() + "@" + customer.getSurname();
        account.setUserName(username);

        customers[a] = customer;
        accounts[a] = account;

        System.out.println();
        System.out.println("This is your User Name Please Keep it Safe : " + account.getUserName());
        System.out.println("this is your secret Pin Please don't share it any person : " + account.getPin()); 
}

}


}