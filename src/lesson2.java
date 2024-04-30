public class lesson2 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7("");
        //task8('');
        //task9();
        //task10();
        //task11();
        //task12();
        //task13();
        //task14();
        //task15();
        //task16();
        //task17();


    }

    //Робота с if-else

    public static void task1(int a) {
        if (a==0)
            System.out.println("True");
        else
            System.out.println("False");

    }
    public static void task2(int a) {
        if (a>0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task3(int a) {
        if (a<0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task4(int a) {
        if (a>=0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task5(int a) {
        if (a<=0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task6(int a) {
        if (a!=0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task7(String a) {
        if (a == "test")
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task8(int a) {
        if (a == 1 && a == (int) a)
            System.out.println("True");
        else
            System.out.println("False");
    }
    //Работа с логическими переменными
    public static void task9(boolean test){
        if (test == true)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task10(boolean test){
        if (test != true)
            System.out.println("True");
        else
            System.out.println("False");
    }
    // Работа с && (и) и || (или)
    public static void task11(int a){
        if ( a>0 && a<5 )
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void task12(int a){
        if ( a==0 || a==2 ) {
            a = a + 7;
            System.out.println(a);
        } else {
            a = a /10;
            System.out.println(a);
        }
    }
    public static void task13(int a, int b) {
        if ( a <= 1 && b >= 3 )
            System.out.println(a + b);
        else
            System.out.println(a - b);
    }
    public static void task14(int a, int b) {
        if ( a > 2 && a < 11 || b >= 6 && b < 14 )
            System.out.println("True");
        else
            System.out.println("False");
    }
    //На switch-case
    public static void task15(int num) {
        String result;
        switch (num) {
            case 1: result = "Зима";
                break;
            case 2: result = "Весна";
                break;
            case 3: result = "Літо";
                break;
            case 4: result = "Осінь";
                break;
            default:
                System.out.println("Помилка");
        }
    }
    //Задачи
    public static void task16(int day) {
        if (day >= 1 && day <= 10)
            System.out.println("1");
        else if (day >= 11 && day <= 20)
            System.out.println("2");
        else if (day >= 21 && day <= 30)
            System.out.println("3");
        else {
            System.out.println("4");
        }
    }
    public static void task17(int month) {
        if (month >= 12 && month <= 2)
            System.out.println("Зима");
        else if (month >= 3 && month <= 5)
            System.out.println("Весна");
        else if (month >= 6 && month <= 8)
            System.out.println("Літо");
        else if (month >= 9 && month <= 11)
            System.out.println("Осінь");
    }

}
