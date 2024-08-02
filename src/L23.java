import java.util.*;
import java.util.stream.*;

public class L23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Введіть число: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("final"))
                break;

                int number = Integer.parseInt(input);
                numbers.add(number);
                System.out.println("Введіть Final для завершення вводу \nАбо наступне число ");
        }
        int[] numArr = numbers.stream().mapToInt(Integer::intValue).toArray();

        //Знайдіть суму всіх парних чисел у списку.
        int sum = IntStream.of(numArr).filter(n -> n % 2 == 0).sum();
        System.out.println("Сума всіх парних чисел: " + sum);

        // Помножте кожне число у списку на 2 та виведіть результат.
        int[] doubledNumbers = IntStream.of(numArr).map(n -> n * 2).toArray();
        System.out.println("Числа, помножені на 2: " + Arrays.toString(doubledNumbers));

        //Визначте максимальне число у списку.
        int maxNumber = IntStream.of(numArr).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Максимальне число: " + maxNumber) ;

        //Виведіть лише непарні числа у вигляді рядка, розділених комою.
        String oddNumbers = IntStream.of(numArr).filter(n -> n % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Непарні числа: " + oddNumbers);

        // Знайдіть середнє арифметичне всіх чисел у списку
        double average = IntStream.of(numArr).average().orElse(Double.NaN);
        System.out.println("Середнє арифметичне: " + average);
    }
}
