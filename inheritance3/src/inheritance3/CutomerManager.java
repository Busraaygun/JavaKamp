package inheritance3;

public class CutomerManager {

	

		public void add(Logger logger) {
			// müþteri ekleme kodlarýný yazdýk varsayýyoruz.
			System.out.println("Müþteri eklendi.");
			
			logger.log();
		}

	}
	 // müþteri eklem kodlarýný ekledik varsaydýktýktan somra ben bu bilgileri loglamak istiyorum.
	/*
	DatabaseLogger logger = new DatabaseLogger();
			logger.log();
	 bu kod bloðunu birsürü yerde kulandýðýmýzýz düþünürsek  bunun dýþýnda yerlere loglama yapýlacak 
	 olurda iþyapan classlardan biri baþka bir iþ yapan class kulancak ise  asla ve asla somut classlardan gidilmez
	 somut classlarda bizim burda DatabaseLogger fileLoggerl gibi. 
	 */


