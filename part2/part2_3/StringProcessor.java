package part2.part2_3;

public class StringProcessor {
    public static int countVowels(String text) {
        // TODO: посчитайте русские и английские гласные.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int count = 0;
        String vowels = "aeiouyаеёиоуыэюя";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static boolean isPalindrome(String text) {
        // TODO: палиндром без учета регистра и знаков препинания.
        // Подсказка: сравнение символов с двух концов.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        text = text.toLowerCase().replaceAll("[^\\p{L}\\p{Nd}]+", " ").trim();
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String reverse(String text) {
        // TODO: реверс без StringBuilder.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        char[] chars = text.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String findLongestWord(String sentence) {
        // TODO: найдите самое длинное слово.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        String s1 = "Привет, Java-разработчик!";
        String s2 = "топот";
        String s3 = "Madam";
        String s4 = "hello";
        String s5 = "А роза упала на лапу Азора";
        String s6 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Гласные: " + countVowels(s1));
        System.out.println("Палиндром (топот): " + isPalindrome(s2));
        System.out.println("Палиндром (Madam): " + isPalindrome(s3));
        System.out.println("Реверс (hello): " + reverse(s4));
        System.out.println("Палиндром (фраза): " + isPalindrome(s5));
        System.out.println("Самое длинное слово: " + findLongestWord(s6));
    }
}
