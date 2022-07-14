package Exception;

public class User_excep extends Throwable {
   String str;
   User_excep (String str1)
   {
	   this.str=str1;
   }
   public String toString()
	{
		return ("The given Number "+str);
		
	}
}
