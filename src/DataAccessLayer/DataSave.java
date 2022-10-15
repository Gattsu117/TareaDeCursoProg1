 
package DataAccessLayer;
import java.io.File;
import java.util.List;

import DataObjectLayer.Data;
import userInterface.uiMenu;

public class DataSave implements uiMenu  {
	private Data d;
	private List<Data> data;			
	private NominaFile nominafile; 		
										
					
	
	public DataSave() {
		nominafile = new NominaFile();
	}
	
	
	
	public void setData(List<Data> data) {	
		this.data = data;
		nominafile = new NominaFile();
	}

	
	
	public void save(String path){		// este metodo permite guardar el archivo de texto creado en la clase NominaFile dentro den un directorio creado en la computadora, a su vez tambien le tenemos que asignar un nombre al archivo de texto
		File myfile = new File(path);	// El parametro "Path" es la ruta o directorio en donde vamos a guardar el archivo
		if(myfile!=null) {				// Aca hacemos una evaluacion, si el archivo es diferente de nulo, el archivo se guardara dentro del la ruta indicada con anterioridad
			nominafile.save(myfile, data);
	
		}
	}
	
	
	

	
	
	
	public List<Data> getData(String path) {	// aca realizamos la lectura del archivo guardado con anterioridad
		File myfile = new File(path); // aca igualmente indicamos la ruta y nombre con el que fue guardado el archivo en el metodo anterior
		if(myfile!= null) {	// aca volvemos a realizar la evaluacion
			data = nominafile.read(myfile); // al realizar la evaluacion, y si el directorio y el archivo existen, entonces hara la lectura de datos
		}
		return data; // y aca retornamos la informacion guardada dentro del archivo de text, que en este caso seria la nomina
	}


	@Override
	public void mostar2() {
		System.out.println("1-Opcion ");
		System.out.println("2-Opcion ");
		System.out.println("3-Opcion ");
		///entrada del usuario
		
		save2();
	}



	@Override
	public void save2() {
		
		System.out.println("Guardado!");
		
	}
		
	
	
	}	

