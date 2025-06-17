package array;

public class array2 {
    public static void main(String[] args) {
        int [] arr={ 12,34,56,78,98,56};
        int target=89;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){
                System.out.println("present");
                break;
            }
            
        }
   System.out.println("no element is present");

    }
}
