package projectUpload;

import java.util.Scanner;

public class nearestTens {
	
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to find out the nearest divisible 10 : ");
		int numb=sc.nextInt();
		int res=1;
		for(int i=1;i<=numb;i++) {
			if(i%10==0) {
				res=i;
			}
			
		}
		System.out.println(res);
		
	}
}