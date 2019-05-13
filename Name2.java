package Practice_IT_Cap8_Classes;

public class Name2 {

    private String firstName;

    private char middleInitial;

    private String lastName;


    public Name2(String firstName,char middleInitial,String lastName){

        this.firstName = firstName;

        this.middleInitial = middleInitial;

        this.lastName = lastName;
    }


    public static void main(String[] args) {

        Name2 name2 = new Name2("John",'Q',"Public");

        System.out.println(name2.toString());

    }





    @Override
    public String toString() {

        return
                  firstName  +
                " " + middleInitial +
                ". " + lastName
                ;
    }
}
