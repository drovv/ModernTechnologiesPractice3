package part2.part2_2;

public class Fibonacci {

    public static long fibIterative(int n) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n <= 1) return n;

        long a = 0l;
        long b = 1l;
        int i = 2;
        while (i <= n) {
            long c = a + b;
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

        long a = 0l;
        long b = 1l;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        };
        return b;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long firstGreaterThan(long threshold) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        long a = 0l;
        long b = 1l;
        while (b <= threshold) {
            long c = a + b;
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
