package ChatBot;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        System.out.println("Hello! My name is Obema.");
        System.out.println("I was created in 2021.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();
        System.out.println("What a greate name you have, " + name + "!");


    }
}
