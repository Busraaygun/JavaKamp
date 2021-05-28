package interfaces;

public class Utils {
	 public static void RunLoggers(Logger[] loggers , String massage) {
		 
		 for (Logger logger : loggers ) {
				
				logger.log(massage);
		}

	 }
	
     
}
