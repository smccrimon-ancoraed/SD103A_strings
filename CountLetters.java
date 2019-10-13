package javaapplication5;
/**
 *
 * @author Efrem McCrimon
 * Lesson 7, Exercise 3a
 *
 * This program counts the number of letters from a fixed string.
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
 *
 */
import javax.swing.JOptionPane;




public class CountLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x, vcounter;
        char aChar;
        String aString = new String ("Event Handlers Incorporated, 8900 U.S. Highway 14, Crystal Lake, IL 60014");

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


