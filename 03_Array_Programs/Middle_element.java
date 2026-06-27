public class Middle_element {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        if(a.length%2==0){
            System.out.println(a[(a.length/2)-1]+" "+a[(a.length/2)]);
        }
        else{
            System.out.println(a[(a.length/2)]);
        }
    }
}
