package kodlamaioDemo.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void Log(String data) {
		System.out.println("veritabanına loglandı: "+ data);
	}

}
