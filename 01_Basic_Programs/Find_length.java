public class Find_length {
  public static void main(String[] args) {
    int a = 108;
    int d= 123;
    int n=0;
    // While loop using to find length of int
    while (a>0) 
    {
        a=a/10;
        n++;
    }
        System.out.println(n);


    // building function using to fing length of int
    int b = (int)Math.log10(d)+1;
    System.out.println(b);

    // String using to find the length
    int c = 12345;
    String s = String.valueOf(c);
    int r = s.length();
    System.out.println(r);
  }
    }

