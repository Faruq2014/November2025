package dataType;

public class StringDataType {
	/*
	 * what is first name
	 * what is last name 
	 * what is full name
	 */

	public static void main(String[] args) {
		
    String firstName="Jose";
    String lastName="Maisonet";
    System.out.println(firstName);
    
    //Concatenation
    System.out.println("my frirst name is "  +   firstName);
    System.out.println("my last name is "  +   lastName);
    
  String fullName = firstName +" "+ lastName;
  System.out.println(fullName);
  
  //addition
  String fullName1= firstName + lastName;
  System.out.println(fullName1);
  // in String data type only addition is allow
  //

	}

}
