package controkflowinjava;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] fruits = {"Orange", "Mango", "Tomato", "Onion"};
        //using for loop, in for loop you can access both the index and the actual index itself
        for (int i =0; i< fruits.length; i++)
            System.out.println(fruits[i]);
        System.out.println(" After for loop *************");
        //using for each loop does not reverse loop,
        // its only forward loop and does not have access to the index variable
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
