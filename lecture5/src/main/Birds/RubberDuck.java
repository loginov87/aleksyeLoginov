public class RubberDuck extends Birds implements CanSwim
{

   String materials;
   String beak;

    public RubberDuck(String name, String type, String materials, String beak) {
        super(name, type);
        this.materials = materials;
        this.beak = beak;
    }


    @Override
    public void fly() {
        System.out.println("I can't fly");

    }

    @Override
    public void iAm() {
        System.out.println("I am Rubber Duck");
    }

    @Override
    public void canSwim() {

    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", materials='" + materials + '\'' +
                ", beak='" + beak + '\'' +
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
}
