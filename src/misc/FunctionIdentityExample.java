package misc;

import java.util.function.Function;


public class FunctionIdentityExample {

    public static void main(String[] args) {

        Function<Integer,Integer> id = Function.identity();

        System.out.println(id.apply(3));

    }
}
