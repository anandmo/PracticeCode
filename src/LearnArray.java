import java.util.Scanner;

/*Array Operation INSERTION.DELETION.SEARCHING.MODIFICATION*/

public class LearnArray {

    public static void main(String[] args) {

        int array_size, element_to_search, element_to_delete, element_to_replace, element_replace_with, position = 0;
        boolean element_is_there = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array");
        array_size = sc.nextInt();

        //Creation of Array
        int[] array = new int[array_size];

        System.out.println("Array Created");

        //Insertion of array element
        System.out.println("Enter elements in the array");

        for (int i = 0; i < array_size; i++) {

            array[i] = sc.nextInt();

        }

        //Print current array
        System.out.println("Current Array : ");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }


        /*----------------------------Delete Element-------------------------------------*/
        System.out.println("Enter the element to be deleted");
        element_to_delete = sc.nextInt();


        for (int i = 0; i < array_size; i++) {

            if (array[i] == element_to_delete) {

                element_is_there = true;
                position = i;
                array_size--;
                break;

            }


        }


        if (element_is_there) {

            for (int i = position; i < array_size; i++) {

                array[i] = array[i + 1];

            }

        } else {

            System.out.println("Element not found");

        }


        System.out.println("Current Array : ");
        for (int i = 0; i < array_size; i++) {

            System.out.println(array[i]);

        }

        /*---------------------------------------Find Element----------------------------------------*/
        System.out.println("Enter element to Find");

        element_to_search = sc.nextInt();

        for (int i = 0; i < array_size; i++) {

            if (array[i] == element_to_search) {

                element_is_there = true;
                position = i;
                break;

            }


        }

        if(element_is_there) {

            System.out.println("Element found at postion : "+position);

        } else
            System.out.println("Element not found");


        /*--------------------------------------------Replace element------------------------------*/
        System.out.print("Please enter element to replace in array");
        element_to_replace = sc.nextInt();
        System.out.print("Please enter a new element ");
        element_replace_with = sc.nextInt();


        for (int i = 0; i < array_size; i++) {

            if (array[i] == element_to_replace) {

                element_is_there = true;
                position = i;
                break;

            }

        }

         if(element_is_there) {

             array[position] = element_replace_with;


         } else {

             System.out.println("The element you want to replace is not there");

         }

        System.out.println("Current Array : ");
        for (int i = 0; i < array_size; i++) {

            System.out.println(array[i]);

        }


    }

}
