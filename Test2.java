class Test2
{
	int id;
	String name;
	static String company=" XYZ priavte limited";

	public void info(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(" id " + id + " name " + name + " company " + company);
	}

	public static void main(String[] args)
	{
	Test2 emp1=new Test2();
	Test2 emp2=new Test2();
	emp1.info(1, "pooja");
	//System.out.println(" id " + emp1.id + " name " + emp1.name + " company " + emp1.company);

	emp2.info(2, "sachin");
	//System.out.println(" id " + emp2.id + " name " + emp2.name + " company "  + emp2.company);
	}
}