package pl.kinga;

import java.util.Scanner;

public class TransactionApp {
    private static final TransactionDao DAO = new TransactionDao();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz jedną z opcji. Dostępne opcje:");
            System.out.println("1. Dodawanie transakcji:");
            System.out.println("2. Modyfikacja transakcji:");
            System.out.println("3. Usuwanie transakcji:");
            System.out.println("4. Wyświetlanie wszystkich przychodów");
            System.out.println("5. Wyświetlanie wszystkich wydatków");
            System.out.println("0. Wyjście/Koniec");
            String option = scanner.nextLine();

            switch (option) {

                case "1":
                    TransactionAdd.addTransaction();
                    break;
                case "2":
                    TransactionUpdate.update();
                    break;
                case "3":
                    TransactionDelete.deleteById();
                    break;
                case "4":
                    TransactionAllIncome.allIncome();
                    break;
                case "5":
                    TransactionAllExpenses.allExpenses();
                    break;
                case "0":
                    DAO.close();
                    break;
                default:
                    System.out.println("Nieznana opcja!");
            }
        }
    }
}

