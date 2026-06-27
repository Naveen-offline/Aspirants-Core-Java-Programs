import java.util.Scanner;
public class Second_Maximum_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int a = sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter the Element "+(i+1));
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE, sec_Max = Integer.MIN_VALUE;
        System.out.println("Array elements are :");
        for(int i = 0; i < a; i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i] > max)
            {
                sec_Max = max;
                max = arr[i];
            } 
            if(arr[i] > sec_Max && arr[i] != max)
            {
                sec_Max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Maximum element is : "+max);
        System.out.println((sec_Max!=Integer.MIN_VALUE)?"Second Maximum element is : "+sec_Max:"Second Maximum element does not exist.");

        
    }
}
