package Section7;

class BankAccount {
     int balance = 0;

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("남은 잔액 : " + balance);
        return balance;
    }
}

class BankAccountOO {
    public static void main(String[] args) {
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        yoon.deposit(8000);
        park.deposit(3000);

        yoon.withdraw(5000);
        park.withdraw(2000);

//        System.out.println(yoon);
//        yoon = new BankAccount();
//        System.out.println(yoon);

        yoon.checkMyBalance();
        park.checkMyBalance();
    }

}



