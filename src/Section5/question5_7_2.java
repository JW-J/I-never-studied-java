package Section5;

public class question5_7_2 {
    // 다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성해보기
    // A와 B가 각각 어떠한 수가 들어가야 합 99가 나오는지 경우의 수를 보여주는 프로그램을 원한것으로 보여짐.
    // A(0) B(9)
    // B(9) A(0)
    //------
    //   9    9

    public static void main(String[] args) {
        // 그냥 내가 푼 알고리즘.
        int A = 0;
        int B = 0;

        for (A = 0; A < 10; A++) {
            for (B = 0; B < 10; B++) {
                if (A + B == 9)
                    System.out.println(A + "," + B);
            }
        }
    }
}//

// 원래 문제의 알고리즘.
//        for (int A = 0; A < 10; A++) {
//            for (int B = 0; B < 10; B++) {
//                if ((A * 10 + B) + (B * 10 + A) == 99){
//                    System.out.println("A:" + A + ", " + "B:" +B);
//                }
//            }
//        }