
//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
enum HOME{
    SMALLHOME("1bhk","200000"),
    MEDIUMHOME("2bhk", "40000"),
    LARGEHOME("3bhk", "3000000");


    private String type;
    private String price;

    HOME(String type, String price) {
        this.type = type;
        this.price = price;

    }



    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

}
public class Q9 {

    public static void main(String[] args) {
        String home1price=HOME.SMALLHOME.getPrice();
        String home1type=HOME.SMALLHOME.getType();

        System.out.println("Price of smallHouse="+home1price+"   type of smallhouse="+home1type);

        String home2price=HOME.MEDIUMHOME.getPrice();
        String home2type=HOME.MEDIUMHOME.getType();
        System.out.println("Price of smallHouse="+home2price+"   type of smallhouse="+home2type);

        String home3price=HOME.LARGEHOME.getPrice();
        String home3type=HOME.LARGEHOME.getType();
        System.out.println("Price of smallHouse="+home3price+"    type of smallhouse="+home3type);



    }
}