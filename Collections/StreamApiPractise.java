import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiPractise {
	public static void main(String[] args) {
		//List<Integer> li = new ArrayList<Integer>();
		List<Integer> nums = Arrays.asList(2,4,3,5);
		System.out.println(nums);
		int result = nums.stream()
			.filter(n -> n%2 == 0)
			.map(n -> n*2)
			.reduce(0,(c,e) -> c+e);
		Stream<Integer> sortedNums = nums.stream().sorted();
		sortedNums.forEach(s -> System.out.println(s));
		System.out.println(result);
	}
}
