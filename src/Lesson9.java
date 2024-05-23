import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Lesson9 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(46);
        arr.add(0);
        arr.add(12);
        arr.add(-3);
        arr.add(46);
//        System.out.println(findMaxElement(arr));
//        System.out.println(getUniqueElements(arr));
//        Map<Integer, Integer> frequencyMap = countFrequency(arr);
//        System.out.println("Частота появи елементів:");
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
//            System.out.println(entry.getKey() + ": " + entry.getValue());
        String text = "Це приклад тексту текст може бути будь-яким текст";
        Map<String, Integer> wordFrequency = countWordFrequency(text);
        System.out.println("Частота кожного слова:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    public static int findMaxElement(ArrayList<Integer> arr) {
        int maxElement = arr.get(1);
        for (int i = 2; i< arr.size(); i++)
            if (arr.get(i) > maxElement)
                maxElement = arr.get(i);
        return maxElement;
    }
    public static boolean isPalindrome(int number) {
        if (number < 0)
            return false;

        int reversed = 0;
        int original = number;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> list) {
        HashSet<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
    public static Map<Integer, Integer> countFrequency(ArrayList<Integer> arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch) || ch == '\'')
                word.append(ch);
            else if (word.length() > 0) {
                String currentWord = word.toString().toLowerCase();
                wordFrequency.put(currentWord, wordFrequency.getOrDefault(currentWord, 0) + 1);
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            String currentWord = word.toString().toLowerCase();
            wordFrequency.put(currentWord, wordFrequency.getOrDefault(currentWord, 0) + 1);
        }
        return wordFrequency;
    }

}
