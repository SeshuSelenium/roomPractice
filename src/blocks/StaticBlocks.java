package blocks;

public class StaticBlocks {
	
	static {
		System.out.println("static 1");
	}
	
	static {
		System.out.println("static 2");
	}
	static {
		System.out.println("static 3");
	}
	public static void main(String[] args) {
		
		System.out.println("main");
	}

}
