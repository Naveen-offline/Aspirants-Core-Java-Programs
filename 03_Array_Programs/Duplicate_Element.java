import java.util.Scanner;
public class Duplicate_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int a = sc.nextInt();
        int arr[]=new int [a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the elemen  "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        if(a>=2){
            System.out.println("Duplicate element :");
            for(int i = 0;i<a;i++){
                boolean dub=false;
                for(int j =i+1; j<a;j++){
                    if(arr[i]==arr[j]){
                        dub=true;
                        break;
                    }
                }
                if(dub){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}