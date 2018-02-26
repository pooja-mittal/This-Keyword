class Box4
{
	double height, width, length;

	void setDim(double height, double width, double length) {
		this.height=height;
		this.width=width;
		this.length=length;
	}

	double volume()
	{
		System.out.println("volume " + ((this.height)*(this.length)*(this.width)));
		return ((this.height)*(this.length)*(this.width));
	}
}

class Test4
{
	public static void main(String[] args)
	{
		Box4 b=new Box4();
		b.setDim(3,4,5);
		b.volume();
	}
}

