import java.util.Scanner; 
public class Find_SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Square root of array element :");
        for(int i=0;i<n;i++){
            System.out.println("SQRT of "+a[i]+"is :"+Math.sqrt(a[i]));
        }
    }
}
