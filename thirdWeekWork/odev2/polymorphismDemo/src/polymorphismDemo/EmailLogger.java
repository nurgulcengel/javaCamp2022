package polymorphismDemo;

public class EmailLogger extends BaseLogger {

	 public void Log(String mesaj) {
		 System.out.println("Logged to email : " + mesaj);
		 
	 }
}
