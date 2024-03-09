/*Задача № 4
Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y. 
Если сумма этих чисел больше 20, то вычислить утроенный квадрат первого числа, 
в противном случае куб второго числа. Вывести результат на экран.*/




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x + y > 20) {
            int result = 3 * (x * x);
            System.out.println("Сумма чисел больше 20, утроенный квадрат первого числа: " + result);
        } else {
            int result = y * y * y;
            System.out.println("Сумма чисел не больше 20, куб второго числа: " + result);
        }
    }
}