//Take 10 integers from keyboard using loop and print their average value on the screen.
package lab;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int i,sum = 0;
	   double avg;
	   Scanner sc =new Scanner(System.in);
       int [] arr =new int[10];
       System.out.println("enter ten numbers: ");
       for(i=0;i<10;i++) {
    	   arr[i]=sc.nextInt();
       }
       for(i=0;i<10;i++) {
    	   sum=sum+arr[i];	   
       }
       avg=sum/10;
       System.out.println("average :"+avg);
	}

}
