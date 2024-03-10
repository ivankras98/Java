import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода чисел a и b
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        // Находим максимальное и минимальное значения из a и b
        double max = Math.max(2 * a, b);
        double min = Math.min(a, 4 + b);

        // Вычисляем d
        double d = (max - 10 * (Math.sqrt(min) + 4.2 * min)) / (1 + (max / min));

        // Выводим результат на экран
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("d: " + d);

        // Закрываем Scanner
        scanner.close();
    }
}
