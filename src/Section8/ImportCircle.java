package Section8;
import com.wxfx.smart.Circle; // Circle 이라하면 com 패키지의 wxfx회사의 smart 안에 있는 circle이라고 간주한다.

public class ImportCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.5);
        System.out.println("반지금 3.5 원 넓이 : " + c1.getArea());
        Circle c2 = new Circle(5.5);
        System.out.println("반지금 3.5 원 넓이 : " + c2.getArea());
    }



}
