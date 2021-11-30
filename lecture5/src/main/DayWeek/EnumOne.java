public class EnumOne
{
    public static void main (String[] args)
    {
        for (DaysWeek d : DaysWeek.values())
            System.out.println(d);

        DaysWeek dd = DaysWeek.Friday;
        System.out.println(dd.name() + " " + dd.ordinal());
    }
}
