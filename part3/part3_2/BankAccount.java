package part3.part3_2;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final String owner;
    private int failedAttempts;
    private boolean blocked;
    private String pin;

    public BankAccount(String accountNumber, String owner, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.pin = pin;
        this.balance = initialBalance;
    }

    public boolean validatePin(String enteredPin) {
        return pin != null && pin.equals(enteredPin);
    }

    public boolean deposit(double amount) {
        // TODO: пополнение разрешено только при amount > 0.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public boolean withdraw(String enteredPin, double amount) {
        // TODO: реализуйте логику блокировки и попыток:
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        // 1) если blocked -> отказ;
        if (blocked) return false;
        // 2) неверный PIN увеличивает failedAttempts;
        if (!validatePin(enteredPin)) {
            failedAttempts++;
        }
        // 3) при 3 неверных попытках blocked=true;
        if (failedAttempts >= 3) {
            blocked = true;
            return false;
        }
        // 4) верный PIN сбрасывает failedAttempts и проверяет amount.
        failedAttempts = 0;
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public String getMaskedBalance() {
        // TODO: скрывайте суммы свыше 100000.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (balance > 100000) {
            return "100000+";
        }
        return String.valueOf(balance);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    @Override
    public String toString() {
        return String.format("BankAccount{%s, owner=%s, balance=%s}%s",
            accountNumber, owner, getMaskedBalance(), blocked ? " [ЗАБЛОКИРОВАН]" : "");
    }
}
