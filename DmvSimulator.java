import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {


        Random random = new Random();


        System.out.println("Welcome to the DMV!");


        int userNumber = random.nextInt(200) + 1;


        System.out.println("Your ticket number is: " + userNumber);
        System.out.println("Please wait until your number is called.\n");


        int currentNumber = userNumber + 1;


        if (currentNumber > 100) {
            currentNumber = 1;
        }


        while (currentNumber != userNumber) {
            System.out.println("Now serving number " + currentNumber);
            currentNumber++;


            if (currentNumber > 100) {
                currentNumber = 1;
            }
        }


        System.out.println("Now serving number " + userNumber);
        System.out.println("Sorry, you don’t have the required paperwork.");
    }

}
