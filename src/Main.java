import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        fillArrayElements(numbers);
        getSumRowsElements(numbers);
        getSumColumnsElements(numbers);
        int[] arrayForTest = new int[]{1, 2, 3, 4};
        System.out.println("Исходный массив " + Arrays.toString(arrayForTest));
        changeArray(arrayForTest);
        System.out.println("Исходный массив после вызова первого метода " + Arrays.toString(arrayForTest));
        returnArrayForTest(arrayForTest);
        System.out.println("Исходный массив после вызова второго метода " + Arrays.toString(arrayForTest));
        lastChangeArray(arrayForTest);
        System.out.println("Исходный массив после вызова третьего метода " + Arrays.toString(arrayForTest));
    }

    static void fillArrayElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ((i * arr.length) + j + 1);
            }
        }
        printArray(arr);
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void getSumRowsElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Сумма строки " + (i + 1) + " = " + sum);
        }
    }

    static void getSumColumnsElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Сумма столбца " + (i + 1) + " = " + sum);
        }
    }

    static void changeArray(int[] arr) {
        Arrays.fill(arr, 0);
    }

    static int[] returnArrayForTest(int[] arr) {
        int[] numbers = new int[arr.length];
        Arrays.fill(numbers, 1);
        return numbers;
    }

    static int[] lastChangeArray(int[] arr) {
        Arrays.fill(arr, 9);
        return arr;
    }
}