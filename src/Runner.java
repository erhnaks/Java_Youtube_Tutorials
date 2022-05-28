import com.qa.ims.controller.Customer;

public class Runner{
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		Customer custone = new Customer(30, "Erhan", "Aksu" );
		Customer custtwo = new Customer(25, "Jordan", "Benbelaid" );
		
		System.out.println(custone);
		System.out.println(custtwo);
	}
		
	
	
}