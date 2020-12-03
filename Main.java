/*
program name: Exception.java
programmer: Josh Lee
date: 12/2/20
version: 1.4.0
Creates a class Month that allows for both String and Int user inputs with Exceptions thrown when needed.
*/
import java.util.Scanner;
import java.lang.Exception;

class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    try {
      System.out.println("Input month number or name:");
      //user input 
      String monthName = get.nextLine();

      //declares object m of class Month
      Month m;
      boolean numeric = true;

      //initializes num
      int num = -1;
      
      try {
          //converts monthName to Int
          num = Integer.parseInt(monthName);
      } 
      catch (NumberFormatException e) 
      {
        //sets numeric to false if monthName is not an available int
        numeric = false;
      }

      //if monthName is an int
      if(numeric == true)
      {
        m = new Month(num);
      }
      //if monthName is a String
      else
      {
        m = new Month(monthName);
      }

      //displays the numerical value of the month given
      m.displayMonthValue();
    }
    catch (Exception e1) 
    {
      System.out.println(e1.getMessage());
    }
  }
}