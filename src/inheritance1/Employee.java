package inheritance1;

public class Employee extends Person {
	public void doJob() {
		System.out.println("employee does the job ");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.age=26;
		e.name="seshu";
		System.out.println(e.name);
		System.out.println(e.age);
		e.walk();
		e.doJob();
	}
}
