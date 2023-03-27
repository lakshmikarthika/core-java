import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistDuplicates{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,10,4,2,4,1,7,4));
        // LinkedHashSet<Integer> latest = new LinkedHashSet<Integer>(num);    // preserves order aswell
        HashSet<Integer> hashSet = new HashSet<Integer>(num);                  // we get sorted list
        ArrayList<Integer> original = new ArrayList<Integer>(hashSet);
        System.out.println(original);

        // JDK 8: stream()
        List<Integer> num2 = num.stream().distinct().collect(Collectors.toList());
        System.out.println(num2);
    }
}