//package Section7;
//
//    class BankAccount { //
//        int balance = 0;
//
//        public int deposit(int amount) {
//            balance += amount;
//            return balance;
//        }
//
//        public int withdraw(int amount) {
//            balance -= amount;
//            return balance;
//        }
//
//        public int checkMyBalance() {
//            System.out.println("남은 잔액 : " + balance);
//            return balance;
//        }
//    }
//
//    class DupRef{
//        public static void main(String[] args) {
//
//            int ref1 = 0;
//            int ref2 = 0;
//
//
//            System.out.println(ref1); // BankAccount 클래스 참조값이 들어감
//            System.out.println(ref2); // BankAccount 클래스 참조값이 들어감
//
//            ref1.deposit(3000);
//            ref2.deposit(2000);
//            // ref1 : 3000
//            // ref2 : 2000
//            ref1.withdraw(400);
//            ref2.withdraw(300);
//            // ref1 : 2600
//            // ref2 : 1700
//
//            ref1.checkMyBalance();
//            ref2.checkMyBalance();
//
//        }
//    }
//
