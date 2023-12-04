package Task1;

public class Illness {
    public String illinessName;
    public Illness(String illinessName){
        this.illinessName = illinessName;
    }
    public void heal(){
        System.out.println("drink water witch paracetamol");
    }

    @Override
    public String toString() {
        return illinessName;
    }
}
