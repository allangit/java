import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.io.File;
import java.awt.Desktop;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class conversion {


	public static void main(String arg[]){
		
		//funciones T2= new funciones();
		//T2.Ayuda();
		try {
			funciones T= new funciones();
			T.data();
			

			} catch (InputMismatchException InputMismatchException){
				
				JOptionPane.showMessageDialog(null,"Error: Se introdujo un dato tipo String");
			  }	 

	}
}
