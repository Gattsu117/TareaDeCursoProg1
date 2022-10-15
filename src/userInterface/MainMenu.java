package userInterface;
import java.util.Scanner;


public class MainMenu {

	Scanner scan = new Scanner(System.in);
	public void mostar() {
		mostarOpt();
	}
	
	public void mostarOpt() {
		int opt = 0;
		System.out.println("1.Ingresar los datos del trabajador");
        System.out.println("2.Realizar calculos de nomina");
        System.out.println("3.Salir");
        opt = scan.nextInt();
        while(opt <1 || opt>=3) {
        	if(opt==3) {
        		System.out.println("Saliendo...");
        		System.exit(0);
        	}
        	 System.out.println("Ingrese una opción valida!");
        	 opt= scan.nextInt();
        }
        mostarOptSelected(opt);
	}
	
	public void mostarOptSelected(int opt) {
		while(opt!=3) {
			switch(opt) {
            
            case 1:
            	MenuNomina n = new MenuNomina();
            	n.MenuNomina();
            	break;
            case 2:
            	MenuNomina no = new MenuNomina();
            	no.mostrar();
            	break;
            case 3:
            	System.out.println("Gracias por usar el programa");
            	System.exit(0);
        
            break;
            
            default:
            	System.err.println("Seleccione una opcion correcta\n");
            	break;
            }
		}
	}
	public void menu() {
		 int opcion=0;
	        System.out.println("\nBienvenido");
	        while(opcion!=3){
	            System.out.println("1.Ingresar los datos del trabajador");
	            System.out.println("2.Realizar calculos de nomina");
	            System.out.println("3.Salir");
	            System.out.println("Opcion: ");
	            opcion = scan.nextInt();
	            
	            switch(opcion) {
	            
	            case 1:
	            	MenuNomina n = new MenuNomina();
	            	n.MenuNomina();
	            	break;
	            case 2:
	            	MenuNomina no = new MenuNomina();
	            	no.mostrar();
	            	break;
	            case 3:
	            	System.out.println("Gracias por usar el programa");
	            	System.exit(0);
	        
	            break;
	            
	            default:
	            	System.err.println("Seleccione una opcion correcta\n");
	            	break;
	            }
	        }
	}
	
}
