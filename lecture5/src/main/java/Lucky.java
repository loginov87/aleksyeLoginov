public class Lucky
{

        public int[] array = {15, 8, 24, 41, 9, 84};
        public int a = (int) (Math.random()*5);

        if (a%2 == 0)
        {
            System.out.println("I am lucky");
        }
        else
        {
            System.out.println("Run again");
        }

}
