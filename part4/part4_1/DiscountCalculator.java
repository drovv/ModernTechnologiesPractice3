package part4.part4_1;

public class DiscountCalculator {

    public static double calculateDiscount(double price, String customerType) {
        // TODO: реализуйте скидку по типу клиента.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (customerType.toLowerCase()) {
            case "vip" -> price * 0.30;
            case "base" -> price * 0.10;
            default -> 0;
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int purchaseCount) {
        // TODO: реализуйте скидку по количеству покупок.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (purchaseCount >= 150) return price * 0.3;
        if (purchaseCount >= 50) return price * 0.2;
        return 0;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        // TODO: реализуйте скидку по промокоду + бонус за первый заказ.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0;
        if ("SAVE10".equals(promoCode)) discount = price * 0.10;
        if ("SAVE20".equals(promoCode)) discount = price * 0.20;
        if (isFirstOrder) discount += price * 0.05;
        return Math.min(discount, price * 0.50);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int age, String season) {
        // TODO: четвертая перегрузка (пример: возраст + сезон).
        // Подсказка: ограничьте максимальную скидку 50% от price.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0;
        if (age >= 65) discount += price * 0.20;
        if (season.equalsIgnoreCase("winter")) {
            discount += price * 0.1;
        }
        return Math.min(discount, price * 0.50);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}
