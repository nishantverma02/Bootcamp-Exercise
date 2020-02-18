public class Q4 {
    //Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
    public static void main(String[] args) {


        String s1 = " My Email ID is nishantleo98@gmail.com   ";
        int n = s1.length();

        //Initializing upperCaseLetters, lowerCaseLetters, digits and others with 0

        int upperCaseLetters = 0;

        int lowerCaseLetters = 0;

        int digits = 0;

        int others = 0;

        //Iterating through each character of inputString

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);


            if (Character.isUpperCase(ch)) {
                upperCaseLetters++;
            }

            //If ch is in lowercase, then incrementing lowerCaseLetters

            else if (Character.isLowerCase(ch)) {
                lowerCaseLetters++;
            }

            //If ch is a digit, then incrementing digits

            else if (Character.isDigit(ch)) {
                digits++;
            }

            //If ch is a special character then incrementing others

            else {
                others++;
            }
        }

        //Calculating percentage of uppercase letters, lowercase letters, digits and other characters

        float upperCaseLetterPercentage = (float) ((upperCaseLetters * 100.0) / n);

        float lowerCaseLetterPercentage = (float) ((lowerCaseLetters * 100.0) / n);

        float digitsPercentage = (float) ((digits * 100.0) / n);

        float otherCharPercentage = (float) ((others * 100.0) / n);


        //Printing percentage of uppercase letters, lowercase letters, digits and other characters

        System.out.println("Total characters are" + n);

        System.out.println("Uppercase letters are " + (upperCaseLetterPercentage) + "% " + "or "+ upperCaseLetters);

        System.out.println("Lowercase letters are " + (lowerCaseLetterPercentage) + "% " + "or " + lowerCaseLetters);

        System.out.println("Digits Are " + (digitsPercentage) + "% or "+ digits);

        System.out.println("Other Characters Are " + (otherCharPercentage) + "% or " + others);
    }



}
