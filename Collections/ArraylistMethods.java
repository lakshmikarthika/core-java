import java.util.*;
//
// add,addAll,clear,clone,contains,indexOf,lastIndexOf,remove,removeIf,subList,toArray
public class ArraylistMethods{
    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("ram");
        ar.add("sai");
        ar.add("shiva");
        ar.add("sun");
        ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("allah","jesus","allah"));
        ar.addAll(ar1);                                             // addAll used to combine 2 arraylists
        ar1.clear();                                                // clearing all the elements
        ArrayList<String> clonedList = (ArrayList<String>)ar.clone();// cloning to a new obj
        System.out.println(clonedList.contains("bam"));              // returns boolean
        System.out.println(ar.indexOf("sai"));
        System.out.println(clonedList.lastIndexOf("allah"));
        ar.remove("sun");
        System.out.println(ar);
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> sub = new ArrayList<Integer>(numbers.subList(2, 4));
        numbers.removeIf(n -> n%2==0);
        System.out.println(sub);
        Object arr[] = clonedList.toArray();
        System.out.println(Arrays.toString(arr));
        // for(Object o: arr){
        //     System.out.println(o);
        // }
    }
}
