public class Secondlarger {
    public static void main(String[] args) {
        int a[]= {3,8,6,2,9,7};
        int b = Integer.MIN_VALUE,c = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(b<a[i]){
                c=b;
                b=a[i];
            }
            else if(c<a[i]){
                c=a[i];
            }
        }
        System.out.println(c==Integer.MIN_VALUE?"No Second larger element":"Second Larger element :"+c);
    }
}
  