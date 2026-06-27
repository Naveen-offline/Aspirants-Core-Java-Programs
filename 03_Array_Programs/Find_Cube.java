import java.util.Scanner;
public class Find_Cube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Size : ");
        int a = sc.nextInt();
        int arr[]=new int[a];
        for(int i =0 ; i<a;i++){
            System.out.println("Enter the element : ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Cube of array element :");
        for(int i=0;i<a;i++){
            System.out.println("Cube of "+arr[i]+"is :"+Math.pow(arr[i],3));
        }
    }
}
