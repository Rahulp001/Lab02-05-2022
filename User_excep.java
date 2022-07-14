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
--------------------------------------------------
	package Exception;

public class User_excep1 extends Throwable {

	String str;
	   User_excep1 (String arr1)
	   {
		   this.str=arr1;
	   }
	   public String toString()
		{
			return ("Exception is  "+str);
			
		}

}
---------------------------------------------------------------
	package Exception;

import java.util.Scanner;

public class Exception_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_prog obj = new Exception_prog();
		obj.meth();
	}
	public void meth() {
		try {
			int number, temp, total = 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the number");
			number=sc.nextInt();
			int num= number;
			while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }
			
			if(num==total)
			{
				throw new User_excep(" is armstrong number");
			}
			else
			{
				throw new User_excep(" is not armstrong number");
			}
		}
		catch(User_excep ex)
		{
			System.out.println("MY Exception :)");
			System.out.println(ex);
		}
		try {
			int arr1[] = new int [5];
			System.out.println("Enter array value ");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++) {
				arr1[i]=sc.nextInt();
			}
			 for(int i=0;i<5;i++) {
			System.out.println(arr1[i]);
			 }
			 throw new User_excep1("its array value");
		}
		catch(User_excep1 obj) {
			System.out.println(obj);
		}
	}

}
