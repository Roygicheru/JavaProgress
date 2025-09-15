package JavaSprint;

//import java.time.LocalDate;
import java.util.Scanner;

public class JavaSprint {

    public void mainProj(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("The number is positive");
        } else if (number < 0 ) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

//        System.out.println("Roy Gicheru");
//        System.out.println("Have a little Faith in Me");
//        LocalDate date = LocalDate.now();
//        System.out.println("Today's date is " + date);
    }
}
