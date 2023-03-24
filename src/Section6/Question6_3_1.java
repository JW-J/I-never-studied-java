package Section6;

// 특정 인수와 제곱근을 지정하여 계산해주는 알고리즘.

public class Question6_3_1 {
    public static void main(String[] args) {

        System.out.println(addfactorial(2, 5)); // num : 반복할 인수 ; count : 제곱근 지정

    }
    public static int addfactorial(int num, int count) {

        if (count == 0) // 0의 제곱근을 할 경우 인수(예시:2)만 반환 한다.
            return num; // count가 0인 경우 반복 인자를 반환해 곱해지도록 한다.
        else
            return num * addfactorial(num, count-1); // count-1을 통해 제곱은 횟수를 하나씩 차감 한다.

    }
}
