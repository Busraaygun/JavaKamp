package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
	   Customer.customerNumber = "123456";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.companyName = " 789456";
		
		
		SendikaCustomer abc  = new SendikaCustomer();
		Customer.customerNumber = "999999" ;
		
		
		CustomerManager customerManeger = new CustomerManager();

		customerManeger.add(hepsiBurada);
		customerManeger.add(engin);	
		customerManeger.add(abc);
	
		// hepsini b�yle ayr� ayr� �a��rmak yerine altarnatif bir yol var ve onu kulanaca��z
	
		/*
		Customer[] customers  = {engin, abc, hepsiBurada};
		
		customerManeger.addMultiple( customers);
		*/
	}

	
	

}
