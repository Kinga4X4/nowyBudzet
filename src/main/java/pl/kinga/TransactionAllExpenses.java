package pl.kinga;

public class TransactionAllExpenses {

    public static void allExpenses() {
        TransactionDao transactionDao = new TransactionDao();
        System.out.println("Aktualne wydatki:");
        transactionDao.allExpenses();
        System.out.println();
    }
}
