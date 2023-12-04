//  В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
package Task1;

import java.time.LocalDate;

public class Animal {
    private String name;

    private Illness illness;

    private String ownerName;

    private LocalDate birthDay;

    public Animal() {
    }
        public Animal(String name, Illness illness, String ownerName, LocalDate birthDay) {
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthDay = birthDay;
    }

//    public Animal(String X, Illness illness, String ownerName) {
//        this.name = X;
//        this.illness = illness;
//        this.ownerName = ownerName;
//    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Illness getIllness(){
        return illness;
    }
    private void toWakeUp(){
        System.out.println(getClass().getSimpleName() + " wake up");
    }

    private void eat(){
        System.out.println(getClass().getSimpleName() + " eat");
    }
    private void play(){
        System.out.print(getClass().getSimpleName() + " play");
    }
    private void sleep(){
        System.out.print(getClass().getSimpleName() + " sleep");
    }
    public void liveCycle() {
        toWakeUp();
        eat();
        play();
        sleep();
    }
    public void breathe(){
        System.out.println(" breathe");
    }
    public void toGo() {
        System.out.println(getClass().getSimpleName() + "to go");
    }
    public void fly(){
        System.out.println(getClass().getSimpleName() + "fly");
    }
    public void swim()
    {
        System.out.println(getClass().getSimpleName() + "swim");
    }
}
