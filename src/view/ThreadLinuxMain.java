package view;
import controller.ThreadLinuxController;
public class ThreadLinuxMain {

	public static void main(String[] args) {
		String[] pingArray = {"www.google.com.br", "www.uol.com.br", "www.terra.com.br"};
		String os = System.getProperty("os.name");
		
		if (os.contains("Linux")) {
			for (int i = 0; i < 3; i++) {
				ThreadLinuxController tCon = new ThreadLinuxController(pingArray[i]);
				tCon.start();
			}
		}
		
		

	}

}
