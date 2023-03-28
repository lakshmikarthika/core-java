import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class HashmapTest{
    public static void main(String[] args){
        HashMap<String,String> capital = new HashMap<String,String>();
        capital.put("India", "Delhi");
        capital.put("UK", "London");
        capital.put("China", "Beijing");
        capital.put("korea", "seoul");
        System.out.println(capital.get("India"));
        capital.remove("China");
        // iterator(keys): using keySet()
        Iterator<String> it = capital.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = capital.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }
        System.out.println("------");
        // iterator(set): using entrySet()
        Iterator<Entry<String,String>> it1 = capital.entrySet().iterator();
        while(it1.hasNext()){
            Entry<String,String> entry = it1.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println("------");
        // using forEach and lambda
        capital.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}