import java.util.ArrayList;
import java.util.Collections;

public class DecimalToBase {
    String number;
    int baseValue;
    int remainder;

    public DecimalToBase (String number, int baseValue) {
        this.number = number;
        this.baseValue = baseValue;
    }

    public void convertToBaseN(String number, int baseValue) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(number);
        while (num > 0) {
            remainder = num%baseValue;
            list.add(remainder);
            num = num/baseValue;
        }
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (int digit : list) {
            sb.append(digit);
        }
        System.out.println(sb.toString() + " base: " + baseValue);
    }
}
