package pl.kinga;

public class TransactionAllIncome {
    public static void allIncome() {
        TransactionDao transactionDao = new TransactionDao();
        System.out.println("Aktualne przychody:");
        transactionDao.allIncome();
        System.out.println();
    }
}
