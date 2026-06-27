
import java.util.Scanner;
public class Student_Marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]= new int[10];
        int max=0,min=100,avg=0;
        for(int i=0;i<10;i++){
            System.out.println("Enter the Student : "+(i+1));
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            avg=avg+arr[i];
        }
        System.out.println("Minimum Mark"+min);
        System.out.println("Maximum Marks"+max);
        System.out.println("Avg :"+(avg/10));
    }
    
}
