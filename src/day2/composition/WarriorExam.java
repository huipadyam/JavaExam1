package day2.composition;

public class WarriorExam {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        System.out.println(w1.name);
        w1.attack();
    }
}

class Warrior{
    int age = 20;
    String name = "홍길동";
    Sword sword = new Sword();

    public void attack(){
        sword.use();
    }
}

class Sword{
    public void use(){
        System.out.println("공격");
    }
}

// Warrior가 Sword를 원격 조종함. 둘이 일체는 아님.
// 의지는 전사가 가지고 있지만 행동은 검이 함.