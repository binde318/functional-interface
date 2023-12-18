package controkflowinjava;

public class ExpressionBoolean {
    public static void main(String[] args) {
        //ternary operator
        int inCome = 120_000;
        String ClassName = inCome > 100_000 ? "First" : "Economy";
        System.out.println(ClassName);
//        if (inCome > 100_000)
           // ClassName = "First";
//        else
//            ClassName = "Economy";
//        System.out.println(ClassName);

//        boolean hasIncome = inCome > 10_000;
//        System.out.println(hasIncome);
    }
}
