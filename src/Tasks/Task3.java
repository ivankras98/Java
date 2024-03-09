/*Задача № 4
Определить одномерный массив и заполнить его случайными значениями.
Определить дополнительный массив разрешенных значений. Определить и вывести на экран, сколько элементов исходного массива имеют разрешенные значения
*/

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        Random random = new Random ();
        for (int i = 0; i<n; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println ("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        int[] allowedValues = {2, 4, 6, 8};
        int count = 0;
        for (int num : array) {
            for (int allowed : allowedValues) {
                if (num == allowed) {
                    count ++;
                    break;
                }
            }
        }
        System.out.println("Количество элементов исходного массива с разрешенными значениями: " + count);
    }
    
}