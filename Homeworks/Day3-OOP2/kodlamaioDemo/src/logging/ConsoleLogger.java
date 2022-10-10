package logging;

public class ConsoleLogger implements ILogger{

	@Override
	public void log(String massage) {
		System.out.println(massage + "  mesaji Consola loglandi");
	}

}
