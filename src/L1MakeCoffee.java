import java.util.Scanner;

public class L1MakeCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки цукру додати?");
        int sugar = scanner.nextInt();

        barista(sugar);
    }

    public static void barista(int sugar) {
        System.out.println("Кип'ятимо воду");
        System.out.println("Заливаємо в чашку кип'ячену воду");
        System.out.println("Додаємо каву");
        if (sugar == 0) {
            System.out.println("перемішуємо");
        } else {
            System.out.println("Додаємо " + sugar + " цукру та перемішуємо");
        }
        System.out.println("Кава готова смакуємо :)");
    }
}