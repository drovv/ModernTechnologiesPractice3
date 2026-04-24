package part2.part2_2;

public class Fibonacci {

    public static long fibIterative(int n) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n <= 1) return n;

        int a = 0;
        int b = 1;
        int i = 2;
        while (i <= n) {
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        return b;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long fibFor(int n) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n <= 1) return n;

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        };
        return b;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long firstGreaterThan(long threshold) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int a = 0;
        int b = 1;
        while (b <= threshold) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.printf("F(%d)=%d | %d%n", i, fibIterative(i), fibFor(i));
        }
        System.out.println("Первое число Фибоначчи > 1000: " + firstGreaterThan(1000));
        // Проверь себя: обе реализации fib дают одинаковые значения.
    }
}
