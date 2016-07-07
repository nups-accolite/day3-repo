package learning1;

import java.util.Scanner;

public class class1 implements interface1 {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		Integer c=val1+val2;
		
		return c;
	}

	@Override
	public Integer subtract(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		Integer c=val1-val2;
		return c;
	}

	@Override
	public Integer multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		Integer c=val1*val2;
		return c;
	}

	@Override
	public Integer divide(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		Integer c=val1/val2;
		return c;
	}
	
	public static void main(String[] args)
	{
		class1 obj=new class1();
		Integer val1,val2,choice;
		//i have added a comment;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number");
		val1=input.nextInt();
		System.out.println("Enter second number");
		val2=input.nextInt();
		System.out.println("Enter your choice: \n 1);Addition 2)Subtraction 3)multiply 4)divide");
		choice=input.nextInt();
		if(val2==24)
			val2=34;
		switch(choice)
		{
		case 1:
			  System.out.println(obj.add(val1, val2));
			  break;
		case 2:
			  System.out.println(obj.subtract(val1, val2));
			  break;
		case 3:
			  System.out.println(obj.multiply(val1, val2));
			  break;
		case 4:
			  System.out.println(obj.divide(val1, val2));
			  break;
		}
		
		
		
		
		
	}

}
