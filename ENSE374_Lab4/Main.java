public class Main 
{
	public static void main(String[] args) 
	{
		
		Customer customer = new Customer("Nikolas Lendvoy", "3141 Circle drive", 0.0f, 0.0f);
		double price = 0.0;

		Order order = new Order(customer);
		OrderApplication application = new OrderApplication();

		if (application.createOrder(order)) 
		{
			price = order.calculatePrice();
			System.out.printf("Price of the order: $%.1f\n", price);
		}
	}
}