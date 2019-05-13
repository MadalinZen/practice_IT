package Practice_IT_Cap8_Classes;

public class ConstructorName {

    private String firstName;

    private char middleInitial;

    private String lastName;


    public ConstructorName(String firstName,char middleInitial,String lastName){

        this.firstName = firstName;

        this.middleInitial = middleInitial;

        this.lastName = lastName;
    }


    public static void main(String[] args) {

        ConstructorName constructorName = new ConstructorName("Allison",'E',"Oborun");

        System.out.println(constructorName.toString());

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
