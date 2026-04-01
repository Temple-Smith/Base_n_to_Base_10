import java.util.Scanner;

public class BaseConverter {
    String number;
    int baseValue;
    int base10Value;
    public BaseConverter(String number, int baseValue) {
        this.number = number;
        this.baseValue = baseValue;
    }

    public int convert(String number, int baseValue) {

        //Create a digits array
        int[] digits = new int[number.length()];

        //populate digits array
        for (int i = 0; i < number.length(); i++) {
            //getNumericValue works on unicode to return a integer value.
            digits[i] = Character.getNumericValue(number.charAt(i));
            base10Value += digits[i] * (int) Math.pow(baseValue, (digits.length - 1) - i);
        }


        System.out.println(base10Value + " base 10.");
        return base10Value;
    }
}
