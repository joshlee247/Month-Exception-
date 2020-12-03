import java.util.Scanner;
import java.lang.Exception;

class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    try {
      System.out.println("Input month number or name:");
      String monthName = get.nextLine();

      Month m;
      boolean numeric = true;

      int num = -1;
      
      try {
          num = Integer.parseInt(monthName);
      } catch (NumberFormatException e) {
          numeric = false;
      }

      if(numeric == true)
      {
        m = new Month(num);
      }
      else
      {
        m = new Month(monthName);
      }

      m.displayMonthValue();
    }
    catch (Exception e1) 
    {
      System.out.println(e1.getMessage());
    }
    /*catch (Exception e2)
    {
      System.out.println(e2.getMessage());
    }*/
  }
}