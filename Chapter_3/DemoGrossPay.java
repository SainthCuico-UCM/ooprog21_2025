class DemoGrossPay
{
   public static void main(String[] a)
   {
      double hours = 25;
      double hoursWorked = 37.5;
      calculateGross(10);
      calculateGross(hours);
      calculateGross(hoursWorked);
   }
   public static void calculateGross(double hours)
   {
      final double standardHourlyRate = 22.75;
      double gross = hours * standardHourlyRate;
      System.out.println(hours + " hours at $" + standardHourlyRate + " per hour is $" + gross);
   }
}
      