import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        String userInput1 = scanner.nextLine();

        double num1 = Double.parseDouble(userInput1);

        System.out.println("Введіть друге число:");
        String userInput2 = scanner.nextLine();

        double num2 = Double.parseDouble(userInput2);

        System.out.println("Введіть операцію (+, -, *, /):");
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: Ділення на нуль");
                    return;
                }
                break;
            default:
                System.out.println("Помилка: Невірна операція");
                return;
        }

        System.out.println("Результат : " + result);


        scanner.close();
    }

}

