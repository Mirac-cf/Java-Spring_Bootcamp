package logging;

public class FileLogger implements ILogger{

	@Override
	public void log(String massage) {
		System.out.println(massage + "  mesaji dosyalara loglandi");
		
	}
	
	

}
