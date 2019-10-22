package inheritanceReturnType;

public class Car extends Vehicle {
	public String onAc() {
		String name = "onAc() car";
		System.out.println(name);
		return name;
	}
	public String onMusic() {
		String name = "onMusic() car";
		System.out.println(name);
		return name;
	}
	
	public static void main(String[] args) {
		Car c= new Car();
		c.start();
		c.stop();
		c.onAc();
		c.onMusic();
	}

}
