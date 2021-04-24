package pl.kinga;

import java.time.LocalDate;
import java.util.Scanner;

public class TransactionUpdate {
    public static void update() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj typ transakcji. Dostępne typy:");
        Type[] type = Type.values();
        for (Type type1 : type) {
            String name = type1.name();
            System.out.println(name);
        }
        String type1 = scanner.nextLine();
        System.out.println("Podaj opis transakcji");
        String description = scanner.nextLine();
        System.out.println("Podaj kwotę transakcji");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj datę transakcji");
        String localDate = scanner.nextLine();

        System.out.println("Podaj id transakcji, którą chcesz zaktualizować");
        int id = scanner.nextInt();
        scanner.nextLine();

        Transaction transaction = new Transaction(id, Type.valueOf(type1), description, amount, LocalDate.parse(localDate));
        TransactionDao transactionDao = new TransactionDao();
        transactionDao.update(transaction);
    }
}


