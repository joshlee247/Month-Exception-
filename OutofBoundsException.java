//creates an Exception class
public class OutofBoundsException extends Exception
{
  public OutofBoundsException(String s)
  {
      //inherits from parent class Exception
      super(s);
  }
}