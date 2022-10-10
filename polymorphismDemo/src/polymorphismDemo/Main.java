package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		EmailLogger emailLogger = new EmailLogger();
//		emailLogger.Log("Log mesajı");
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()}; //Hepsi baselogger türünde olduğu için baselogger arrayine onu extend eden diğer classları yazarsak sorun olmaz
//																											 //bu özellik bunların referans tip olmasından ve stackdeki her biri farklı iş yapan loggerin heapte aynı yeri tutabilmesinden kaynaklıdır. 
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesajı");
//		}
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
