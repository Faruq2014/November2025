package method;

public class VoidAndReturnMethod {

	static double momyGive=20.00;
	
	public static void main(String[] args) {
		VoidAndReturnMethod vrm= new VoidAndReturnMethod();
		double spent=vrm.prntikaBuyGrocery();
		
		//return method
		double moneyLefyByPrantika=momyGive-spent;
		System.out.println(moneyLefyByPrantika);
		
		// void method-- return nothing
		vrm.nishatBuyGrocery();
				
	}
	
	public void nishatBuyGrocery() {
		int apple=6;
		double milk=6.49;
		double spentTotlaNishat =apple+milk;
		System.out.println(spentTotlaNishat);
		double moneyLeftNyNishat=momyGive-spentTotlaNishat;
		System.out.println(moneyLeftNyNishat);
				
	}
	
	public double prntikaBuyGrocery() {
		int apple=5;
		double milk=6.49;
		double spentTotlaPrantika =apple+milk;
		System.out.println(spentTotlaPrantika);
		
		return spentTotlaPrantika;
		
	}

}
