package nLyeredDemo.core;

import nLyeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements loggerService{

	@Override
	public void logToSystem(String massage) {
	 jLoggerManager manager = new jLoggerManager();
	 manager.log(massage);
		
	}

}
