//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int initialBalance = 200;
        int topUp = 5000;

        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }

        int finalBalance = initialBalance + topUp + bonus;

        System.out.println("Итоговый баланс: " + finalBalance);
    }

}