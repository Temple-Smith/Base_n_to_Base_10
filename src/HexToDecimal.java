public class HexToDecimal {
    String number;
    int base10Value;

    public HexToDecimal(String number) {
        this.number = number;
    }

    public void convertHex(String number) {

        int[] digits = new int[number.length()];

        //populate digits array
        for (int i = 0; i < number.length(); i++) {

            digits[i] = Character.getNumericValue(number.charAt(i));
            base10Value += digits[i] * (int) Math.pow(16, (digits.length - 1) - i);
        }
        System.out.println(base10Value + " base 10");
    }
}
