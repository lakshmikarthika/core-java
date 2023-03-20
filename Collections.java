// import java.util.List;
// import java.util.Set;
// import java.util.HashSet;
// import java.util.ArrayList;
// import java.util.TreeSet;
import java.util.*;
public class Collections{
    public static void main(String[] args){
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();  basic set
        Set<Integer> nums = new TreeSet<Integer>();     // set along with sorting
        nums.add(20);
        nums.add(10);
        nums.add(40);
        nums.add(20);
        for(int n: nums){
            System.out.println(n);
        }
    }
}
