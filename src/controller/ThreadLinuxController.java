package controller;

import java.io.*;

public class ThreadLinuxController extends Thread{

	String[] processo = new String[1];
	String server;
	
	public ThreadLinuxController(String processo1) {
		processo[0] = processo1;
		
	}
	
	@Override
	public void run() {
		
		ping(processo[0]);
		
	}
	
	private void ping(String processo) {
		try {
			Process proc = Runtime.getRuntime().exec("ping -4 -c 10 " + processo);
			InputStream flow = proc.getInputStream();
			InputStreamReader reader = new InputStreamReader(flow);
			BufferedReader buffer = new BufferedReader(reader);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
