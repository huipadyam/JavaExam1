package day2.duckSimul;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.fly();

        BlueDuck bd1 = new BlueDuck();
        bd1.fly();

        WhiteDuck wd1 = new WhiteDuck();
        wd1.fly();

        RubberDuck rd1 = new RubberDuck();
        rd1.fly();

        Rubber2Duck r2d1 = new Rubber2Duck();
        r2d1.fly();

        // 오리(날아) <- 러버덕(오버라이딩 - 못날아) <- 러버2덕(못날아)

        RobotDuck rod1 = new RobotDuck();
        rod1.fly();
        rod1.swim();

        // fly는 RubberDuck, swim은 Duck?!
    }
}

class Duck{
    Wing w = new Wing();
    Feet f = new Feet();
    public void fly(){
        System.out.println("오리가 날개로 날아갑니다.");
    }

    void swim(){
        System.out.println("물갈퀴로 수영합니다.");
    }
}

class Wing{
    public void fly(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class RubberWing{
    public void fly(){
        System.out.println("저는 못 날아요. ㅠㅠ");
    }
}

class RubberFeet{
    public void swim(){
        System.out.println("물갈퀴로 수영합니다.");
    }
}
class Feet{
    void swim(){
        System.out.println("물갈퀴로 수영합니다.");
    }
}

class BlueDuck extends Duck{}

class WhiteDuck extends Duck{}

class RubberDuck extends Duck{
    RubberWing rw = new RubberWing();
    RubberFeet rf = new RubberFeet();

    public void fly(){
        rw.fly();
    }


    void swim(){
        rf.swim();
    }
}

class Rubber2Duck extends RubberDuck{
}

class RobotDuck{
    Duck d1 = new Duck();
    RubberDuck rd1 = new RubberDuck();
    
    

    void fly(){
        rd1.fly();
    }
    void swim(){
        d1.swim();
        // System.out.println("물갈퀴로 수영합니다.");
        // 이렇게 할 수 밖에 없음!(상속으로는 중복 없이 하기 불가능)
    }
}