package ies.jandula.directorioCarpetas.launch;

import java.io.File;

import ies.jandula.directorioCarpetas.method.Methods;

public class Main
{
	public static void main(String[] args) 
	{
		File entrada = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"carpetas");		
				
		System.out.println("Numero de directorios/subdirectorios totales: " + Methods.numeroDirectorios(entrada));
		
		Methods.numeroFicherosDistintos(entrada);
		
	}
	
}