package random;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the size : ");
		int x = new Scanner(System.in).nextInt();

		int[] feb = new int[x];
		feb[0] = 0;
		feb[1] = 1;

		for(int i = 2; i<x;i++)
		{
			feb[i] = feb[i-1]+feb[i-2];
		}
		
		
		for(int i:feb)
		{
			System.out.println(" "+i+" ");
		}
	
	}

}
