import java.util.ArrayList;
import java.util.Collections;

public class DecimalToHex {
    String number;
    int remainder;
    public DecimalToHex(String number) {
        this.number = number;
    }

    public void hexToDeci(String number) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(number);
        while (num > 0) {
            remainder = num % 16;
            list.add(remainder);
            num = num / 16;
        }

        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (int digit : list) {
            switch (digit) {
                case 10: sb.append('A'); break;
                case 11: sb.append('B'); break;
                case 12: sb.append('C'); break;
                case 13: sb.append('D'); break;
                case 14: sb.append('E'); break;
                case 15: sb.append('F'); break;
                default: sb.append(digit);
            }

        }

        System.out.println("Hexadecimal: " + sb + " Base 16");
    }
}
