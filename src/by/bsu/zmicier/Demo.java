package by.bsu.zmicier;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String command = scanner.nextLine();

            String result;
            if ("duplicate".equals(command)) {
                result = input + input;
            } else if ("reverse".equals(command)) {
                char[] inputArray = input.toCharArray();
                char[] resultArray = new char[inputArray.length];
                for (int i = 0; i < inputArray.length; i++) {
                    resultArray[i] = inputArray[inputArray.length - i - 1];
                }
                result = new String(resultArray);
            } else {
                result = input;
            }

            System.out.println(result);
        }
    }
}
