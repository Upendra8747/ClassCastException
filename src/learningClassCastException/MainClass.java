package learningClassCastException;

public class MainClass {
	public static void main(String[] args) {
		Java j1 = new Jspiders();
		Java j2 = new Qspiders();
		Qspiders q = (Qspiders )j2;
		String str1 =q.name;
		System.out.println(str1);
		System.out.println(j1);
		System.out.println(q.name+" "+q.toString());
	}
}
