// print first 100 three and four digit prime number having digit sum is even
// print first 100 prime number

//package com.bridgelabz.loop;
import java.util.Scanner;

public class prime
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The count:-");

		int count = scanner.nextInt();
		int number = 100;
		while (count >= 0) 
		{
			int flag = 0;
			for (int i = 2; i < number; i++) 
			{
				if (number % i == 0) 
				{
					flag = 1;
					break;
				}
			}

			int temp = number;
			if (flag == 0)
			{
				int sum = 0;
				while (temp > 0) 
				{
					sum += (temp % 10);
					temp /= 10;
				}
				if (sum % 2 == 0) 
				{
					System.out.println(number);
					count--;
				}
			}
			number++;
		}
		System.out.println("Number Of Iteration:-" + number);
	}

	private static boolean checkPrimeNumber(int number) 
	{
		for (int i = 2; i < number; i++) 
		{
			if (number % i == 0)
			return false;
		}
		return true;
	}
}