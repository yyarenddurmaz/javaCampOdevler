
public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidater.isValid(product)) {
			System.out.println("eklendi.");
		}else {
			System.out.println("ürün bilgileri geçersizdir.");
		}
		
	}
}
