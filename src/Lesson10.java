import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Lesson10 {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = "lol";
//        System.out.println(task1(a));
//        System.out.println(task2(a));
//        System.out.println(task3(a));
//        System.out.println(task4(a)+ ", " + task4(b));
//        System.out.println(task5(a));
        System.out.println(task8(a));
        System.out.println(task9(a, b));
    }
    //Написати функцію, яка підраховує кількість слів у рядку.
    public static int task1(String text) {
        String[] wordsAr = text.split(" ");
        int  wordCount = 0;
        for (int i = 0; i < wordsAr.length; i++)
            wordCount++;
        return wordCount;
    }
    //Напишіть метод, який приймає на вхід рядок і повертає його обернену версію.
    public static String task2(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }
    //Напишіть метод, який приймає рядок і повертає кількість голосних літер (a, e, i, o, u) у цьому рядку.
    public static int task3(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++)
            if (vowels.indexOf(text.charAt(i)) != -1)
                count++;
        return count;
    }
    //Напишіть метод, який перевіряє, чи є заданий рядок паліндромом.
    public static boolean task4(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    //Напишіть метод, який приймає рядок і повертає новий рядок без дублікатів.
    public static String task5(String text) {
        String result = "";
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                result += currentChar;
            }
        }
        return result;
    }
    //Напишіть метод, який приймає рядок і повертає масив, в якому кожний елемент - це окреме слово з рядка.
    public static ArrayList<String> task6(String text) {
        ArrayList<String> arr = new ArrayList<>();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++)
            arr.add(words[i]);
        return arr;
    }
    //Написати функцію, яка повертає новий рядок, де символи йдуть у зворотному порядку.
    public static ArrayList<String> task7(String text) {
        ArrayList<String> symbols = new ArrayList<>();
        ArrayList<String> reversedText = new ArrayList<>();
        for (int i = 0; i < text.length(); i++)
            symbols.add(String.valueOf(text.charAt(i)));
        for (int i = symbols.size() - 1 ; i >= 0 ; i--)
            reversedText.add(symbols.get(i));
        return reversedText;
    }
    //Написати функцію, яка перетворює першу літеру кожного слова у рядку у верхній регістр.
    public static String task8(String text) {
        String[] words = text.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstLetter = Character.toUpperCase(words[i].charAt(0));
                String restOfWord = words[i].substring(1);
                result += firstLetter + restOfWord;
            }
            if (i < words.length - 1)
                result += " ";
        }
        return result;
    }
    //Написати функцію, яка перевіряє, чи є два рядки анаграмами.
    public static boolean task9(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
