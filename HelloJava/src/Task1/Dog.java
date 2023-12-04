package Task1;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog() {
        super();
    }
    public Dog(String name, Illness illness, String ownerName, LocalDate birthDay) {
        super(name, illness, ownerName, birthDay);
    }
    @Override
    public void fly(){
        System.out.println("Not fly");
    }
}
