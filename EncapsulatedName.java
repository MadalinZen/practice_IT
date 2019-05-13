package Practice_IT_Cap8_Classes;

public class EncapsulatedName {

    private String firstName;

    private char middleInitial;

    private String lastName;


    public EncapsulatedName(String firstName,char middleInitial,String lastName){

        this.firstName = firstName;

        this.middleInitial = middleInitial;

        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }


}
