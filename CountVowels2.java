package javaapplication5;
/**
 *
 * @author Efrem McCrimon
 * Lesson 7, Exercise 2b
 *
 * This program counts the number of vowels from a user entry string.
 *
 * The vowels are:
 *   a, e, i, o, u, y
 *
 * We loop through the string character at a time and check for a letter
 * If a letter, it is counted.
 * The result is display.
 *
 * Variables:
 *    x, Type: Int, use as an index into the string
 *    vcounter, Type: Int, is the for the vowels
 *    aChar, Type: Char, is the current character within the string
 *    aString, Type: String, is the source string
 *
 */
import javax.swing.JOptionPane;



/**
 *
 * @author efremmc
 */
public class CountVowels2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, vcounter;
        char aChar;
        String aString;

        aString = JOptionPane.showInputDialog(null,
                "Enter a string ","Vowel counter", 
                JOptionPane.INFORMATION_MESSAGE);

        vcounter = 0;
        for (x = 0; x < aString.length(); x++) {
            // code
            aChar = aString.charAt(x);
            if (Character.isLetter(aChar)) {
                switch (aChar) {

                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                      vcounter++;
                      break;


                }  //switch
            }

        }

        JOptionPane.showMessageDialog(null, "\n\nOur string is:\n" + aString + "\n\nTotal vowel count is " + vcounter);
    }
}


