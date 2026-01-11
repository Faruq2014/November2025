package variable;
// variable== package name

//ClassScope== class name
public class ClassScope {
	
//main= method name
	//November2025/src/main/java/variable/ClassScope/public static void main
	//main method is a special method
	//java execution starts from main method
	public static void main(String[] args) {
		// method calling formula= class name = new class name()
		ClassScope cs= new ClassScope();
		cs.fullName();
		cs.phoneNumber();
		

	}
	
//fullName== method name
	public void fullName() {
		System.out.println("Jose Maisonet");
	}
	
	public void phoneNumber() {
		System.out.println("7889999999");
	}

}
