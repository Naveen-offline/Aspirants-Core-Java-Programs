public class Odd_Numbers_Using_While {
    public static void main(String [] args)
    {
        int n = 100;
        int i =1;
        while (i<=n) {
            if(i%2==0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
