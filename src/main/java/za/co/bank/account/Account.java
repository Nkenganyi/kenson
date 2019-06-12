package za.co.bank.account;

public class Account{

public final static String accountName = "FNB";
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



}
