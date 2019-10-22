package methods;

public class SpecialMethod {
	int id;
	String name;
	public SpecialMethod(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public SpecialMethod() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		SpecialMethod sm = new SpecialMethod();
		
		SpecialMethod sp1 = new SpecialMethod(1001, "seshu");
		System.out.println(sp1.id);
		System.out.println(sp1.name);
		
	}

}
