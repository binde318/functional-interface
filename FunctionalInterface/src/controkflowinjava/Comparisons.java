package controkflowinjava;

public class Comparisons {
    public static void main(String[] args) {
        //comparison operators == equality operator and = is the assign value operator
//        int x = 8;
//        int y = 8;
//        System.out.println(x == y);
        //Logical operators AND(&&) operators
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
        //Logical operators OR(||) operators
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean noSourceOfInCome = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !noSourceOfInCome;
        System.out.println(isEligible);
    }
}
