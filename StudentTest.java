package Practice_IT_Cap8_Classes;

import java.util.*;

public class StudentTest {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Student> listaStudenti = new ArrayList();


//        for (int i = 0 ; i < 10 ; ++i ) {
//
//            listaStudenti.add(new Student(scan.next() + i ));
//        }

        listaStudenti.add(new Student("catalin"));
        listaStudenti.add(new Student("mihai"));
        listaStudenti.add(new Student("andrei"));


        listaStudenti.sort(new Student.ComparatorByName());

        System.out.println(listaStudenti);

        System.out.println("******************");

        listaStudenti.sort(new Student.ComparatorByNameReverse());

        System.out.println(listaStudenti);

        System.out.println("******************");

        Collections.sort(listaStudenti);

        System.out.println(listaStudenti);

        listaStudenti.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getNume().compareTo(o2.getNume());
            }
        });

    }



}
