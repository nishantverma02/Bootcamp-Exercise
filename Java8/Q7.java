// Override the default method of the interface.

interface DefaultDemo{
    default void display() {
        System.out.println("Hi, I'm display's body from  interface");
    }
}
public class Q7 {
    public void display(){
        System.out.println("Hey, it's me display from Class");
    }
    public static void main(String[] args) {
        Q7 defaultOverrideDemo = new Q7();
        defaultOverrideDemo.display();



    }
}