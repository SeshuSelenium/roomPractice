package polymarphism;

public class StaticPolymarphism {
	
	public void add(int a) {
		
		System.out.println(a);
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(long x , long y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		StaticPolymarphism sp = new StaticPolymarphism();
		sp.add(25);
		sp.add(25, 75);
		sp.add(200005, 10245879);
	}
	

}
