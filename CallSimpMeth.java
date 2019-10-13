public class CallSimpMeth
{
   public static void main(String[] args)
   {
       double doubleValue = 45.67;
       int intValue = 17;
       simpMeth(doubleValue);
       simpMeth(intValue);
   }
   public static void simpMeth(double d)
   {
       System.out.println("Method receives double parameter");
   }
}
