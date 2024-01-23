package programs;

import java.util.ArrayList;

public class dupplicateinarraylist {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();

    list.add("apple");
    list.add("apple");
    list.add("banana");
    list.add("grapes");

    for (int i = 0; i < list.size(); i++) {
      if (list.contains(list.get(i))) {
        System.out.println(list.get(i) + "is duplicate");

      }
    }

  }

}
