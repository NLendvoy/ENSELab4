public class Customer 
{
	private String name;
	private String address;
	private float creditRating;
	private float discountRating;
	
	public Customer(String name_, String address_, float creditRating_, float discountRating_)
	{
		System.out.println("call customer"); //test line
		this.name = name_;
		this.address = address_;
		this.creditRating = creditRating_;
		this.discountRating = discountRating_;
	}

	public float getCreditRating()
	{
		System.out.println("call customer"); //test line
		return creditRating;
	}

	public String getName()
	{
		System.out.println("call customer"); //test line
		return this.name;
	}

	public String getAddress()
	{
		System.out.println("call customer"); //test line
		return this.address;
	}
	
	public float getDiscountRating()
	{

		System.out.println("call customer"); //test line
		return discountRating;
	}
}