class Box7
{
	double height, width, length;
}

class Test3
{
	public static void main(String[] args)
	{
		Box7 b1= new Box7();
		Box7 b2=b1;
		System.out.println(b1.height);
		System.out.println(b1.width);
		System.out.println(b1.length);
		System.out.println(b1);
		System.out.println(b2);

	}
}


