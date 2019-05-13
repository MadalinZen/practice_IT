package Practice_IT_Cap8_Classes;

public class Name {

    private String firstName;

    private char middleInitial;

    private String lastName;


    public static void main(String[] args) {

        System.out.println(getNormalOrder("John",'O',"Doe"));
        System.out.println(getReverseOrder("Dumitrache","Alexandra",'O'));

    }


    public static String getNormalOrder(String firstName,char middleInitial,String lastName){

        String normalOrder = "";

        normalOrder = firstName +" "+  middleInitial+". " + lastName ;

        return  normalOrder;
    }

    public static String getReverseOrder(String lastName,String firstName,char middleInitial){

        String getReverseOrder  = "";

        getReverseOrder = lastName +", "+ firstName +" " + middleInitial +"." ;

        return  getReverseOrder;
    }


}
