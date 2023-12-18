package controkflowinjava;

import java.util.Scanner;

public class ForLoops {
    //For loop is used to execution of function repeatedly while knowing the number of times
    // the programs should execute
    public static void main(String[] args) {
        //continue control move the loop to the beginning of the loop
        //break terminate the loop
        //while loop check the condition first before execution
        // meanwhile Do -While loop execute before checking the condition last
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input :");
            input=scanner.next().toLowerCase();
            if (input.equals("quit"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);

//        for (int i = 5; i > 0; i--) // reverse order
//            System.out.println(" Hello World " + i);
//        //while loop is the
//
//        int i = 0;
//        while (i > 0){
//            System.out.println(" Hello World " + i);
//            i--;
        }
//        do {
//            System.out.print("Input :");
//            input=scanner.next().toLowerCase();
//            System.out.println(input);
//        }while (!input.equals("quit"));

    }
}
