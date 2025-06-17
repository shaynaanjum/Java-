package patterns;
    public class patterns6 {
        public static void main(String[] args) {
            for(int i=1; i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print( " ");
                }
                for(int k=5;k>=i;k--){
                    System.out.print("*");
                }
                for(int p=5;p>i;p--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    

