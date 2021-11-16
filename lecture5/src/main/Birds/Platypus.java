public class Platypus extends Birds implements CanSwim, CanEat
{

    String gender;

    public Platypus(String name, String type, String gender) {
        super(name, type);
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Platypus{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");

    }

    @Override
    public void iAm() {
        System.out.println("I am Platypus");
    }

    @Override
    public void canEat() {

    }

    @Override
    public void canSwim() {

    }
}
