public class Hello {
    public static void main(String[] args) {
        while (GuessTheWord.score < 10) {
            GuessTheWord.lavelOne("apple", "banana", "cherry");
        }
        System.out.println("Your score is " + GuessTheWord.score);

        GuessTheWordLevelTwo.levelTwo();

    }
}
