class constructor
{
	int roll;
	constructor(int r)
	{
		roll=r;
	}
	constructor()
	{
	
	}
	public static void main(String args[])
	{
		constructor ob=new constructor(12);
		//constructor ob1=new constructor();error as deafult constructor wont be created now
		constructor ob1=new constructor();
		System.out.print(ob.roll);
	}
}