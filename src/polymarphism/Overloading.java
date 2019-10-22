package polymarphism;

public class Overloading {
	
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	public void add(String x, String y) {
		System.out.println(x +" : "+y);
	}
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add(25, 75);
		o.add(10, 30, 50);
		o.add("seshu", "reddy");
	}

}
