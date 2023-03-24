package Section5;

public class question5_7_1 {

    // 2,4,6,8단만 출력하고 2단은 2x2 , 4단은 4x4 이런식으로만 되도록 한다.
// break 는 현재있는 반복문만 나갈 수 있지만 [output:] 을 사용하여 자신이 원하는 for문을 종료할 수 있다.

    public static void main(String[] args) {

        int i;
        int j = 1;

        for (i = 1; i < 9; i++) {
            if (i % 2 == 0)
//                output:
                for (j = 1; i >= j; j++) {
                    if (i == 4)         // i가 4면 즉 4단이라면 멈추고 output 이라 지정한 반복문을 빠져나가겠다는 의미
//                    break output;
                        System.out.println(i + "x" + j + "=" + i * j);

                }
        }
    }
}//