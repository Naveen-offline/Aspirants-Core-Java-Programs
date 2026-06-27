import java.util.Scanner;
public class Count_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int count2=0,count3=0,count5=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count2++;
            }
            else if(a[i]%3==0){
                count3++;
            }
            else if(a[i]%5==0){
                count5++;
            }
        }
        System.out.println("Count of even num: "+count2);
        System.out.println("Count of num divisible by 3: "+count3);
        System.out.println("Count of num divisible by 5: "+count5);
        
    }
}
