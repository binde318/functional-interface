package controkflowinjava;

public class IfConditonal {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 20) {
            System.out.println("its hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20 && temp <=32)
            System.out.println("Beautiful day");
            
        else
            System.out.println("Cool ady");

    }
}
