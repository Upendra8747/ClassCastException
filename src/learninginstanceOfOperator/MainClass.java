package learninginstanceOfOperator;

public class MainClass {
	public static void main(String[] args) {
		BMS b = new BMS();
		
		MechanicalDepartment m = new MechanicalDepartment();
		
		ComputerScience c = new ComputerScience();
		
		System.out.println(b instanceof BMS);
		
		System.out.println(c instanceof BMS);
		
		System.out.println(c instanceof BMS);
		
		System.out.println(b instanceof ComputerScience);		
		



	}
}
