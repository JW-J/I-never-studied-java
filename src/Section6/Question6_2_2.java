package Section6;

public class Question6_2_2 {

    // 전달 된 값이 소수(Prime Number)인지 아닌지를 판단하여,소수인경우true를,
    // 소수가 아닌 경우 false를 반환하는 메소드를 정의하고,
    // 이 메소드의 호출 결과를 기반으로 1이상 100이하의 소수를 전부 출력하는 main 메소드를 정의하자.

    // 쉽게 설명하면, 1~100까지의 소수라고하면 1과 자기자신으로밖에 나올수 없는 수를 뜻한다.
    // 더 쉽게 말하면, 자연수 중에 1과 자기자신만을 약수로 가진다는것. (27의 숫자는 1과 27로밖에 안 나눠진다.)

    // 1. 찾고자 하는 범위의 자연수를 나열한다.
    // 2. 1은 지운다.
    // 3. 2부터 시작하여, 2의 배수를 지워나간다.
    // 4. 다음 소수의 배수를 모두 지운다.

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) { // 특정 자연수를 생성한다. 예를들기위해 23이라고 가정한다.
            if (isPrimeNumber(i)) // 23이라는 숫자를 isPrimeNumber method로 보낸다.
                System.out.println(i);
        }
    }
    public static boolean isPrimeNumber(int num) { // 특정 자연수인 23을 받는다.

        if (num == 1) // 1은 모든 수의 약수이기 때문에 1인지 확인하고 아니라면 다음 30번째 라인으로 이동한다.
            return false;

        for (int i = 2; i < num; i++) { // 특정 자연수 23이 i값보다 작거나 같은지 확인한다.
                                        // *num과 같은수는 약수이기때문에 제외한다.
            if(num % i == 0)               // 특정 자연수 23을 i값인 2부터 계속 증가 시켜 num보다 작거나 같은 수까지 나눠본다.
                return false;  // 특정 수(num)을 받아 그 수 보다 낮거나 같은 수로 나눠서 0으로 나눠진다면 실수가 아니다.
        }
        return true; // 나눠지지 않았다면 그것은 소수에 포함된다.
    }
}//main metd