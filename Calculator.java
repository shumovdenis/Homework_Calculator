package Homework_Calculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // при делении на ноль выпадет ошибка, соотвественно нужно учесть данный факт
    BinaryOperator<Integer> devide = (x, y) -> {
        int result = 0;
        if (y != 0) {
        result = x / y;
        return result;
        }  else {
            System.out.println("на ноль делить нельзя");
            return  result;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
