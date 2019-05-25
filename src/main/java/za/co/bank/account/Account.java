package za.co.bank.account;
import za.co.bank.people.person.Person;
import za.co.bank.people.customer.Customer;
import java.util.Scanner;

public class Account{

final static String accountName = "FNB";
private long accountNum ;
private int pin;
private double balance;
private double amount;
private String userName;

public void setUserName(String userName){
this.userName = userName;
}

public String getUserName(){
return this.userName;
}

public void setAccountNum(long accountNum){
this.accountNum = accountNum;
}

public long getAccountNum(){
return this.accountNum;
}
 
public void setPin(int pin){
this.pin = pin;
}

public int getPin(){
return this.pin;
}

public void setAmount(double amount){
this.amount = amount;
}
 public double getAmount(){
return this.amount;
}

public void setBalance(double balance){
this.balance = balance;
}

public double getBalance(){
return this.balance;
}


public void createAccount(Customer customer, Scanner scanner){
        System.out.println();
        System.out.println("......................Welcomre to kenson Banking System.......................");
        System.out.println();
        System.out.print("                            Create Account here"           );
        System.out.println();
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
        setAccountNum(accountNum);

        System.out.print("enter Pin : ");
        int pin = scanner.nextInt();
        setPin(pin);

        String username = customer.getName() + "@" + customer.getSurname();
        setUserName(username);

        System.out.println();
        System.out.println("This is your User Name Please Keep it Safe : " + getUserName());
        System.out.println("this is your secret Pin Please don't share it any person : " + getPin()); 
}












}
