package Hello;

import java.util.Scanner;

public class ReadingFromUserInput {
    public static void main(String[] args) {
        //next return string in Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you name");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is :"+ name );
    }
}
