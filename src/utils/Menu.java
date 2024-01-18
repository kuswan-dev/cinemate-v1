package utils;

import java.util.Scanner;

public class Menu {
    public static int showAndSelectMenu(String[] menus, String instruction) {
        Scanner scanner = new Scanner(System.in);
        int selectedNumber = 0;
        boolean isValid = false;

        for (int i = 0; i < menus.length; i++) {
            System.out.println("\t▶ " + (i + 1) + ". " + menus[i]);
        }

        System.out.print(instruction);
        while (!isValid) {
            if (scanner.hasNextInt()) {
                selectedNumber = scanner.nextInt();
                if (selectedNumber <= menus.length) {
                    isValid = true;
                } else {
                    System.out.println("Input not valid!");
                }
            } else {
                System.out.println("Input not valid!");
                scanner.next();
            }
        }
        scanner.close();
        return selectedNumber;
    }
}
