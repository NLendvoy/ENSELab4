public class OrderLine
{
	private int quantity;
	private Double price;
	private Product product;

	public OrderLine(Product product_, int quantity_, Double price_)
	{
		System.out.println("call OrderLine"); //test line
		this.quantity = quantity_;
		this.price = price_;
		this.product = product_;
	}

	public Product getProduct()
	{
		System.out.println("call OrderLine"); //test line
		return this.product;
	}

	public int getQuantity()
	{
		System.out.println("call OrderLine"); //test line
		return this.quantity;
	}

	public Double getPrice()
	{
		System.out.println("call OrderLine"); //test line
		return this.price;
	}
	
	public void setQuantity(int q)
	{
		this.quantity = q;
	}
}