public class DebugBox
{
   private int width;
   private int length;
   private int height;

   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData()
   {
      System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
   }
   public double getVolume()
   {
   double vol = length * width * height;
   return vol;
   }
}

/*
Bugs Found:
1. Wrong variable assigned to "this.length" so I changed "width" to "length".
2. Same with first bug, mismatched variable for "this. height" so I changed "width" to "height".
*/

