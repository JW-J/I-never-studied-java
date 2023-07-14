package Section8;

// 참조변수, 인스턴스 메소드를 이용해 Class 경로를 지정하는 것이 클래스 패스라는 용어를 가지고 있다.

class AAA {
    public void ShowName(){
        System.out.println("My name is AAA");
    }
}

class ZZZ {
    public void ShowName() {
        System.out.println("My name is ZZZ");
    }
}

class WhatYourName{
    public static void main(String[] args) {
        AAA Aname = new AAA(); // Aname의 참조 변수를 만들어 인스턴스메소드를 참조시키고 참조변수는 인스턴스를 가르킨다. (양방향)
        Aname.ShowName();       // Aname의 AAA class의 인스턴스 메소드 주소를 가진곳에서 showName의 결과 값을 받아온다.

        ZZZ Zname = new ZZZ();
        Zname.ShowName();
    }
}
