public class Skip_Multiples_Of_3_And_5 {
    public static void main(String[] args) {
        for(int i = 1;i<=20;i++){
            if (i%3==0||i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
