import javax.imageio.IIOException;
import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("By  While loop");
        System.out.println("Enter your words:");
        String word=(br.readLine()).toLowerCase();
        //By while loop
        while (!word.equals("done")){
            System.out.println("Enter your words:");
            word=(br.readLine()).toLowerCase();
            if(word.charAt(0)==word.charAt(word.length()-1))
                System.out.println("first and last char are same");
        }


        //by do while loop
        System.out.println("By do While loop");
        do{
            System.out.println("Enter your words:");
            word=(br.readLine()).toLowerCase();
            if(word.charAt(0)==word.charAt(word.length()-1))
                System.out.println("first and last char are same");
        }while(!word.equals("done"));
    }
}