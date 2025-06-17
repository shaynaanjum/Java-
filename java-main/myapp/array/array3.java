package array;

public class array3 {
    public static void main(String[] args) {
        float [] arr={ 1.4f,4.6f,4.7f,5.8f,2.5f};
        
        float sum=0;
        for(int f=0;f<arr.length;f++)
        {
         sum=sum+arr[f];
        
        }
        System.out.println(sum/arr.length);
    }
}
