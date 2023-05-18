package DAY54.collectionsAndError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ListOperations {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(10);
        integerList.add(25);
        integerList.add(15);
        integerList.add(59);
        integerList.add(19);
        integerList.add(19);
        integerList.add(9);

        try {
            Set<Integer> integerSet = new HashSet<>(integerList);
            int sum = 0;
            for (Integer integer : integerSet) {
                sum += integer;
            }
            double average = sum / (double) integerSet.size();

            System.out.println("The sum of integers is: " + sum);
            System.out.println("The average of integers: " + average);
            System.out.println("The list of integers without duplicates: " + integerSet);

        } catch (IndexOutOfBoundsException boundsException) {
            System.out.println("Array index out of bounds: " + boundsException.getMessage());
        } catch (IllegalArgumentException argumentException) {
            System.out.println("Illegal argument: " + argumentException.getMessage());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic exception: " + arithmeticException.getMessage());
        } finally {
            System.out.println("Program ended.");
        }
    }
}
