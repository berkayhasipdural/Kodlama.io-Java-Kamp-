
public class Main {

	public static void main(String[] args) {
		//referance typr
		CustomerManager customerManager = new CustomerManager();//bir class � �a��r�rken new komudunu kullan�r�z 
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		
		//value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 =30;
		System.out.println(sayi2);
	}
	
	
	
}