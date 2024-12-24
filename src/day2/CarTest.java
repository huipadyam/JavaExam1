package day2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();


        car1.name = "아반떼";
        car1.velocity = 200;
        car1.run();
        car2.name = "싼타페";
        car2.velocity = 150;
        car2.run();
        car3.name = "모닝";
        car3.velocity = 00;
        car3.run();
    }
}

class Car{
    String name;
    int velocity;

    public void run(){ // public static?
        System.out.println(name + "이/가 시속 " + velocity + "km로 달립니다.");
    }
}
