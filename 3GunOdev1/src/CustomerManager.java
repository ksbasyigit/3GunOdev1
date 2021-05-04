
public class CustomerManager extends PersonManager{
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi.");
		this.baseLogger.log("Log Mesajı customer manager");
//		DatabaseLogger databaseLogger = new DatabaseLogger();
//		databaseLogger.Log("Log mesajı customer manager");
	}
}