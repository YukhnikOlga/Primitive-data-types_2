//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 1000; // начальная сумма счета
        int amount = 1000; // сумма пополнения
        int bonus = amount / 100; // расчет бонусов 1/100

        if (amount <= 1000) {
            bonus = 0;
        } else {
            bonus = amount / 100;
        }

        int total = balance + bonus; // итоговая сумма на счет

        System.out.println("Пополнение: " + amount + " рублей");
        System.out.println("Начислено бонусов: " + bonus + " рублей");
        System.out.println("Текущий счет: " + total + " рублей");

    }

}