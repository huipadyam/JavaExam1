package day2;

public class Static {
    public static void main (String[] args) {

        Dog d1 = new Dog();
        d1.name = "맥스";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "루시";
        d2.bark();

        d1.name = "톰";
        d1.bark();
    }
}

class Dog{
    String name; // static은 모든 Dog 객체가 공유하는 변수
    int age;
    static int aveLife = 13;

    public void bark(){ // ?
        System.out.println(name + "이/가 멍멍");
    }
}
