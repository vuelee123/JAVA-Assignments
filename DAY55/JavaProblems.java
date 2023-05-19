package DAY55;

public class JavaProblems {
    /*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) { // if it's the weekend or on vacation, return true if we sleep in
            return false;
        }
        return true; // the return ran true
    }

    /*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
     */
    public int diff21(int n) {
        if (n <= 21) { // the if loop determined that n is less than or equal to 21.
            return 21 - n;
        } else if (n > 21) { // this else if return makes it returns double the n.
            return (n - 21) * 2;
        }
        return 0;
    }
    // the concept of this loop was to find the difference between n and 21 but return double,
    // thus the return on line 3 multiply by 2.

    /*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

     */
    public int sumDouble(int a, int b) {
        // storing the sum into a local variable
        int sum = a + b;
        if (a == b)
            return sum * 2; // if a and be are the same, the sum will be multiplied by 2, by returning double the sum
        else
            return sum; // a and be are not the same, returning only the sum
    }
    /*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling.
Return true if we are in trouble.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || (!aSmile && !bSmile)) // instead of creating another 'if', I did the || to keep the code shorter.
            return true;
        else
            return false;
    }
    /*We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 || hour > 20) { // the hour is the parameter and || returns true if one of the statement is true.
            return talking; // a boolean that can either be true or false during the parameters
        }
        else {
            return false;
        }
    }
    /* Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     */
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }
// this one was pretty basic, you can either use return to return the value if it is true. But since I am
    // trying to get use to using ||, it made the code simpler and prettier. The || will return the statement if one
    // is true.

    /*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
     */
    public boolean nearHundred(int n) {
        int value1 = 100-n;
        int value2 = 200-n;
        return (Math.abs(value1) <= 10 || Math.abs(value2) <=10);
    }

    /* Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     The value of n will be a valid index of a char in the original string
     (i.e. n will be in the range 0..str.length()-1 inclusive).*/
    public String missingChar(String str, int n) {
        String front = str.substring(0, n); // the method to omit the char
        String back = str.substring(n+1, str.length());
        return front + back;
    }
}


