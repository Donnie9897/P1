package Logico;

import java.io.*;
import java.net.*;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(8080); 
		Socket sr = servidor.accept(); 
		FileInputStream fr = new FileInputStream("C:/Users/Luis/Desktop/Eclipse-Workspace/Tarea#2_FabricaDeQueso_Mat2018-0520/Factura.txt");
		byte b[] =new byte[2002];
		fr.read(b,0,b.length);
		OutputStream os = sr.getOutputStream();
		os.write(b,0,b.length);
		
	}

}
