public class Product 
{
	private String name;
	private double price;
	private int productID;
	
	
	public Product(String name_, Double price_, int productID_)
	{
		this.name = name_;
		this.price = price_;
		this.productID = productID_;	
	}

	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getProductID()
	{
		return productID;
	}
}