package Section7;

class BankAccount {
    String accNumber;   //계좌번호
    String ssNumber;    //주민번호
    int balance = 0;      //예금잔액

    //초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

//    public static int deposit(int amount) {
//        BankAccount balance = new BankAccount();
//        balance.balance += amount;  //10000 += 5000
//        return balance.balance;     //리턴을 BankAccount 인스턴스메소드에서 가져온 값을리턴하기 때문에 돈이 안바뀐다.
//    }

    public int deposit(int amount) { //5000원 넘어옴
        balance += amount;  //balance 10000원 + 5000원
        return balance;     //계산된 balance 값을 리턴한다. BankAccount의 balance로!
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔   액 : " + balance);
        return balance;
    }


}
    class BankAccountUniID {
        public static void main(String[] args) {
            BankAccount yoon = new BankAccount();
            yoon.initAccount("12-34-89", "999999-999999", 10000);

            BankAccount park = new BankAccount();
            park.initAccount("33-55-99", "111111-111111", 10000);

            yoon.deposit(5000);
            park.deposit(3000);
            yoon.withdraw(2000);
            park.withdraw(2000);
            yoon.checkMyBalance();
            park.checkMyBalance();

        }

    }