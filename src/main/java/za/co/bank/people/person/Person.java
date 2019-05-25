
package za.co.bank.people.person;

public abstract class Person{
private String name;
private String surname;
private int age;
private long idNum;
private long phoneNum;
private String email;
private String houseAddress;
private String occupation;

public void setName(String name){
this.name = name;
}

public String getName(){
return this.name;
}

public void setSurname(String surname){
this.surname = surname;
}

public String getSurname(){
return this.surname;
}
 public void setAge(int age){
this.age = age;
}

public int getAge(){
return this.age;
}

public void setIdNum(long idNum){
this.idNum = idNum;
}

public long getIdNum(){
return this.idNum;
}

public void setEmail(String email){
this.email = email;
}

public String getEmail(){
return this.email;
}

public void setPhoneNum(long phoneNum){
this.phoneNum = phoneNum;
}

public long getPhoneNum(){
return this.phoneNum;
}

public void setHouseAddress(String houseAddress){
this.houseAddress = houseAddress;
}

public String getHouseAddress(){
return this.houseAddress;
}

public void setOccupation(String occupation){
this.occupation = occupation;
}

public String getOccupation(){
return this.occupation;
}


}
