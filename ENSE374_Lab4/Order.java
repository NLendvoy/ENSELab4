import java.util.*;

public class Order 
{

	private Date dateReceived;
	private Double price;
	private int orderID;
	private Customer customer;

	public ArrayList<OrderLine> order_line = new ArrayList<OrderLine>();

	public Order(Customer customer_) 
	{
		System.out.println("call Order"); //test line
		price = 0.0;
		this.orderID = 1; 
		dateReceived = new Date();
		this.customer = customer_;
	}

	public Date getDateReceived()
	{
		System.out.println("call Order"); //test line
		return dateReceived;

	}

	public Double calculatePrice()
	{
		Iterator<OrderLine> iterator = order_line.iterator();
		System.out.println("call Order"); //test line

		while (iterator.hasNext()) {
			OrderLine currentOrder = iterator.next();
			Product product = currentOrder.getProduct();
			double productPrice = product.getPrice();
			double productQuantity = currentOrder.getQuantity();
			double basePrice = productPrice * productQuantity;
			basePrice = basePrice - (basePrice * customer.getDiscountRating());

			this.price += basePrice;
		}
		return price;
	}

	public void addOrderItem(Product product, int quantity)
	{
		OrderLine newOrder = new OrderLine(product, 1, product.getPrice());
		order_line.add(newOrder);
	}
}