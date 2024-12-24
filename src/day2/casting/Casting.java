package day2.casting;

public class Casting {
    public static void main(String[] args) {
        // 숫자 타입 형변환
        // 1. 자동 형변환 (작은 타입 -> 큰 타입)
        // 2. 수동 형변환 (강제로 하면 문제가 발생할 수 있다.)


        // 클래스 타입 형변환
        // 1. 자동 형변환 (작은 타입 -> 큰 타입)
        // 2. 수동 형변환 (강제로 하면 문제가 발생할 수 있다.)


        칼 sword = new 칼();
        활 bow = new 활();
        // 도끼, 창, 지팡이, ....

        무기 weapon = new 칼(); // 칼이 무기로 변환되어야만 가능.


        weapon.사용(); // 칼을 휘두르다

        weapon = new 활();
        // weapon = new 무기();

        weapon.사용(); // 화살을 날린다
        // 오버라이딩을 해서 부모 클래스로 업캐스팅된 자식의 메서드 실행
        // 재정의 됐을 때 부모 메서드 호출하려면? super 사용!

        weapon = new 도끼();
        weapon.사용();

    }
}

class Worrior {
    무기 weapon = new 활();
}

abstract class 무기 { // abstract 메서드를 하나라도 가지면 추상클래스 (-> super 할 수 없음, new 할 수 없음)
    abstract void 사용();// 호출 trigger 용으로만 만들어놓음
}

class 칼 extends 무기 {
    void 사용() { // 접근지정자까지 똑같아야 오버라이딩임!!
        System.out.println("칼을 휘두르다.");
    }
}

class 활 extends 무기 {
    void 사용() {
        System.out.println("화살을 날린다.");
    }
}

class 도끼 extends 무기 {
    void 사용() { System.out.println("도끼로 찍는다."); } // 무조건 추상 메서드를 구현해야 함
}
