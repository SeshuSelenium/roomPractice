package doubt;

public class MethodReturnType {

	public int siri(int sbi, int hdfc) {
		String s = "sirishaReddy";
		
		int siriHavingTotalAmount = sbi+hdfc;
		System.out.println("sum of : "+siriHavingTotalAmount);
		return siriHavingTotalAmount;
	}


	public static void main(String[] args) {
		MethodReturnType mr = new MethodReturnType();
		mr.siri(10000, 2500);
		
	}

}
