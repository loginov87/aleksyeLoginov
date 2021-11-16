public class Martin extends Birds implements CanEat, CanFly
{

    String beak;

    public Martin(String name, String type, String beak) {
        super(name, type);
        this.beak = beak;
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

        System.out.println("I can fly");

    }

    @Override
    public void iAm() {
        System.out.println("I am Martin");

    }

    @Override
    public void canEat() {
        System.out.println("I eat bugs");

    }

    @Override
    public Double speed(CanFly canFly) {
        Double martinFySpeed = 10.00;
        return martinFySpeed;
    }

    @Override
    public Double speed() {
        Double martinMoveSpeed = 2.0;
        return martinMoveSpeed;
    }

    @Override
    public String toString() {
        return "Martin{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", beak='" + beak + '\'' +
                '}';
    }
}
