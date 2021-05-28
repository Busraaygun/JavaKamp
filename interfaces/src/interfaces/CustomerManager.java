package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}// burada referans atamasý vardýr.
	

	public void add(Customer customer) {
		
		System.out.println("Müþteri eklendi " + customer.getFirstName());
	    
		Utils.RunLoggers(loggers, customer.getFirstName());
	
	}
	
	
	
	public void  delete(Customer customer) {
		
		System.out.println("Müþteri silindi " + customer.getFirstName());
		



}
}