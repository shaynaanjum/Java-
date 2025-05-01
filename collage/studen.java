class student{

 String s="shayna";
   int a=20;

    student() {
        System.out.println("hello");
    }
    student(String s){
        this();
        System.out.println(s);
    }
    student(String s, int a){
        this(s);
      this.s=s;
    this.a=a;
    System.out.println(s+" "+a);
   }
}
class studen{
   public static void main(String[] args) {
       student obj=new student("svhg",23);
       System.out.println(obj.s);
        System.out.println(obj.a);
    }
}
 
   