public class ProductManager {

	public void Add(Product product) {
		System.out.println("Müşteri eklendi: "+ product.name);
	}
	public void Add(int id, String name, String discription, int stockAmount, double price) {
		System.out.println("Müşteri eklendi: " + name);
	}
}
