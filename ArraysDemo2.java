import java.util.*;
import javax.swing.*;
public class ArraysDemo2
{
   public static void main(String[] args)
   {
      char[] grades = {'A', 'B', 'C', 'D', 'F'};
      String entry;
      char myGrade;
      int position;
      entry = JOptionPane.showInputDialog(null,
         "Enter student grade");        
      myGrade = entry.charAt(0);
      position = Arrays.binarySearch(grades, myGrade);
      if(position >= 0)
         JOptionPane.showMessageDialog(null, "Position of " +
            myGrade + " is " + position);
      else
         JOptionPane.showMessageDialog(null, "Invalid grade");
   }
}
