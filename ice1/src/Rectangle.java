/**
   Rectangle class, phase 1
   Under construction!
*/

public class Rectangle
{
   private double length;
   private double width;

   /**
      The setLength method stores a value in the
      length field.
      @param len The value to store in length.
   */

   public void setLength(double len) {
      length = len;
   }

   public void setWidth(double wid) {
      width = wid;
   }

   public double getLength() {
      return length;
   }

   public double getWidth() {
      return width;
   }

   public double getArea() {
      return length * width;
   }
}