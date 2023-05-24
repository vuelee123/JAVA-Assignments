package DAY57.regularExpression;

import java.util.regex.Pattern;
public class RegularExpression {
    public static void main(String[] args) {
        String email = "vuelee123@gmail.com";
        String regex = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        boolean isValid = Pattern.matches(regex, email);
        System.out.println("Is the email address valid? " + isValid);

        // valid phone number
        String phoneNumberPattern = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        String phoneNumber = "(123) 456-7890";
        String phoneNumber1 = "(1211) 232-233";
        boolean isValid1 = phoneNumber.matches(phoneNumberPattern);
        boolean isValid2 = phoneNumber1.matches(phoneNumberPattern);
        System.out.println("Is the phone number valid? " + isValid1);
        System.out.println("Is the phone number valid? " + isValid2);

        // date
        String datePattern = "\\d{2}/\\d{2}/\\d{4}";
        String date = "07/09/1992";
        boolean isValid3 = date.matches(datePattern);
        System.out.println("Is the date valid? " + isValid3);

        // valid url
        String urlPattern = "(http|https)://[\\w\\d.-]+\\.[\\w]{2,}(.[\\w]{2,})?(/[\\w\\d.-]*)*";
        String url = "https://www.google.com";
        boolean isValid4 = url.matches(urlPattern);
        System.out.println("Is the url valid? " + isValid4);

        // credit card
        String creditCardPattern = "\\d{4}([-\\s])?\\d{4}\\1\\d{4}\\1\\d{4}";
        String creditCardNumber = "1234-5678-9012-3456";
        boolean isValid5 = creditCardNumber.matches(creditCardPattern);
        System.out.println("Is the credit card valid? " + isValid5);

        // zip code
        String zipCodePattern = "\\d{5}(-\\d{4})?";
        String zipCode = "28613-8612";
        boolean isValid6 = zipCode.matches(zipCodePattern);
        System.out.println("Is the zip code valid? " + isValid6);

        // Java identifier
        String javaIdentifierPattern = "[a-zA-Z_$][\\w$]*";
        String javaIdentifier = "myVariable";
        boolean isValid7 = javaIdentifier.matches(javaIdentifierPattern);
        System.out.println("Is the Java identifier valid? " + isValid7);

        // hexadecimal colo code
        String hexColorPattern = "#[0-9A-Fa-f]{6}";
        String hexColorCode = "#FF0000";
        boolean isValid8 = hexColorCode.matches(hexColorPattern);
        System.out.println("Is the Java identifier valid? " + isValid8);

        // 24-hour format
        String timePattern = "([01]\\d|2[0-3]):[0-5]\\d";
        String time = "22:30";
        boolean isValid9 = time.matches(timePattern);
        System.out.println("Is the time in 24-hour format valid? " + isValid9);
    }
}