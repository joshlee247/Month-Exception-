public class Month {
  int monthNumber;
  final String MONTH[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

  Exception e1 = new Exception("Invalid Month Value - must be between 1 - 12"); 
  Exception e2 = new Exception("Invalid Month Name - Check Spelling");

  public Month()
  {
    monthNumber = 1; 
  }
  public Month(int monthInt) throws Exception
  {
    if (monthInt > 12 || monthInt < 1)
      throw e1;
    else
      monthNumber = monthInt; 
  }
  public Month(String monthString) throws Exception
  {
    for(int i=0; i < MONTH.length; i++) 
    {
      if (monthString.equals(MONTH[i]))
      {
        monthNumber = i + 1;
      }
      else if (monthNumber == 0)
      {
        throw e2;
      }
    }
  }
  public void setMonthNumber (int m)
  {
    if (m > 12 || m < 1)
      monthNumber = 1;
    else
      monthNumber = m; 
  }
  public void displayMonthValue()
  {
    System.out.println(monthNumber);
  }
}