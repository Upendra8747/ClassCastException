package learningClassCastExceptionAndInstanceofOperator;

public class MainClass {
	public static void main(String[] args) {
		Father f = new Son();
		//Daughter d = (Daughter)f;  --> it Shows Compile time error
		if(f instanceof Son) {
			System.out.println("Downcast to Son Object");
			
			Son s = (Son) f;
			System.out.println("Father age: "+s.Fage+" Son age: "+s.Sage);
		}
		else  {
			System.out.println("DownCast To Daughter Object");
		
		}
	}
}
