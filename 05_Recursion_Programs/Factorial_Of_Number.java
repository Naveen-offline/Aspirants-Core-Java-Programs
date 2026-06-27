public class Factorial_Of_Number {
    static int fact(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) {
        int a = fact(6);
        System.out.println(a);

        // Without function call
        int b=5,sum=1;
        for(int i = 1;i<=b;i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}