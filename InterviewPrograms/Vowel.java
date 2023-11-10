import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vowel {
	public static void main(String[] args) {
		List<Character> li = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		String str = "cat";
		char[] arr = str.toCharArray();
		for(int i = 0; i<arr.length;i++) {
			if(li.contains(arr[i]))
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}
