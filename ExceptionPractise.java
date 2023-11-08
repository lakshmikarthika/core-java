public class ExceptionPractise {
	public static void main(String[] args) {
		int i= 30;
		int j= 0;
		int[] arr = new int[5];
		try {
			j = 20/i;
			if(j==0) {
				throw new ArithmeticException("0 is not correct value");
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("check for value: "+e);
		}
		try {
			System.out.println(arr[5]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("check array");
		}
		catch(Exception e) {
			System.err.println("check code again");
		}
		System.out.println(j);
		System.out.println("End");
	}
}
