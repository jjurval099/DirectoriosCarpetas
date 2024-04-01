package ies.jandula.directorioCarpetas.method;

import java.io.File;

public class Methods
{	
	public static int numeroDirectorios(File entrada)
	{		
		int cont = 0;

		if(!entrada.exists()) 
		{
			System.out.println(entrada.getName() + " no encontrado");
		}
		else if (entrada.isDirectory())
		{
			File[] files = entrada.listFiles();
			
			if(files.length > 0)
			{
				for(File f : files)
				{
					cont ++ ;
					
					if (entrada.isDirectory())
					{
						File[] files2 = entrada.listFiles();
						
						if(files.length > 0)
						{
							for(File f2 : files2)
							{
								cont ++ ;
							}
						}
						else
						{
							System.out.println("Carpeta vacia");
						}
					}
				}
			}
			else
			{
				System.out.println("Carpeta vacia");
			}
		}
		return cont;
	}
	
	
	public static void numeroFicherosDistintos(File entrada) 
	{
		int contJson = 0 ;
		int contXml = 0 ;
		int contTxt = 0 ;
		int contPdf = 0 ;
		
		if (!entrada.exists()) 
		{
            System.out.println(entrada.getName() + " no encontrado");
            
        }
		else if (entrada.isDirectory()) 
		{
            File[] files = entrada.listFiles();
            
            if (files != null)
            {
                for (File f : files)
                {
                    if (f.isDirectory()) 
                    {
                    	numeroFicherosDistintos(f);
                    }
                	else 
                	{
                        String nombre = f.getName().toLowerCase();
                        if (nombre.endsWith(".json")) 
                        {
                            contJson++;
                        } 
                        else if (nombre.endsWith(".xml")) 
                        {
                            contXml++;
                        } 
                        else if (nombre.endsWith(".txt"))
                        {
                            contTxt++;
                            
                        }
                        else if (nombre.endsWith(".pdf"))
                        {
                            contPdf++;
                        }
                    }
                }
                
            }
            else 
            {
                System.out.println("Carpeta vacía: " + entrada.getName());
            }
        }
    }
}
