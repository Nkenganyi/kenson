package za.co.bank.people.employee;
import  za.co.bank.people.person.Person;

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




}