
public class Parrol 
{

	public static void main(String[] args) 
	{
		Employee e=new VP(20.00f);
		e.showdetail();
		e.calculateSalery(5000);
		e=new CEO(50);
		e.showdetail();
		e.calculateSalery(6000);

	}

}
