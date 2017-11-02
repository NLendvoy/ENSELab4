public class PersonalCustomer extends Customer 
{
	private int creditCardNumber;
	
	public PersonalCustomer(String name_, String address_, float cred, float discount)
	{
		super(name_,address_,cred,discount);
	}
}