
public class Main {

	public static void main(String[] args) {
			
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
 // burada FileLoger k�sm� yerine ba�ka �eyler eklenebilir. DatabaseLogger gibi.
		
	}

}
