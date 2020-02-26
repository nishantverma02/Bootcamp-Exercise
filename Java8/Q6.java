//Create and access default and static method of an interface.

interface myInterface{
    default void displayDefault(){
        System.out.println("hey its Default's Display!!");
    }

    static void displayStatic(){
        System.out.println("hey its Static's Display!!");
    }
}

public class Q6 implements myInterface {
    public static void main(String[] args) {
        myInterface.displayStatic();
        Q6 interfaceReference = new Q6();
        interfaceReference.displayDefault();
    }
}