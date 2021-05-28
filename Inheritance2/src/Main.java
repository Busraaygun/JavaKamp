
public class Main {

	public static void main(String[] args) {
			
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
 // burada FileLoger kısmı yerine başka şeyler eklenebilir. DatabaseLogger gibi.
		
	}

}
