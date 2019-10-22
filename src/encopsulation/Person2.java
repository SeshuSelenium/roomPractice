package encopsulation;

public class Person2 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(25);
		p.setId(101);
		p.setName("seshu");
		
		System.out.println(p.getAge());
		System.out.println(p.getId());
		System.out.println(p.getName());

	}

}
