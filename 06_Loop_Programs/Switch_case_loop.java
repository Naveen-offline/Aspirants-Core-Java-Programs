import java.util.Scanner;
public class Switch_case_loop {
    public static void main(String[] args) {
        
        while(true){
        System.out.println("   ");
        System.out.println("1. reversing a number ");
        System.out.println("2. checking palindrome");
        System.out.println("3. counting digits in a number");
        System.out.println("4. checking whether the number is perfect number");
        System.out.println("5. printing all the perfect number between 1 to 10000 ");
       System.out.println("enter your choice: ");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
         switch(a){
          case 1:
            System.out.println("enter a number: ");
            int b = sc.nextInt();
            while(b!=0){
                int c = b%10;
                System.out.print(c);
                b=b/10;
            }
          break;
          case 2:
          System.out.println("enter a number: ");
            int d = sc.nextInt();
            int y = d;
            int f=0;
            while(d!=0){
                int e = d%10;
                f = f*10+e;
                d=d/10;
            }
            if(y==f){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
          break;
          case 3:
          System.out.println("enter a number: ");
            int g = sc.nextInt();
            int count=0;
            while(g!=0){
                count +=1;
                g=g/10;
            }
            System.out.println("number of digits: "+count);
          break;
          case 4:
            System.out.println("enter a number: ");
            int i = sc.nextInt();
            int sum=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            System.out.println((sum==i)?"the number is perfect number":"the number is not perfect number");        
            break;
            case 5:
            System.out.println("perfect numbers between 1 to 10000: ");
            for (int k=1;k<=10000;k++){
                int sum1=0;
                for (int l=1;l<k;l++){
                    if(k%l==0){
                        sum1+=l;
                    }
                }
                if(sum1==k){
                    System.out.print(k+" ");
                }
            }
                break;
          default:
          System.out.println("invalid number");
         }}}}
