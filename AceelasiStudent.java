package Practice_IT_Cap8_Classes;

import java.util.HashSet;
import java.util.Set;

public class AceelasiStudent {

    public static void main(String[] args) {

        Set<Student> s = new HashSet<>();

        Student x = new Student("Catalin");
        Student y = new Student("Catalin");

        System.out.println(x.equals(y));

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        s.add(x);
        s.add(x);
        s.add(y);



        System.out.println(s);
    }



}
