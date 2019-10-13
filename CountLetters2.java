package javaapplication5;
/**
 *
 * @author Efrem McCrimon
 * Lesson 7, Exercise 3b
 *
 * This program counts the number of letters from a user entry string.
 *
 * We loop through the string character at a time and check for a letter
 * If a letter, it is counted.
 * The result is display.
 *
 * Variables:
 *    x, Type: Int, use as an index into the string
 *    vcounter, Type: Int, is the for the letters
 *    aChar, Type: Char, is the current character within the string
 *    aString, Type: String, is the source string
 *
 */
import javax.swing.JOptionPane;



public class CountLetters2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x, vcounter;
        char aChar;
        String aString;

        aString = JOptionPane.showInputDialog(null,
                 "Enter a string ","Letter counter",
                JOptionPane.INFORMATION_MESSAGE);

        vcounter = 0;
        for (x = 0; x < aString.length(); x++) {
            // code
            aChar = aString.charAt(x);
            if (Character.isLetter(aChar)) {

                      vcounter++;
            }

        }

        JOptionPane.showMessageDialog(null, "\n\nOur string is:\n" + aString + "\n\nTotal letter count is " + vcounter);
    }
}


