import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hogwarts Sorting Hat Quiz!");
        System.out.println("Answer questions to find out your Hogwarts House.\n");

        String[] questions = {
                "Q1. What is your favorite color?\n(a) Red\n(b) Blue\n(c) Yellow\n(d) Green",
                "Q2. Which quality do you value most?\n(a) Courage\n(b) Intelligence\n(c) Loyalty\n(d) Ambition",
                "Q3. Choose an animal you like the most:\n(a) Lion\n(b) Eagle\n(c) Badger\n(d) Serpent",
                "Q4. Pick a subject you're excited about:\n(a) Defense Against the Dark Arts\n(b) Charms\n(c) Herbology\n(d) Potions"
        };

        StringBuilder answers = new StringBuilder();

        for (String question : questions) {
            System.out.println(question);
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d")) {
                answers.append(answer);
            } else {
                System.out.println("Invalid choice. Please choose a valid option (a, b, c, or d).");
            }
        }

        scanner.close();
        String result = house(answers.toString());
        System.out.println("You have been sorted into the " + result + " House!");
    }

    public static String house(String answers) {
        int acount = (int) answers.chars().filter(ch -> ch == 'a').count();
        int bcount = (int) answers.chars().filter(ch -> ch == 'b').count();
        int ccount = (int) answers.chars().filter(ch -> ch == 'c').count();
        int dcount = (int) answers.chars().filter(ch -> ch == 'd').count();

        int maxCount = Math.max(Math.max(acount, bcount), Math.max(ccount, dcount));

        if (maxCount == acount) {
            return "Gryffindor";
        } else if (maxCount == bcount) {
            return "Ravenclaw";
        } else if (maxCount == ccount) {
            return "Hufflepuff";
        } else {
            return "Slytherin";
        }
    }
}

// jesse helped me cos adrian is a goober