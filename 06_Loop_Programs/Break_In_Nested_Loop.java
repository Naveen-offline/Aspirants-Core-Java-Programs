public class Break_In_Nested_Loop {
    
    public static void main(String[] args) {
        boolean a= true;
        for(int i =1;i<10;i++){
            for(int j=1;j<5;j++){
			if(i%2==0&&j%2==0){
                a=false;
				break;
               }
               System.out.println("inner");
            } 
            if(a==false){
                System.out.println("outer");
                break;
            }  
            System.out.println("outer loop");
        }
    }
}

