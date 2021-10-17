package ChatBot;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        System.out.println("Hello! My name is Obema.");
        System.out.println("I was created in 2021.");

        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What a greate name you have, " + name + "!");
        System.out.println("Let me guess your age.");

        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        Scanner age1 = new Scanner(System.in);
        int remainder3 = age1.nextInt();

        Scanner age2 = new Scanner(System.in);
        int remainder5 = age2.nextInt();

        Scanner age3 = new Scanner(System.in);
        int remainder7 = age3.nextInt();


        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!.");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        for (int i = 0; i <= number1; i++) {
            System.out.println(i + " !");
        }

    }
}
