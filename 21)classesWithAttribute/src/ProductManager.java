
public class ProductManager {
	
	public ProductManager() {
		System.out.println("Prduct manager �al��t�");
	}
	
	public void Add(Product product) {
		System.out.println("Product added: " + product.getName() );
	}
	public void Delete(Product product) {
		System.out.println("Product deleted " + product.getName() );
	}
	
}
