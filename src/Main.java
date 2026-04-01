import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Chapter 4 - Base Systems" + "\n");

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input 1 for converting to base-10."
                    + "\n"
                    + "Input 2 for converting from base-10."
                    + "\n"
                    + "Input 3 for Hex to base-10"
                    + "\n");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {

                case 1: {
                    System.out.print("Enter an integer: ");
                    String number = input.nextLine();
                    System.out.print("Enter a base value: ");
                    int baseValue = Integer.parseInt(input.nextLine());
                    BaseConverter bc = new BaseConverter(number, baseValue);
                    bc.convert(number, baseValue);
                    break;
                }

                case 2: {
                    System.out.print("Enter an integer: ");
                    String number = input.nextLine();
                    System.out.print("Enter a base value: ");
                    int baseValue = Integer.parseInt(input.nextLine());
                    DecimalToBase dbc = new DecimalToBase(number, baseValue);
                    dbc.convertToBaseN(number, baseValue);
                    break;
                }

                case 3: {
                    System.out.print("Enter a hexadecimal: ");
                    String number = input.nextLine();
                    HexToDecimal htd = new HexToDecimal(number);
                    htd.convertHex(number);
                    break;
                }
            }
        }
    }
}
