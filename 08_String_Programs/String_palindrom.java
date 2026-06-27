public class String_palindrom {
    public static void main(String[] args) {
        String s1[] = {"a","b","a"};
        int i=0,j=s1.length-1,count=0;
        while (i<=j) {
            if(s1[i]!=s1[j]){
                break;
            }
            else{
                count++;
            }
            i++;
            j--;
        }
        int a =(s1.length/2==(count))?s1.length/2:(s1.length/2)+1;
        System.out.println(a);
        System.out.println((count==(a))?"Palindrom":"Not Palindrom");
    }
}