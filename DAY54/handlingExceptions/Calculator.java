package DAY54.handlingExceptions;

public class Calculator {
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number needs be >= 0");
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize ) {
            throw new IllegalArgumentException("Subset size must be bigger than set.");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}