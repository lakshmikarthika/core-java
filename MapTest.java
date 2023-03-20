import java.util.HashMap;
import java.util.Map;
public class MapTest{
    public static void main(String[] args){
        Map <String, Integer> students = new HashMap<>();
        students.put("Lucky",90);
        students.put("Chandra",80);
        students.put("Karthi",50);
        students.put("Mom",92);
        students.put("Lucky",70);
        System.out.println(students.keySet());
        for(String name : students.keySet()){
            System.out.println(name + ":" + students.get(name));
        }
    }
}
