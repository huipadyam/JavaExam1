package day2;

public class Instance {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.age = 20;
        p1.name = "홍길동";
        p1.home = "서울";
        p1.height = 180.5;

        p1.introduce2();

    }

    // Person의 데이터를 이용해 자기소개 출력하는 함수
    // Person 데이터와 함수가 따로 떨어져 있다.
    public static void introduce2(Person p) {
        System.out.println("나이: " + p.age + " 이름: " + p.name + " 사는 곳: " + p.home + " 키: " + p.height);
    }
}

class Person {
    int age;
    String name;
    String home;
    double height;

    // Person의 데이터를 이용해 자기소개 출력하는 함수
    // Person 데이터와 함수가 같이 묶여있다.
    public void introduce2() {
        System.out.println("나이: " + age + " 이름: " + name + " 사는 곳: " + home + " 키: " + height);
    }
}