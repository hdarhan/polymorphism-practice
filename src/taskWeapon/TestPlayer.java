package taskWeapon;

import java.util.Scanner;

public class TestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        taskWeapon.Player player = new taskWeapon.Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры с помощью scanner.nextInt(), пока не будет введено -1

        while (true) {
            System.out.println("Введите число");
            slot = scanner.nextInt(); // Считываем значение из консоли в переменную
            if (slot == -1) {
                System.out.println("Game over");
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}