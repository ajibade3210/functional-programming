package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
    int increment = increment(1);
    int incrementFunc = incrementByOneFunction.apply(1);
        System.out.println(increment);
        System.out.println(incrementFunc);

    int multiplyByFunction = multiplyByFunc.apply(incrementFunc);
    System.out.println(multiplyByFunction);

    System.out.println(addBy1AndMultiply2.apply(20));

    System.out.println(incrementByOneAndMultiplyBiFunction.apply(20, 2));

    }

    //DECLERATIVE SAMPLE
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+1;

    static Function<Integer, Integer> multiplyByFunc = m -> m* m+2;

    static  Function<Integer, Integer> addBy1AndMultiply2 =
            incrementByOneFunction
                    .andThen(multiplyByFunc);

    //BIFUNCTION: Collects Two ARguments
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction=
            (numberToIncrementByOne, numberToMultiply)-> (numberToIncrementByOne + 1) * numberToMultiply;


    //IMPERATIVE SAMPLE
    static int increment (int number){
        return number++;
    }

    static int incrementByOneAndMultiply (int number, int numToMultiply){
        return (number+1) * numToMultiply;
    }
}
