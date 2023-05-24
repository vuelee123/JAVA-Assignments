package DAY57.debugging;

public class DebuggingPractice {

    // a method to calculates the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Cannot be empty or null");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        double average = calculateAverage(numbers);

        // the null pointer exception
        //  int[] numbers = null; // array cannot be empty
        //  double average = calculateAverage(numbers);
       // System.out.println("The average is: " + average);
        // System.out.println(str.length()); // throw the null exceptions

//public static void main(String[] args) {
//    int[] numbers = {1, 2, 3};
//    double average = calculateAverage(numbers);
//    System.out.println(numbers[2]);;
//}
        // logic
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int average = (a + b) % 2;
//        System.out.println("The average is: " + average);
//    }
    // the logic is outputting 0, because it should have been a division sign instead of the percentage
    // by utilizing the division symbol, it would output the right average

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int average = (a + b) / 2;
        System.out.println("The average is: " + average);
    }

    }
