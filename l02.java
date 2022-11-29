import java.util.Random;
import java.util.Scanner;
import java.lang.NumberFormatException;

// множество - совокупность ункальных элементов
// набор - набор элементов (могут повторяться)
// последовательность - набор, в котором порядок элементов важен
// подпоследовательность - получается из последовательности путём вычёркиввания отдельных элементов
        // порядок важен!
// Общая подпоследовательность - результат слияния двух последовательностей (общие элементы)
// Мощность последовательности = длина

// Задача 1: Задайте массив из 12 элементов,
// заполненный случайными числами из промежутка [-9, 9].
// Найдите сумму отрицательных и положительных
// элементов массива.

public class l02 {

    final static int ARRAY_SIZE = 12;

    public static void main(String[] args) {

        int size = getSize();
        int[] array = createArray(size);
    }

    static int getSize() {
        Scanner mScanner = new Scanner(System.in);
        boolean isCorrect = false;
        int size = 0;
        while (!isCorrect) {
            System.out.printf("Введите размер массива: ");
            String input = mScanner.nextLine();
            try {
                size = Integer.parseInt(input);
                isCorrect = true;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        mScanner.close();
        return size;
    }
    
    static int[] createArray(int size) {
        Random r = new Random();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {

        }
        return array;
    }
}
