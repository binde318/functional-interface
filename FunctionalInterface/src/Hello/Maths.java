package Hello;

public class Maths {
    public static void main(String[] args) {
//        int result= Math.round(1.5F);
       // int result= (int) Math.max(1.5F, 4.8F);
        //random return double
        //Factory method creat new object
        double result= Math.round(Math.random() * 1000);
        System.out.println(result);
    }
}
