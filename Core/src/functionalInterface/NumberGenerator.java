package functionalInterface;

import java.util.Random;

public class NumberGenerator {
	public static void generateRandomNumber(int min,int max)
	{
		Random r=new Random();
		System.out.println(r.nextInt(min, max));
	}
	public static void main(String[] args) {
		generateRandomNumber(10, 20);
	}
}
