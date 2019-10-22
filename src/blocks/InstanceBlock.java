package blocks;

public class InstanceBlock {
	{
		System.out.println("instance block");
	}
	{
		System.out.println("instance block 2");
	}

	public static void main(String[] args) {
		InstanceBlock in = new InstanceBlock();
		System.out.println("main");

	}

}
