import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {


    public static void main(String[] args) {

//        JavaStaticAndFinal o1 = new JavaStaticAndFinal();
//        JavaStaticAndFinal o2 = new JavaStaticAndFinal();
//        JavaStaticAndFinal o3 = new JavaStaticAndFinal();
//        JavaStaticAndFinal o4 = new JavaStaticAndFinal();
//        JavaStaticAndFinal o5 = new JavaStaticAndFinal();

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = localDateTime.format(dateTimeFormatter);
        System.out.println(date);

    }
}
