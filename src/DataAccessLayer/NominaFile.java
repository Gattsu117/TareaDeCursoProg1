

package DataAccessLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import DataObjectLayer.Data;

public class NominaFile extends Data {

	public void save(File file, List <Data> data) { //Este metodo permite guardar la informacion que se agregue en forma de archivo de texto para eso se importa el paquete java.io.File
		if(file!= null) {			// Tambien importamos el paquete java.util.List, ya que la nomina la mostraremos en forma de lista, para eso declaramos List>Data<data
			try {
				ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(file)); // La clase ObjectOutputStream permite escribir dentro de un fichero la informacion acerca de los trabajadores	    
				w.writeObject(data); // en esta parte es donde se realiza la escritura en el archivo, heredando la informacion de la clase "Data"
				w.flush(); // esto sirve para liberar memoria
				w.close();	// esto sirve para cerrar el procedimiento de escritura, si no lo hacemos, dara error
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	public List<Data> read(File file){			
		List<Data>data= null;
		try {
			ObjectInputStream r = new ObjectInputStream(new FileInputStream(file));
			try {
				data = (List<Data>) r.readObject();	
				r.close();		// aca cerramos el procedimiento de lectura, que es necesario
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;		//aca retornamos la variable data, que es en donde se hace la lectura en el procedimiento antes de cerrar
	}
	
}
