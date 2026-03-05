import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {


        Random random = new Random();


        System.out.println("Welcome to the DMV!");


        int userNumber = random.nextInt(200) + 1;


        System.out.println("Your ticket number is: " + userNumber);
        System.out.println("Please wait until your number is called.\n");


        int currentNumber = userNumber + 1;


        if (currentNumber > 200) {
            currentNumber = 1;
        }


        while (currentNumber != userNumber) {
            System.out.println("Now serving number " + currentNumber);
            currentNumber++;


            if (currentNumber > 200) {
                currentNumber = 1;
            }
        }


        System.out.println("Now serving number " + userNumber);

        
        int miracleChance = random.nextInt(100) + 1;
        if(miracleChance == 1) {
            System.out.println("You actually managed to have all the right paperwork, i didn't know that was possible");
        } else {
            System.out.println("Sir are you stupid, you forgot one of the 100 documents you needed, you need to leave. Muahaha!");

    }
}

}
