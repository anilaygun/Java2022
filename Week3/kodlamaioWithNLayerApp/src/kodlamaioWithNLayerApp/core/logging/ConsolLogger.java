package kodlamaioWithNLayerApp.core.logging;

public class ConsolLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("konsola loglandı : " + data);

	}

}
