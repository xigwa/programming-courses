public class lesson7 {
    public static void main(String[] args) {
        int[][] ar = {{32, 4, 64}, {23, 6, 23}, {43, 8, -3}};
//        int[][] arr = {{0,5,0},{46,8,-1}};
//        int[][] arr1 = task11(arr);

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(task15(ar));


    }

    // Знайти суму всіх елементів двовимірного масиву.
    public static int task1(int[][] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
            }
        }
        return sum;
    }

    // Знайти середнє арифметичне значення всіх елементів масиву.
    public static int task2(int[][] ar ) {
        int sum = 0;
        int numSum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
                numSum++;
            }
        }
        return sum/numSum;
    }
    // Знайти найбільший елемент в кожному рядку масиву.
    public static int[] task3(int[][] ar) {
        int[] result = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int max = ar[i][0];
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] > max) {
                    max = ar[i][j];
                }
            }
            result[i] = max;
        }
        return result;
    }
    // Знайти найменший елемент в кожному стовпці масиву.
    public static int[] task4(int[][] ar) {
        int columns = ar[0].length;
        int[] min = new int[columns];

        for (int i = 0; i < columns; i++) {
            int mini = ar[0][i];
            for (int j = 1; j < ar.length; j++) {
                if (ar[j][i] < mini) {
                    mini = ar[j][i];
                }
            }
            min[i] = mini;
        }

        return min;
    }
    // Знайти суму елементів кожного рядка масиву.
    public static int[] task5(int[][] ar) {
        int[] sum = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            int sums = 0;
            for (int j = 0; j < ar[i].length; j++) {
                sums += ar[i][j];
            }
            sum[i] = sums;
        }
        return sum;
    }
    // Перевірити, чи є усі елементи головної діагоналі масиву додатним
    public static boolean task6(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i][i] <= 0)
                return false;
        }
        return true;
    }
    // Поміняти місцями два рядки масиву.
    public static int[][] task7(int[][] ar, int row1, int row2) {
        if (row1 >= 0 && row1 < ar.length && row2 >= 0 && row2 < ar.length) {
            int[] temp = ar[row1];
            ar[row1] = ar[row2];
            ar[row2] = temp;
        }
        return ar;
    }
    // Знайти суму елементів в рядках, де є хоча б одне від'ємне число.
    public static int task8(int[][] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean hasNegative = false;
            int rowSum = 0;
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] < 0)
                    hasNegative = true;
                rowSum += ar[i][j];
            }
            if (hasNegative)
                sum += rowSum;
        }
        return sum;
    }
    // Знайти кількість парних чисел в масиві.
    public static int task9(int[][] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] % 2 == 0)
                    count++;
            }
        }
        return count;
    }
    // Знайти кількість від'ємних чисел в масиві.
    public static int task10(int[][] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++)
                if (ar[i][j] < 0)
                    count++;
        }
        return count;
    }
    // Замінити всі нульові елементи масиву на числа починаючи з 1, і кожен наступний нуль
    // міняйте на число на один більше.
    public static int[][] task11(int[][] ar) {
        int counter = 1;
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[i].length; j++)
                if (ar[i][j] == 0) {
                    ar[i][j] = counter;
                    counter++;
                }
        return ar;
    }
    // Визначити, чи є сумма лівої і правої діагоналі массива однаковими.
    public static boolean task12(int[][] ar) {
        int n = ar.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += ar[i][i];
            rightDiagonalSum += ar[i][n - i - 1];
        }

        return leftDiagonalSum == rightDiagonalSum;
    }
    // Знайти суму елементів, розташованих на лівій діагоналі масиву.
    public static int task13(int[][] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i][i];
        }
        return sum;
    }
    // Знайти кількість елементів, які менше заданого числа.
    public static int task14(int[][] ar, int target) {
        int count = 0;
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[i].length; j++)
                if (ar[i][j] < target)
                    count++;
        return count;
    }

    // Перевірити, чи є всі елементи масиву унікальними.
    public static boolean task15(int[][] ar) {
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[i].length; j++)
                for (int x = 0; x < ar.length; x++)
                    for (int y = 0; y < ar[x].length; y++)
                        if (i != x || j != y)
                            if (ar[i][j] == ar[x][y])
                                return false;
        return true;
    }


}

