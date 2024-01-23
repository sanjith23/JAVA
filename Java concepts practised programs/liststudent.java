import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student {

    int age;
    String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student [age=" + age + ", name=" + name + "]";
    }

}

public class liststudent {

    public static void main(String[] args) {

        Comparator<student> com = new Comparator<student>() {
            public int compare(student i, student j) {
                if (i.age > j.age)

                    return 1;
                else
                    return -1;

            }
        };

        List<student> students = new ArrayList<>();

        students.add(new student(12, "Rahul"));
        students.add(new student(22, "Ganesh"));
        students.add(new student(13, "Siddesh"));
        students.add(new student(11, "Akarsh"));
        students.add(new student(10, "Avinash"));

        Collections.sort(students, com);

        for (student n : students) {
            System.out.println(n);
        }
    }
}