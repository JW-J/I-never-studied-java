package Section7;

public class BankAccountPO {
    static int balance = 0;

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

    public static void main(String[] agrs){

//      deposit : 입금
//      withdrow : 출금
//      checkMyBalance : 잔액 확인

        deposit(10000);
        withdraw(3000);
        deposit(30000);
        withdraw(20000);
        checkMyBalance();
    }

}
