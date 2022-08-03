package javabrushup;

public class corejavabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object 
//		String s="Rahul shetty Academy";
//		String s1="Rahul Shetty Academy";
//		
//		//new
		String s2=new String("Welcome");
		String s3=new String("Welcome");
		String s5="Rahul Shetty Academy";
		String[]  splittedString=s5.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[2]);		
		System.out.println(splittedString[1].trim());
		
		
		System.out.println("Print the record with single character");
		for(int i=0;i<s5.length();i++)
		{
			System.out.println(s5.charAt(i));
		}
		

		System.out.println("Print the record with single character with reverse order:");
		for(int i=s5.length()-1;i<s5.length();i--)
		{
			System.out.println(s5.charAt(i));
		}
		
		
	}

}
