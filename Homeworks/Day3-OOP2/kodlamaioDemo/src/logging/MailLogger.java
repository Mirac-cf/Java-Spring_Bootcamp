package logging;

public class MailLogger implements ILogger{

	@Override
	public void log(String massage) {
		System.out.println(massage + "  mesaji maillere loglandi");
		
	}

}
