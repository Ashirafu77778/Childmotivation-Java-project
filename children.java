package young;

import java.util.Scanner;

public class children {
	public static void main(String args[]) {
		int input1,input2,div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input 1:");
		input1=sc.nextInt();
		System.out.println("Enter the input 2:");
		input2=sc.nextInt();
		div=input1/input2;
		System.out.println("The out put is:\n"+div);
	}

}
