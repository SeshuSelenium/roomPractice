package inheritance;

public class Child extends Parent {
	public void y() {
		System.out.println("y() in child");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.x();
		c.y();
	}

}
