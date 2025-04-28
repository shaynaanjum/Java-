public class printrepeatwitharray {
    public static void main(String[] args) {
        String str="helloo";
        char[] ch=str.toCharArray();
        //{'h','e','l','l','o'}
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[i]);
                    return;
                }
            }
        }
    }
    
}
