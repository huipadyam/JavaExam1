package day2.composition;

public class Main {
    public static void main (String[] args){
        Dong dong = new Dong();
        Soon soon = new Soon();

        dong.javaDev();
        soon.javaDev();
        soon.pyDev();
    }
}

class Dong{
    public void javaDev(){
        System.out.println("Develop Java23");
    }
}
class Soon{
    int age;

    Dong callDong = new Dong();

    public void javaDev(){
    // System.out.println("Develop Java23");
        callDong.javaDev(); // 객체가 다른 객체를 활용함(구성 방식)
    }
    public void pyDev(){
        System.out.println("Develop Python");
    }
}

class LeeCorp {
    // Dong callDong = new Dong();
    Soon callSoon = new Soon();
    public void javaDev(){
        callSoon.javaDev();
    }
    public void pyDev(){
        callSoon.pyDev();
    }
}
