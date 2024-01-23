import java.util.HashMap;
import java.util.Map;

/**
 * practisemap
 */
public class practisemap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Sanjith", 99);
        students.put("rakesh", 44);
        students.put("roshan", 55);
        students.put("Rahul", 84);
        students.put("siddesh", 33);

        System.out.println(students.get("siddesh"));

        System.out.println(students.compute(Rahul, ));
 
        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key) );
        }
    }
}