package Section7;

class BankAccount {
    static int balance = 0; //예금잔액

    public static int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public static int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public static int checkMyBalance() {
        System.out.println("남은 잔액 : " + balance);
        return balance;
    }

    public static void main(String[] agrs) {
        BankAccount ref = new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);
    }

    public static void check(BankAccount acc) {
        acc.checkMyBalance();
    }

}
