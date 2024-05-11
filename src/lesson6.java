public class lesson6 {
    public static void main(String[] args) {
        int[] arr = {12,213,23,3,5,7,2,6};
        //task1(48, 18);
        //task2(123, 4);
        //task3(1);
        task4(arr);
    }

    public static void task1(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("НСД: " + a);
    }
    public static void task2(int num,int userNum) {
        int sum = 0;
        int tNumber = num;
        while (tNumber !=0) {
            int digit = tNumber %10;
            sum+=digit;
            tNumber/= 10;
        }
        if (sum == userNum)
            System.out.println("Сума цифр числа дорівнює константі");
        else
            System.out.println("Сума цифр числа не дорівнює константі");
    }
    public static void task3(int n) {
        int a = 1, b = 1, count = 2;

        while (true) {
            if (count >= n) {
                if (isPrime(a)) {
                    System.out.println("Перше просте число в послідовності Фібоначчі, починаючи з " + n + " : " + a);
                    break;
                }
            }
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void task4(int[] array) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                ascending = false;
            else if (array[i] < array[i + 1])
                descending = false;

        }

        if (ascending)
            System.out.println("Масив відсортований у порядку зростання");
        else if (descending)
            System.out.println("Масив відсортований у порядку спадання");
        else
            System.out.println("Масив не відсортовано");

    }
}