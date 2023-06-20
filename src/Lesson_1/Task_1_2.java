package Lesson_1;

// Определение класса "Счет"
class Account {
    private String accountNumber;
    private double balance;

    // Конструктор класса
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        balance += amount;
    }

    // Метод для снятия средств со счета
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    // Метод для получения баланса счета
    public double getBalance() {
        return balance;
    }

    // Метод для вывода информации о счете
    public void printAccountInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Баланс: " + balance);
    }
}

// Пример использования класса "Счет"
public class Task_1_2 {
    public static void main(String[] args) {
        // Создание объекта класса "Счет"
        Account account = new Account("1234567890", 1000.0);

        // Взаимодействие с объектом
        account.deposit(500.0);
        account.withdraw(200.0);
        account.printAccountInfo();
    }
}