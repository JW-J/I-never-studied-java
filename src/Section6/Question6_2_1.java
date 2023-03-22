package Section6;

public class Question6_2_1 {

    // 반지름의 정보를 제공 후 : 원의넓이를 계산해서 반환하는메소드 / 원의둘레를계산해서 반환하는 메소드를 각각 정의
    // 원의 넓이 = 반지름 X 반지름 X 3.14
    // 원의 둘레 = 반지름 X 2 X 3.14

    public static void main(String[] args) {

        double area; // 원의 넓이
        double round; // 원의 둘레
        double redius = 4; // 반지름 4

        area = addcircle(redius); // 반지름 4를
        round = addround(redius); // 반지름 4를

        System.out.println("원의 넓이 : " + area);
        System.out.println("원의 둘레 : " + round);

    }

    public static double addcircle(double num) { // 원의 넓이 계산
        double result = (num * num) * 3.14;
        // 지역 변수가 중복?
        return result;
    }

    public static double addround(double num) { // 원의 둘레 계산
        return (num * 2) * 3.14;
    }
}
