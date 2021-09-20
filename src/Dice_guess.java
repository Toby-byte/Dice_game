import java.util.Random;
import java.util.Scanner;

public class Dice_guess {
    public static int Randomizer(int minNumber, int maxNumber) {
        Random random = new Random();
        int randomizer = random.nextInt(maxNumber-minNumber)+minNumber;
        return randomizer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean userCorrectAnswer = true;

        do {
            System.out.println("Er terning lige eller ulige?");
            String userInput = scanner.nextLine();
            int dice = Randomizer(1,7);
            int isEven = dice % 2;
            if (userInput.matches("lige")){
                if (isEven == 0) {
                    System.out.println("\nTerning er lige og du har gættet rigtigt");
                    System.out.println("du slog "+dice);
                    score++;
                } else {
                    System.out.println("\nTerning er ulige og du har gættet forkert");
                    System.out.println("du slog "+dice);
                    userCorrectAnswer = false;
                }
            } else {
                System.out.println("\nskriv venligst 'lige' eller 'ulige'");
            }

            if (userInput.matches("ulige")){
                if (isEven == 0) {
                    System.out.println("\nTerning er lige og du har gættet forkert");
                    System.out.println("du slog "+dice);
                    userCorrectAnswer = false;
                } else {
                    System.out.println("\nTerning er ulige og du har gættet rigtigt");
                    System.out.println("du slog "+dice);
                    score++;
                }
            }

        }
        while (userCorrectAnswer);

        System.out.println("din score er "+score);
    }
}
