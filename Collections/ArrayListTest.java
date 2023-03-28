import java.util.*;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("Tom");
        a.add("joey");
        a.add("jam");
        System.out.println(a.size());
        for(int i=0;i< a.size(); i++){
            System.out.println(a.get(i));
        }
        System.out.println("-----");
        // enhanced for loop
        for(String s: a){
            System.out.println(s);
        }
        System.out.println("-----");
        // stream with lambda
        a.stream().forEach(ele -> System.out.println(ele));
        System.out.println("-----");
        // iterator
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
