/*Задача № 4
Определить матрицу (двумерный массив) и ее заполнить случайными значениями. Построить вектор В, которой возвращает максимальное значение в i-м столбце
*/
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 3; // Количество строк
        int cols = 4; // Количество столбцов

        // Создаем двумерный массив (матрицу) и заполняем его случайными значениями
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100); // Генерируем случайное число от 0 до 99
                }
            }
        System.out.println("");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        // Запрос у пользователя номера столбца
        System.out.print("Введите номер столбца (от 1 до " + cols + "): ");
        int chosenColumn = scanner.nextInt();

        // Проверка на корректность ввода
        while (chosenColumn < 1 || chosenColumn > cols) {
        System.out.print("Некорректный ввод. Введите номер столбца от 1 до " + cols + ": ");
        chosenColumn = scanner.nextInt();
        }

    // Находим максимальное значение в выбранном столбце
    int max = matrix[0][chosenColumn - 1]; // Предполагаем, что максимальное значение в столбце находится в его первой строке
    for (int i = 1; i < rows; i++) {
        if (matrix[i][chosenColumn - 1] > max) {
            max = matrix[i][chosenColumn - 1];
            }
        }
    
    // Выводим результат на экран
    System.out.println("Максимальное значение в " + chosenColumn + " столбце: " + max);
    }
}