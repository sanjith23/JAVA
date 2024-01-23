import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practisecollections {

    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                    else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(23);
        nums.add(43);
        nums.add(22);
        nums.add(243);
        nums.add(111);
        nums.add(22);
        nums.add(54);

        Collections.sort(nums,com);

        System.out.println(nums);
        
        // ---------------------------


        // Map<String,Integer> students = new HashMap<>();

        // students.put("Navin",45);
        // students.put("krishna",90);
        // students.put("Tarantino",99);
        // students.put("S Narayan",87);

        // System.out.println(students.get("krishna"));
        // System.out.println(students.keySet());

        // for(String key : students.keySet())
        // {
        //     System.out.println(key + " : " + students.get(key));
        // }



        // for(Object n : nums)
        // {
        //     int num = (Integer)n;
        //     System.out.println(nums);
        // }


    }
}