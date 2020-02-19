interface Furniture{
    void stresstest();
    void firetest();
}
class Woodenchair implements Furniture{
    @Override
    public void firetest() {
        System.out.println("fire test failed");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test passed");
    }
}
class Woodentable implements Furniture{
    @Override
    public void stresstest() {
        System.out.println("stress test passed");
    }

    @Override
    public void firetest() {
        System.out.println("fire test failed");
    }
}
class MetalChair implements Furniture {
    @Override
    public void firetest() {
        System.out.println("fire test passed");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test failed");
    }
}
class MetalTable implements Furniture{

    @Override
    public void stresstest() {
        System.out.println("stress test failed");
    }

    @Override
    public void firetest() {
        System.out.println("fire test passed");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Woodenchair wc=new Woodenchair();
        System.out.println("For Wooden Chair:");
        wc.firetest();
        wc.stresstest();
        System.out.println("\n");

        Woodentable wt=new Woodentable();
        System.out.println("For wooden Table:");
        wt.firetest();

        wt.stresstest();
        System.out.println("\n");


        MetalChair mc=new MetalChair();
        System.out.println("For Metal Chair:");
        mc.firetest();
        mc.stresstest();
        System.out.println("\n");

        MetalTable mt=new MetalTable();
        System.out.println("For Metal Table: ");

        mt.firetest();
        mt.stresstest();
        System.out.println("\n");
    }
}