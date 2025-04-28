public class duplicate {
    public static void main(String[] args) {
        String str="helllo";
        String newStr="";
        for (int i=0;i<str.length();i++) {
            char c= str.charAt(i);

            if(newStr.indexOf(c)==-1)
            newStr+=c;
            
        }
    }
    
}
