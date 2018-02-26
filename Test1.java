class B
{
	void B() {
			System.out.println(" B class ");
			this.show();
	}

	void show() {
		this=null; // why we can't assign any value in this 
	}

	public static void main(String[] args)
	{
		B obj=new B() ;
	}
}
