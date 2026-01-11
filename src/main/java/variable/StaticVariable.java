package variable;

public class StaticVariable {
	
	static String lastName ="Masionet"; // static variable
	
	 String fistName; // instance variable

	public static void main(String[] args) {
		StaticVariable sv= new StaticVariable();
		sv.joseFullName();
		sv.maggieFullName();

	}
	
	public void joseFullName() {
		//Initialization
		fistName="Jose";
		System.out.println(fistName+" "+lastName);
	}
	
	
	public void maggieFullName() {
		fistName="Maggie";
		System.out.println(fistName+" "+lastName);
		
	}

}
