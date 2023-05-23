package Section6;

// 십진수에서 이진수로 변환할 때 공식은 십진수의 값을 2로 나누고 나눈 값을 2로 나머지 값 나누어주면 된다.
// 43인 경우, 43/2를 나누면 21이 나오고 이처럼 계속 나눠 이 값을 스택에 넣고 이 값 들을 2로 나머지값을 불러오면 된다.
// 하지만 마지막 0 또는 1은 어떻게 할건지 잘 고려해야 한다.
public class Question6_3_2 {

    // void를 사용한 이유는 반환할 값이 없는 경우
    public static void decimalToBinary(int decimal) {
        // 십진수를 1보다 작거나 같으면 입력한 값을 그대로 다시 리턴한다.
        if (decimal <= 1) {
            System.out.print(decimal);
            return;
        }

        // 43, 21, 10, 5, 2 그리고 위에서 1리턴.
        decimalToBinary(decimal / 2);


        // 1, 2, 5, 10, 21, 43 을 2로 나눠 나머지 값을 반환하여 출력한다. (메모리 스택[선입선출])
        // 1, 0, 1,  0,  1,  1 으로 반환한다.
        System.out.print(decimal % 2);
    }

    // main 메서드이기 때문에 제일 먼저 실행한다. 잊지말자. main 메서드가 제일 먼저 실행한다.
    public static void main(String[] args) {
        int decimal = 43;
        System.out.print("십진수 " + decimal + "의 이진수: ");
        decimalToBinary(decimal);
    }
}
