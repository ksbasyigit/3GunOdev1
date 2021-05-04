
public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager = new CustomerManager();
//		customerManager.Add();
//		customerManager.Update();
//		customerManager.Remove();

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
//		product.name = "Laptop";
//		product.id = 1;
//		product.price = 5000;
//		product.stockAmount = 3;
//		product.description = "Asus Laptop";
//		System.out.println(product.name);
//		
//		ProductManager productManager = new ProductManager();
//		productManager.Add(product);
//		
//		productManager.Add(2, "Laptop2", "HP Laptop", 2, 200);

		product.setName("Laptop");
		product.setId(3);
		product.setDescription("Dell Laptop");
		product.setPrice(5500);
		product.setRenk("Siyah");
		product.setStockAmount(10);

		System.out.println(product.getKod());

		// dörtişlem Java Ders 35 method overloading

		DortIslem dortIslem2 = new DortIslem();
		System.out.println(dortIslem2.Topla(1, 2, 3));

		// inheritance miras

		Customer customer = new Customer();
		customer.firstName = "";

		Employee employee = new Employee();
		employee.firstName = "";

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.Add();
		employeeManager.BestEmployee();

		// inheritance demo

		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();

		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		tarimKrediManager.hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(tarimKrediManager);

		krediUI.KrediHesapla(new OgretmenKrediManager());

		// polimorfizm

		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Email Log Mesajı");

		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("Database log Mesajı");

//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger() };
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log mesajı");
		
		CustomerManager customerManager2 = new CustomerManager(new DatabaseLogger());
		customerManager2.add();
		
		// Override
		
		OgretmenKrediManager ogretmenKrediManager2 = new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager2.hesaplama(1000));
		System.out.println("----------------------");
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager()};
		for (BaseKrediManager krediManager: krediManagers) {
			System.out.println(krediManager.hesaplama(1000));
		}
	}
}
