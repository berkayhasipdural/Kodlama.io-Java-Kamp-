public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		
		// set value
		product1.setName("Toys");
		product1.setDiscount(5);
		product1.setUnitsInStock(3);
		product1.setUnitPrice(6000);
		product1.setImageUrl("bilmemne.png");
		
		Product product2 = new Product();

		product2.setName("Coffe Machine");
		product2.setDiscount(10);
		product2.setUnitsInStock(6);
		product2.setUnitPrice(1000);
		product2.setImageUrl("bilmemne2.png");

		
		Product product3 = new Product();

		product3.setName("Television");
		product3.setDiscount(7);
		product3.setUnitsInStock(42);
		product3.setUnitPrice(8000);
		product3.setImageUrl("bilmemne3.png");

		Product[] products = {product1,product2,product3};

		for (Product product : products) 
		{
			System.out.println(product.getDiscount());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setFirstName("BerkayHasip");
		individualCustomer.setLastName("Dural");
		individualCustomer.setId(1);
		individualCustomer.setPhone("05050555");
		
		
		coorporateCustomer coorporateCustomer = new coorporateCustomer();
		coorporateCustomer.setCompanyName("BH Company");
		coorporateCustomer.setTaxNumber("4363828737");
		coorporateCustomer.setId(9);
		coorporateCustomer.setPhone("0242000000");
		
		Customer[] customers = {individualCustomer, coorporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getPhone());
		}
		
	}

}