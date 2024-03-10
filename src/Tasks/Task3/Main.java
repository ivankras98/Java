import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Число элементов в массиве
        int n = 10;

        // Создаем одномерный массив и заполняем его случайными значениями
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10); // Генерируем случайное число от 0 до 9
        }

        // Выводим основной массив
        System.out.println("Основной одномерный массив:");
        System.out.println(Arrays.toString(array));

        // Определяем дополнительный массив разрешенных значений
        int[] allowedValues = {2, 4, 6, 8};

        // Выводим дополнительный массив разрешенных значений
        System.out.println("Дополнительный массив разрешенных значений:");
        System.out.println(Arrays.toString(allowedValues));

        // Подсчитываем количество элементов исходного массива, которые имеют разрешенные значения
        int count = 0;
        for (int num : array) {
            for (int allowed : allowedValues) {
                if (num == allowed) {
                    count++;
                    break; // Выходим из цикла, если значение найдено
                }
            }
        }

        // Выводим результат на экран
        System.out.println("Количество элементов исходного массива с разрешенными значениями: " + count);
    }
}
