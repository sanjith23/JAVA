import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * arr
 */
public class arr {
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {

            public int compare(String i, String j) {

                if (i.length() % 10 > j.length() % 10)
                    return 1;
                else
                    return -1;

            }
        };

        Set<String> nums = new ArrayList<String>();

        nums.add("Abcercqw");
        nums.add("abcdre");
        nums.add("acferrrrrrrr");
        nums.add("frvmvm");
        nums.add("vv");

        Collections.sort(nums, com);

        System.out.println(nums);

        // for(int n: xyz){
        // System.out.println(n);
        // }

    }

}
