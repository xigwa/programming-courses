public class lesson4 {
    public static void main(String[] args) {
        int[] ar = {45, 34, 32, 66, 53, 72, 87, 231, 765};
        int[] arr7 = {5,-3,-2,16,55,0};
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6(ar);
        //task7(arr7);
        task8();


    }
    public static void task1() {
        int num = 1;

        for (int i = 0; i < 55; i+=2) {
            System.out.print(num + " ");
            num += 2;
        }

    }
    public static void task2() {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }
    }
    public static void task3() {
        int num = 2;
        for (int i = 0; i < 7; i++) {
            System.out.print(num + " ");
            num *=2;
        }
    }
    public static void task4() {
        for (int i = -29; i < 10; i++) {
            if (i%5 == 0)
                System.out.println(i + " ");
        }
    }
    public static void task5() {
        int sum = 0;
        int num = 0;

        for (int i = 50; i <= 150; i++) {
            sum+=i;
            if (i%2 == 0 )
                num++;
        }
        System.out.println("Сума всіх чисел: " + sum);
        System.out.println("Кількість парних чисел: " + num);
    }
    public static void task6(int[] ar) {
        int maxNum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > maxNum)
                maxNum = ar[i];
        }
        System.out.println(maxNum);
    }
    public static void task7(int[] ar) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0) {
                sum+= ar[i]; 
                num++;
            }
        }
        System.out.println("Сума позитивних чисел: " + sum);
        System.out.println("Кількість позитивних чисел: " + num);
    }
    public static void task8() {
        // 1 1 2 3 5 8 13 21 34 55 89 144
        int firstNum = 1;
        int secondNum = 1;

        System.out.println(firstNum + " " + secondNum + " ");

        for (int i = 2; i < 11; i++) {
            int nextNum = firstNum + secondNum;
            System.out.println(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
            
        }
    }
    

}
