package day2.constructor; // 생성자

public class Constructor {
    public static void main(String[] args) {
//        // 객체의 데이터 세팅을 잘 해줘야 함
//        Person p1 = new Person();
//        p1.age = 20;
//        p1.name = "홍길동";
//        p1.showInfo();
//
//        p1.setData(10, "hi");
//        // Person.setData(10, "hi"); // 안되는군
        new Person();
    }

}

class Person {
    int age;
    String name;

    Person(){
        System.out.println("생성자 실행");
    }

    public void setData(int age, String name){
        this.age = age; // p1이 함수를 실행하면 this는 p1
        this.name = name;
    }

    // 함수가 지역변수, 인스턴스를 사용해서 기능 수행
    // 변수가 올바라아 함수가 잘 작동함
    public void showInfo(){
        System.out.println("이름: " + name + " 나이 : " + age);
    }
}
