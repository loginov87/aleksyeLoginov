public class Swan extends Birds implements CanEat, CanSwim, CanFly
{

    public Swan(String type, String name)
    {
        super(type,name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void canEat() {

        System.out.println("I eat fish");
    }

    @Override
    public Double speed(CanFly canFly) {
        Double swanFlySpeed = 120.0;
        return swanFlySpeed;
    }

    @Override
    public Double speed() {
        Double swanMoveSpeed = 5.0;
        return swanMoveSpeed;
    }

    @Override
    public void canSwim() {
        System.out.println(" I can swim");

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
        System.out.println("I am Swan");
    }

}
