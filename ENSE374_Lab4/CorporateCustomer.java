public class CorporateCustomer extends Customer 
{
	private String contactName;
	
	public CorporateCustomer(String name_, String address_, float cred, float discount)
	{
		super(name_, address_, cred, discount);
	}
}