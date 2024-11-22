import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите : ");

        try {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length != 3) {
                throw new Exception("Неверный формат");
            }

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            String operator = parts[1];

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new Exception("Число вне диапазона");
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
                    if (b == 0) throw new Exception("Деление на ноль");
                    result = a / b;
                    break;
                default:
                    throw new Exception("Неверный оператор");
            }

            System.out.println("Ответ: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: throws Exception");
        }
    }
}
