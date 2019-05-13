package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class RasturnareElemMatriceInDreapta2 {

    public static void main(String[] args) {
        int[][] a = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] b = new int[3][3];
        print(a);

        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a[0].length; j++){
                b[i][j] = a[j][a.length-i-1];

            }
            System.out.println();
        }

        print(b);
    }


    public static void print(int[][] a){
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a[0].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}
