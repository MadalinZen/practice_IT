package Practice_IT_Cap8_Classes;

import java.util.Comparator;

public class Student implements Comparable <Student> {

    @Override
    public int compareTo(Student o) {
        return this.nume.compareTo(o.getNume());
    }

    public static class ComparatorByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            return o1.nume.compareTo(o2.nume);
        }


    }

    public static class ComparatorByNameReverse implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {

            return o2.nume.compareTo(o1.nume);
        }


    }

    private String nume ;



    public Student(String nume){

        this.nume = nume;
    }

    public Student() {

    }

    @Override
    public String toString(){

        return nume ;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public boolean equals(Object o) {

        Student x = (Student) o ;

        return x.nume.equals(((Student) o).nume);
    }

    @Override
    public int hashCode(){

        return nume.hashCode() ;
    }
}
