package Task1;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat() {
        super();
    }
    public Cat(String name, Illness illness, String ownerName, LocalDate birthDay) {
        super(name, illness, ownerName, birthDay);
    }
    @Override
    public void fly(){
        System.out.println("Not fly");
    }
    @Override
    public void swim(){
        System.out.println("Not swim");
    }
}
