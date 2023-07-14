//package com.fxmx.simple;
//package com.wxfx.smart;

// 현재 이파일은 fxmx.simple 파일 아래 있다.
package com.wxfx.smart;

class CircleUsing {
    public static void main(String[] args) {
        // wxfx회사의 smart라는 원의 둘레/넓이를 구하는 기술로 구현
        com.wxfx.smart.Circle c2 = new com.wxfx.smart.Circle(3.5);
        System.out.println("반지름 3.5 원 둘레 : " + c2.getArea());

        // fxmx회사의 simple이라는 원의 둘레/넓이를 구하는 기술로 구현
        com.fxmx.simple.Circle c1 = new com.fxmx.simple.Circle(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + c1.getArea());

    }
}
