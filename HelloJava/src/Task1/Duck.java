package Task1;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck() {
        super();
    }
    public Duck(String name, Illness illness, String ownerName, LocalDate birthDay) {
        super(name, illness, ownerName, birthDay);
    }
}
