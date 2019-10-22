package dynamic.polymarphism;

public class Employee extends Person {
	public void doJob() {
		System.out.println("doJob() Employee");
	}
	public static void main(String[] args) {
		Person p = new Employee();
		p.walk();
		
	}

}
