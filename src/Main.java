public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 200;
        int deposite = 1300;
        int bonus;
        if (deposite > 1000)
        {
            bonus = deposite / 100;
        } else {
            bonus = 0;
        }
        int newBalance = balance + deposite + bonus;
        System.out.println("Начальный баланс=" + balance);
        System.out.println("Сумма пополнения=" + deposite);
        System.out.println("Бонус=" + bonus);
        System.out.println("Новый баланс=" + newBalance);
        }
    }