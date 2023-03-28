import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistCompare{
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>(Arrays.asList("A","B","C","E","F"));
        ArrayList<String> al1 = new ArrayList<>(Arrays.asList("A","B","C","D"));
        Collections.sort(al);
        Collections.sort(al1);
        System.out.println(al.equals(al1));
            // finding out additional elements
        // al.removeAll(al1); // E,F
            // finding out missing elements
        al1.removeAll(al); //D
        System.out.println(al1);
            //finding out common elements
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("C","JS","JAVA"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("C","JS","Python"));
        lang1.retainAll(lang2);
        System.out.println(lang1);
    }
}
