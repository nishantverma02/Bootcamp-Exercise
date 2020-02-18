public class Q3
{
    public static void main(String[] args) {
        String str = "Java is java again java again";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+str+" = "+count);
    }
}
