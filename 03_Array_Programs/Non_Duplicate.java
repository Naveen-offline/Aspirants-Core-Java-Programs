import java.util.Scanner;
public class Non_Duplicate {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int a= sc.nextInt();

        int arr[]=new int [a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the elemen  "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        boolean[] visited = new boolean[a];
        String dup = "";
        System.out.println("Non-duplicates:");
        for(int i = 0; i < a; i++){
            if(!visited[i]){
                boolean isDup = false;
                for(int j = i+1; j < a; j++){
                    if(arr[i] == arr[j]){
                        isDup = true;
                        visited[j] = true;
                    }
                }
                if(isDup){
                    dup += arr[i] + " ";
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println("\nDuplicates: " + dup);
}

    
}
