package day2.Inheritance;

public class Inheritance {
    public static void main (String[] args) {
//        Dog d1 = new Dog();
//        d1.bark();
//        d1.eat();

        Person p1 = new Person();
        p1.eat();

        Cat c1 = new Cat();
        c1.meow();
        c1.ability = "담을 뛰어넘는";
        c1.can();


        Cat c2 = new Cat();
        c2.meow();
        c2.ability = "미래를 예측하는";
        c2.can();

        Cat c3 = new BlackCat();
        c3.meow();
        c3.can();

        Cat c4 = new WhiteCat();
        c4.meow();
        c4.can();
    }
}

class Animal{
    public void eat(){
        System.out.println("먹는다");
    }
}


//class Dog extends Animal{ // class 대신 public이라고 쓰지 않도록 주의
//    public void bark(){
//        System.out.println("멍멍");
//    }
//}

class Cat extends Animal{
    String ability;
    public void meow(){
        System.out.println("야옹");
    }
    public void can(){
        System.out.println(ability + " 능력이 있습니다.");
    }
}

class BlackCat extends Cat{
    public void can(){
        System.out.println("미래를 예측하는 능력이 있습니다.");
    }
}

class WhiteCat extends Cat{
    public void can(){
        System.out.println("담장을 뛰어넘는 능력이 있습니다.");
    }
}

class Person extends Animal{
}