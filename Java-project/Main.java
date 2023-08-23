import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Toys.Toy;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean flag = true;
        ArrayList<Toy> generalToysPool = ListUtils.createNewToyList(15);
        Draw prizePool = new Draw();

        while (flag) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Меню операций:");
            System.out.println("1: Показать общий список игрушек");
            System.out.println("2: Добавить случайную игрушку в общий список");
            System.out.println("3: Провести розыгрыш");
            System.out.println("4: Просмотреть призовой список");
            System.out.println("5: Забрать призовую игрушку (сохранить в файл)");
            System.out.println("6: Выйти из приложения");
            int choice = 0;
            try {
                choice = iScanner.nextInt();
            } catch (InputMismatchException ex) {
            }
            switch(choice){
                case 1:
                    ListUtils.printInfo();
                    break;
                case 2:
                    ListUtils.addNewToy(generalToysPool);
                    break;
                case 3:

                    break;
                case 4:
                    prizePool.printInfo();
                    break;
                case 5:

                    break;
                case 6:
                    flag = false;
                    iScanner.close();
                    break;
                default:
                    System.out.println("Неверный номер операции\n");
                    break;
            }
        }
    }
}