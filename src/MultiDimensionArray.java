import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {

        int[][] array = new int[5][10];

        Scanner sc = new Scanner(System.in);


        System.out.println("Size of Multi-dimension array is "+array.length);

        System.out.println("Insert Element in Array");

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 10; j++) {

                array[i][j] = sc.nextInt();

            }

        }

        System.out.println("New Array with Values");


        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 10; j++) {

                System.out.println("array["+i+"]"+"["+j+"] = "+array[i][j]);

            }

        }





    }


}
