package inheritance3;

public class CutomerManager {

	

		public void add(Logger logger) {
			// m��teri ekleme kodlar�n� yazd�k varsay�yoruz.
			System.out.println("M��teri eklendi.");
			
			logger.log();
		}

	}
	 // m��teri eklem kodlar�n� ekledik varsayd�kt�ktan somra ben bu bilgileri loglamak istiyorum.
	/*
	DatabaseLogger logger = new DatabaseLogger();
			logger.log();
	 bu kod blo�unu birs�r� yerde kuland���m�z�z d���n�rsek  bunun d���nda yerlere loglama yap�lacak 
	 olurda i�yapan classlardan biri ba�ka bir i� yapan class kulancak ise  asla ve asla somut classlardan gidilmez
	 somut classlarda bizim burda DatabaseLogger fileLoggerl gibi. 
	 */


