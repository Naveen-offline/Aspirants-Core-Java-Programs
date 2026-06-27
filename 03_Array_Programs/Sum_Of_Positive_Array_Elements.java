public class Sum_Of_Positive_Array_Elements {
    public static void main(String[] args) {
        int a[]={5,-4,3,4,-1,8,3};
        int s =0;
        for (int i=0;i<7;i++){
            if(a[i]<0)
            {
                continue;
            }
            System.out.println(a[i]);
            s = s+a[i];
        }
    System.out.println(s);
    }
}
