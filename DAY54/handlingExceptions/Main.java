package DAY54.handlingExceptions;

public class Main {
        public static void main(String[] args){
            Person person = new Person("Lee", -30);
            System.out.println(person);

            Calculator calculator = new Calculator();
            System.out.println(calculator.factorial(-19));
            System.out.println(calculator.binomialCoefficient(12,5));


        }

    }
