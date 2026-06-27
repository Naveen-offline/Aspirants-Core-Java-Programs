public class Skip_Number_Using_Continue {
    public static void main(String [] args)
    {
        int a = 100;
        while (a < 10) 
        {
            if (a == 5) 
            {
                 a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
