import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите : ");

        try {
            String input = scanner.nextLine();
            String result = calc(input);
            System.out.println("Ответ: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введите числа в корректном формате (например, 1 + 2)");
        }  catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public static String calc(String input) throws Exception {
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new Exception("Ошибка: Неверный ввод.");
        }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operator = parts[1];

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");
        }
        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new Exception("Неверный оператор");
        }
        return String.valueOf(result);
    }
}