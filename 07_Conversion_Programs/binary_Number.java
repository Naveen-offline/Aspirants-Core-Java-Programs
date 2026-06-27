public class binary_Number {
    public static void main(String [] args){

        // Decimal to binary
        int a = 14;
        String b = "";
        while (a!=0) {
            int d = a%2;
            b = d + b;
            a=a/2;
        }
        System.out.println(b);

        //Binary to Decimal
        int c = 1000,count=0;
      
        for(int k=0;c>0;k++){
            int e = c %10;
            count = count+ e*(int)(Math.pow(2,k));
            c=c/10;
        }
        System.out.println(count);
    }   
}
