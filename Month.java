public class Month {
  int monthNumber;
  //creates a constant array of month names
  final String MONTH[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

  //creates 2 exceptions: 1 for Int, 1 for String
  OutofBoundsException e1 = new OutofBoundsException("Invalid Month Value - must be between 1 - 12"); 
  InvalidMonthException e2 = new InvalidMonthException("Invalid Month Name - Check Spelling / Case");

  //default constructor
  public Month()
  {
    monthNumber = 1; 
  }

  //parameterized constructor to accept Ints
  public Month(int monthInt) throws Exception
  {
    if (monthInt > 12 || monthInt < 1)
      throw e1;
    else
      monthNumber = monthInt; 
  }

  //parameterized constructor to accept Strings
  public Month(String monthString) throws Exception
  {
    for(int i=0; i < MONTH.length; i++) 
    {
      //if user input is in the array change month number to respective number
      if (monthString.equals(MONTH[i]))
      {
        monthNumber = i + 1;
      }
    }
    //throws exception when user input cannot be found in array
    if (monthNumber == 0)
    {
      throw e2;
    }
  }

  //setter function
  public void setMonthNumber (int m)
  {
    if (m > 12 || m < 1)
      monthNumber = 1;
    else
      monthNumber = m; 
  }

  //display function
  public void displayMonthValue()
  {
    System.out.println("Month Numberical Value: \n" + monthNumber);
  }
}//end class Month