
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); // sayi 2 = 10 dur.

		int[] sayilar1 = { 1, 2, 3, };
		int[] sayilar2 = { 4, 5, 6, };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);// sayilar2[0] = 10 dur.

		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.Topla(3, 4));
		
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.price = 5000;
		product.stockAmount = 3;
		product.description = "Asus Laptop";
		System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
