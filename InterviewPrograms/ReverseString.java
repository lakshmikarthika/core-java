public class StringReverse {
	public static void main(String[] args) {
		String s = "Hello";
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		String s2 =sb.toString();
		System.out.println(s2);

  		// using reverse method from string builder
    		String str = "Morning";
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());


		// using string concatenation
		String name = "lucky";
		char[] nameArr = name.toCharArray();
		String rev = "";
		for(int i = nameArr.length-1; i>=0; i--) {
			rev += nameArr[i];
			
		}
		System.out.println(rev);
	}
}
