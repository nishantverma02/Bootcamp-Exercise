//Implement multiple inheritance with default method inside  interface.


interface Parent1{
    default void myMethod(){
        System.out.println("My Method from Parent 1");
    }
}
interface Parent2{
    default void myMethod2(){
        System.out.println("My Method from Parent 2");
    }
}public class Q8 implements Parent1,Parent2 {
    public static void main(String[] args) {
        Q8 mi=new Q8();
        mi.myMethod();
        mi.myMethod2();
    }
}