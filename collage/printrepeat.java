public class printrepeat {
    public static void main(String[] args) { 
        String str = "hellooooo";
        String seen="";
        for (int i=0; i<str.length();i++){
            char c=str.charAt(i);
            if(seen.indexOf(c)!=-1){
                System.out.println(c);
                break;
            }
            seen+=c;

        }      
        }
        
    }
    

