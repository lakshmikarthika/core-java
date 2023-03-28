import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class HashmapCompare{
    public static void main(String[] args){
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1, "A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
        map2.put(2,"B");
        map2.put(1, "A");
        map2.put(3,"C");

        HashMap<Integer,String> map3 = new HashMap<Integer,String>();
        map3.put(2,"B");
        map3.put(1, "A");
        map3.put(3,"C");
        map3.put(3,"C");
        map3.put(1,"A");

        System.out.println(map1.equals(map2));

        //comparing with keys
        System.out.println(map1.keySet().equals(map3.keySet()));    // keyset ignores duplicate keys

        // combining keys using HashSet
        HashSet<Integer> combine = new HashSet<>(map1.keySet());
        combine.addAll(map3.keySet());
        System.out.println(combine);

        //comparing with values
        // duplicates allowed: arraylist
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));

        // duplicates not allowed: hashset
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
    }
}