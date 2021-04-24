package pl.kinga;

import java.time.LocalDate;
import java.util.Scanner;

public class TransactionAdd {
    public static void addTransaction() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj typ transakcji. Dostępne typy:");
        Type[] type = Type.values();
        for (Type type1 : type) {
            type1.name();
        }
        String type1 = scanner.nextLine();
        System.out.println("Podaj opis transakcji.");
        String description = scanner.nextLine();
        System.out.println("Podaj kwotę transakcji.");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj datę transakcji.");
        String localDate = scanner.nextLine();

        Transaction transaction = new Transaction(Type.valueOf(type1), description, amount, LocalDate.parse(localDate));
        TransactionDao transactionDao = new TransactionDao();
        transactionDao.addTransaction(transaction);
    }
}
