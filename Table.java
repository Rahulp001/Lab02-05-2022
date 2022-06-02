//Print multiplication table of 24, 50 and 29 using loop and Function.
package lab;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,num2,i,res;
		num=24;
		num1=50;
		num2=29;
		for(i=1;i<=10;i++) {
			res=num*i;
		    System.out.println(num+"*"+i+"="+res);
		
		}
		System.out.println();
		for(i=1;i<=10;i++) {
			res=num1*i;
		    System.out.println(num1+"*"+i+"="+res);
		
		}
		System.out.println();
		for(i=1;i<=10;i++) {
			res=num2*i;
		    System.out.println(num2+"*"+i+"="+res);
		
		}
	}

}
