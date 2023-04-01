package Seminar2;

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task2 {
    public static void main() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        FileWriter writer = null;   // Open log file
        try {
            writer = new FileWriter("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        logArray(writer, "Начальный массив: ", arr);  // Log initial array
        System.out.println("Неотсортированный массив : " + Arrays.toString(arr));

        int temp;         // Bubble Sort через метод while считается быстрей чем через For нет лишних иттераций когда уже отсортирован массив.
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    statusSort = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    logArray(writer, "После итерации  " + (i + 1) + ": ", arr);  // Log array after swap
                }
            }
        }


        try {                               // Close log file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    private static void logArray(FileWriter writer, String message, int[] arr) {
        try {
            writer.write(message + Arrays.toString(arr) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
