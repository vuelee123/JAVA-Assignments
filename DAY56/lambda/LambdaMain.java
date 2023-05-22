package DAY56.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {

    // task 1
        public static void main(String[] args) {
           SimpleFunction addition = (a, b) -> a + b;
           System.out.println(addition.operation(10,10));

            SimpleFunction subtraction = (a, b) -> a - b;
            System.out.println(subtraction.operation(100,58));

            SimpleFunction multiply = (a, b) -> a * b;
            System.out.println(multiply.operation(120,10));

            SimpleFunction division = (a, b) -> a / b;
            System.out.println(division.operation(200,10));

            // task 2

            CreateInterface myInterface1 = () -> System.out.println("Hello, World!");
            myInterface1.run();

            // task 3

            // predict
            Predicate<Integer> isEven = n -> n % 5 == 0;
            System.out.println(isEven.test(9));
            System.out.println(isEven.test(5));

            // function
            Function<String, Integer> stringLength = s -> s.length();
            System.out.println(stringLength.apply("How is everyone?"));

            // consumer
            List<String> wedding = Arrays.asList("Wedding dress", "Invitations", "Venue", "Flowers", "Bridesmaid", "Groomsmen");
            Consumer<String> printWedding = fruit -> System.out.println(fruit);
            wedding.forEach(printWedding);

            // supplier
            Supplier<String> message = () -> "Hi Friends. We are learning about lambda today!";
            System.out.println(message.get());

        }

    }
