package Task1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); // Экземпляр класса
        cat.setName("barsik");
        System.out.println(cat.getName());
        Dog dog = new Dog("Max",new Chumka("Chumka"),"petr",
                LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
//        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();
        Duck duck = new Duck();
        cat.toGo();
    }
}
