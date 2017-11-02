import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		Customer customer = new Customer("Nikolas Lendvoy", "3141 Circle drive", 0.0f, 0.0f);
		double price = 0.0;

		Order order = new Order(customer);
		OrderApplication application = new OrderApplication();

		if (application.createOrder(order)) 
		{
			price = order.calculatePrice();
			System.out.printf("Price of the order: $%.2f\n", price);
			System.out.printf("Would you like to edit your order? (yes = 0) \n");
			int input1 = in.nextInt();
			
			if (input1 == 0)
			{
			
				System.out.printf("Please enter the products ID you would like to change.\n");
				int input2 = in.nextInt();
				
				System.out.printf("Please enter the quantity desired.\n");
				int input3 = in.nextInt();	
				
				order.editOrderItem(input2, input3);
				price = order.calculatePrice();
				System.out.printf("Price of the order: $%.2f\n", price);
			}
		}
	}
}