import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ComparatorTest{
    public static void main(String[] args){
        Comparator<String> com = new Comparator<>(){
            public int compare(String i, String j){
                if(i.length() < j.length())                        // sort on basis of length
                    return 1;
                else
                    return -1;
            }
        };
        List<String> nums = new ArrayList<>();
        nums.add("abcd");
   	    nums.add("xyz");
   	    nums.add("efghi");
   	    nums.add("kp");
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
