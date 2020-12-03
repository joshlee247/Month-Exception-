//creates an Exception class
public class InvalidMonthException extends Exception
{
  public InvalidMonthException(String s)
  {
      //inherits from parent class Exception
      super(s);
  }
}