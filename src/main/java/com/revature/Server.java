package com.revature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(8080)) {
			while (true) {
				try (Socket clientSocket = server.accept();
						InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
						BufferedReader reader = new BufferedReader(isr);
						OutputStream os = clientSocket.getOutputStream()) {
					String line = reader.readLine();
					while (!line.isEmpty()) {
						System.out.println(line);
						line = reader.readLine();
					}
					
					String response = "HTTP/1.1 200 OK\r\nContent-Type: application/json\r\n\r\n" + "{'name':'Mehrab'}";
					os.write(response.getBytes("UTF-8"));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
