package pl.kinga;

import java.util.Scanner;

public class TransactionDelete {
    public static void deleteById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id");
        Integer id = scanner.nextInt();
        TransactionDao transactionDao = new TransactionDao();


        transactionDao.deleteById(id);
        System.out.println("Usunięto!");
    }
}

