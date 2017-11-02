import java.util.*;

public class ProductCatalogue
{
		private ArrayList<Product> Products = new ArrayList<Product>();

		public ProductCatalogue()
		{
			System.out.println("calling ProductCatalogue class");
		}

		public void addProduct(String name_, Double price_, int productID_)
		{
			System.out.println("calling ProductCatalogue class");
			Product product = new Product(name_,price_,productID_);		
			Products.add(product);
		}
		
		public Iterator<Product> iterator()
		{
			System.out.println("calling ProductCatalogue class");
			return Products.iterator();
		}
}