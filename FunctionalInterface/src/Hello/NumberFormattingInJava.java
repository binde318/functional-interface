package Hello;

import java.text.NumberFormat;

public class NumberFormattingInJava {
    public static void main(String[] args) {
       //method chaining
       String result= NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
