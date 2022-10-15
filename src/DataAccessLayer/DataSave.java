 
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

	
	
	public void save(String path){		
		File myfile = new File(path);	
		if(myfile!=null) {				
			nominafile.save(myfile, data);
	
		}
	}
	
	
	

	
	
	
	public List<Data> getData(String path) {	
		File myfile = new File(path); 
		if(myfile!= null) {	
			data = nominafile.read(myfile); 
		}
		return data; 
	}





	@Override
	public void mostarOpt() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mostar() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mostarOptSelected(int opt) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	}	

