package Practice_IT_Cap3_ParametersAndObjects;

public class LastDigit {

    public static void main(String[] args) {
        System.out.println(lastDigit(3572));
        System.out.println(lastDigit(-947));
    }

    public static int lastDigit(int number){

        number = Math.abs(number);

        System.out.println(number);

        int lstDig = number % 10;

        return  lstDig;

    }
}
