package javabrushup;

public class methoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methoddemo d=new methoddemo();
		String name=d.getData();
		System.out.println(name);
		Methodsdemo2 d1=new Methodsdemo2();
		d1.getUserData();

	}
	public String getData()
	{
		System.out.println("hello world");
		return "Sipun parhi";
	}

}
