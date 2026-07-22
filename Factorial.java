import java.util.Scanner;
class Factorial{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=num){
			fact=fact*i;
			i=i+1;
		}
		System.out.println("The factorial of "+num+" is "+fact);
	}
}