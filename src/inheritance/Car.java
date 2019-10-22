package inheritance;

public class Car extends Lorry {
	public static void onMusic() {
		System.out.println("onMusic() car");
	}
	public static void onAc() {
		System.out.println("onAc() car" );
	}
	public static void main(String[] args) {
	Car c = new Car();
	c.start();
	c.stop();
	c.load();
	c.onAc();
	c.onMusic();
	}
}
