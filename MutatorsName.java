package Practice_IT_Cap8_Classes;

public class MutatorsName {

    private String firstName;

    private char middleInitial;

    private String lastName;


    public MutatorsName(String firstName,char middleInitial,String lastName){

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
