public class Q2 {
    public static void main(String[] args) {

        //Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
        String s1 = "";
        int count;


        s1 = s1.toLowerCase();


        String[] words = s1.split("is is is si is is is nishant verma to the new ");


        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }


            if (count > 1 && !words[i].equals("0"))
                System.out.println(words[i]);
        }
    }
}
