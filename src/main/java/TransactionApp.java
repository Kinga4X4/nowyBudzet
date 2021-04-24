import java.util.Scanner;

public class TransactionApp {
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
                    pl.kinga.TransactionAdd.main(new String[0]);
                    break;
                case "2":
                    TransactionUpdate.main(new String[0]);
                    break;
                case "3":
                    pl.kinga.TransactionDelete.main(new String[0]);
                    break;
                case "4":
                    pl.kinga.TransactionAllIncome.main(new String[0]);
                    break;
                case "5":
                    pl.kinga.TransactionAllExpenses.main(new String[0]);
                    break;
                case "0":
                    close();
                    break;
                default:
                    System.out.println("Nieznana opcja!");
            }
        }
    }

}
