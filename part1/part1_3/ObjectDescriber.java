package part1.part1_3;

import java.util.Arrays;

public class ObjectDescriber {

    public static String describe(Object obj) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (obj) {
            case null -> "Объект: null";
            case Integer i when i > 0 -> "Положительное число: " + i;
            case Integer i -> "Отрицательное число: " + i;
            case String s when s.isEmpty() -> "Пустая строка";
            case String s -> "Строка: " + s;
            case Double d -> "Число с плавающей точкой: " + d;
            case int[] arr -> "Массив целых чисел: " + Arrays.toString(arr);
            default -> "Неизвестный тип: " + obj.toString();
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        Object[] samples = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};
        for (Object sample : samples) {
            System.out.println(describe(sample));
        }
        // Проверь себя: пустая строка и непустая строка должны различаться.
        // Типичные ошибки: забывают обработать default.
    }
}
