import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}



public class LambdaExample {
    public static void main(String[] args) {
//        Function<String, Integer> function = new FunctionImpl();
//        System.out.println(function.apply(" welcome the binde's family !"));

        Function<String, Integer> function= (String s) -> s.length();
        System.out.println(function.apply("welcome to binde big family!"));

    }
}
