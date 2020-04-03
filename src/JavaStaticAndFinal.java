public class JavaStaticAndFinal {

    private final double CONST = 1.3424;
    private static int counter = 0;
    private int counter2 = 0;

    public static void incrementCounter() {

        counter++;

    }

    public void printConst(int i)  {

        System.out.println(CONST*i);
    }


    public JavaStaticAndFinal() {

        incrementCounter();
        counter2++;
        print();


    }


    public void print() {

        System.out.println("Value of static counter "+counter);
        System.out.println("Value of instance level counter "+counter2);

    }



}
