import java.util.Scanner;
public class GuessTheWord {
    static int score;
    
    static void lavelOne(String a, String b,String c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        if (word.equals(a)) {
            System.out.println("Correct!");
            score += -1;
        } else if (word.equals(b)) {
            System.out.println("Correct!");
            score += 5;
        } else if (word.equals(c)) {
            System.out.println("Correct!");
            score += 1;
        } else {
            System.out.println("Incorrect!");
        }
    }
}
