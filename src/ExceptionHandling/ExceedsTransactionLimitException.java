 package ExceptionHandling;
public class ExceedsTransactionLimitException extends Exception
{
	ExceedsTransactionLimitException(String s)
	{
		super(s);
	}
}