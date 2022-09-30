
public  class Employee
{
 private int employeeId;
 private String employeeName;
 private String joiningDate;
 
 public Employee(int eId,String eName,String j)
 {
	 employeeId=eId;
	 employeeName=eName;
	 joiningDate=j;
 }
 public final void  showdetail()
 {
	 System.out.println("Employee Id is:"+employeeId);
	 System.out.println("Employee name is:"+employeeName);
	 System.out.println("Employee joining dateis:"+joiningDate);
 }
 protected void joininigProcess(String aadharCard,String panCard)
 {
	 System.out.println("Submit the document"+aadharCard+""+panCard);
 }
 
 protected void calculateSalery(int salery)
 {
	 System.out.println("Your salery amount is"+salery);
 }
}

class VP extends Employee
{
	private float bonus;
	
	public VP(float bonus)
	{
		super(12,"priya","10.2.20");
		this.bonus=bonus;
	}
	
	public void calculateSalery(int salery)
	{
		
	 bonus=(salery*10)/100;	
		System.out.println("Your salert is:"+(salery+bonus));
	}
}
class CEO extends Employee
{
	private int incentive;
	
	public CEO(int incentive)
	{
		super(45,"shubhra","2.8.2019");
		this.incentive=incentive;
	}
	public void calculateSalery(int salery)
	{
		incentive=5000;
		salery=salery+incentive;
		
		System.out.println("The salery is:"+salery);
	}
}
