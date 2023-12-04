package Task1;

import java.time.LocalDate;

public class Rabbit extends Animal{
    public Rabbit() {
        super();
    }
    public Rabbit(String name, Illness illness, String ownerName, LocalDate birthDay) {
        super(name, illness, ownerName, birthDay);
    }
    @Override
    public void fly(){
        System.out.println("Not fly");
    }
}
