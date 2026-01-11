package variable;

public class InstanceVariable {
	//Declaration 
	String fistName;

	public static void main(String[] args) {
		InstanceVariable iv= new InstanceVariable();
		
		iv.maggieFullName(); 
		iv.joseFullName();
 
		
	}
	
	
	public void joseFullName() {
		//Initialization
		fistName="Jose";
		System.out.println(fistName);
	}
	
	
	public void maggieFullName() {
		fistName="Maggie";
		System.out.println(fistName);
		
	}
	
	

}
