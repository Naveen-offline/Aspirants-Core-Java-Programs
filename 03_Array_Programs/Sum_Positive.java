public class Sum_Positive {
    public static void main(String[] args) {
        int a[]={-1,2,3,-4,5};
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                sum = sum+a[i];
            }
        }
        System.out.println("Sum of positive num: "+sum);
    }
}
