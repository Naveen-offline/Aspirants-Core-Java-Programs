import java.util.Scanner;
public class Store_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the price of array element :");
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
            sum = sum+a[i];
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("Total price of array element : "+sum);
        System.out.println("Maximum price of array element : "+max);    
        System.out.println("Minimum price of array element : "+min);
    }
}
