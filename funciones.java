/*AGREGANDO COMENTARIOS JAVA*/

import javax.swing.JOptionPane;
import java.io.File;
import java.awt.Desktop;
import java.math.BigDecimal;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
public class funciones {

	public void Ayuda () {

		try {
	     	File path = new File ("manual_usuario.pdf");
	     	Desktop.getDesktop().open(path);
		}	
		catch (Exception e) {
	     		//ex.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error: No se encuentra el archivo");
			//System.out.println("No se encuentra en archivo");		
		}
		System.out.println("Se encontro archivo");

	}




	public void interfaz() {

		System.out.println("..........Bienvenidos a conversor de unidades...........->");
		System.out.println("Digite 1 para pasar de Kilometros a las otras unidades..->");
		System.out.println("Digite 2 para pasar de Metros a las otras unidade.......->");
		System.out.println("Digite 3 para pasar de Centimetros a las otras unidade...->");
		System.out.println("Digite 4 para pasar de decimetros a las otras unidade...->");
		System.out.println("Digite 5 para pasar de micrometros a las otras unidades.->");
		System.out.println("Digite 6 para pasar de nanometros a las otras unidades..->");
		System.out.println("Digite 7 para pasar de Angstroms a las otras unidades...->");
		System.out.println("Digite 8 para pasar de milimetros a las otras unidades..->");
		System.out.println("Digite 9 para ver el manual de usuario..->");
		System.out.println("Digite 10 si desea salir...->");
		System.out.println("\n");

	}
	
	public void submenu_kilometros() {

		System.out.println("1 Metros..->");
		System.out.println("2 Centimetros.......->");
		System.out.println("3 Decimetros........->");
		System.out.println("4 Milimetros........->");
		System.out.println("5 Micrometros........->");
		System.out.println("6 Nanometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");
	
		
		

	}

	public void submenu_metros() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Centimetros.......->");
		System.out.println("3 Decimetros........->");
		System.out.println("4 Milimetros........->");
		System.out.println("5 Micrometros........->");
		System.out.println("6 Nanometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");
	

	}


	public void submenu_centimetros() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Metros.......->");
		System.out.println("3 Decimetros........->");
		System.out.println("4 Milimetros........->");
		System.out.println("5 Micrometros........->");
		System.out.println("6 Nanometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");
		System.out.println("8 Menu principal->");
		
		

	}

	public void submenu_decimetros() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Metros.......->");
		System.out.println("3 Centimetros........->");
		System.out.println("4 Milimetros........->");
		System.out.println("5 Micrometros........->");
		System.out.println("6 Nanometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");
		System.out.println("8 Menu principal->");

	}


	public void submenu_milimetros() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Metros.......->");
		System.out.println("3 Centimetros........->");
		System.out.println("4 Decimetros........->");
		System.out.println("5 Micrometros........->");
		System.out.println("6 Nanometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");
		System.out.println("8 Menu principal->");
		
		

	}

	public void submenu_Micrometros() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Metros.......->");
		System.out.println("3 Decimetros........->");
		System.out.println("4 Centimetros........->");
		System.out.println("5 Milimetros........->");
		System.out.println("6 Nanometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");


	}


	public void submenu_Nanometros() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Metros.......->");
		System.out.println("3 Decimetros........->");
		System.out.println("4 Centimetros........->");
		System.out.println("5 Milimetros........->");
		System.out.println("6 Micrometros.........->");
		System.out.println("7 Angstroms..........->");
		System.out.println("8 Menu principal->");

	}

	public void submenu_Angstroms() {

		System.out.println("1 Kilometros..->");
		System.out.println("2 Metros.......->");
		System.out.println("3 Decimetros........->");
		System.out.println("4 Centimetros........->");
		System.out.println("5 Milimetros........->");
		System.out.println("6 Micrometros.........->");
		System.out.println("7 Nanometros..........->");
		System.out.println("8 Menu principal->");

	}

	public int Unidad_generica() {

		Scanner entrada= new Scanner(System.in);
		int data,opcion;
		System.out.print("Digite la distancia");
		data=entrada.nextInt();

		return data;
	   }

	public void data() {


		int data,op,opcion;
		long valor,valor2;
		

		///try {
				
			do {
			funciones nuevo= new funciones();
			nuevo.interfaz();
			Scanner entrada1= new Scanner(System.in);
			System.out.printf("Digite donde desea ingresar =");
			op=entrada1.nextInt();

			if (op==10) {
				System.out.print("Saliendo del Sistema ............\n");
				break;
			}


			if (op==9) {

				funciones ayuda =new funciones();
				ayuda.Ayuda();

			}

					/*System.out.println("1 Metros..->");
					System.out.println("2 Centimetros.......->");
					System.out.println("3 Decimetros........->");
					System.out.println("4 Milimetros........->");
					System.out.println("5 Micrometros........->");
					System.out.println("6 Nanometros.........->");
					System.out.println("7 Angstroms..........->");
					System.out.println("8 Menu principal->");
					System.out.println("8 Menu principal->");*/


					/* KILOMETROS*/
			if (op==1) {
				funciones Desktop=new funciones();
				Desktop.submenu_kilometros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor2=aplicacion.Unidad_generica();
				System.out.printf("la distancia en metros es =%dm\n",1000*valor2);
				break;

				case 2:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				System.out.printf("la distancia en centimetros es =%dcm\n",100000*valor);
				break;

				case 3:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				System.out.printf("la distancia en decimetros es =%dm\n",10000*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();

				System.out.printf("la distancia en milimetros es =%dmm\n",1000000*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				System.out.printf("la distancia en micrometros es =%dum\n",1000000000*valor);
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("1000000000000");
				BigDec1 = BigDec1.multiply(BigDec2);
        			System.out.println("la distancia en Nanometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("10000000000000");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Angstroms  =" + BigDec3+"\n");
				break;
				
					}
				}

				/* public void submenu_metros() {

				System.out.println("1 Kilometros..->");
				System.out.println("2 Centimetros.......->");
				System.out.println("3 Decimetros........->");
				System.out.println("4 Milimetros........->");
				System.out.println("5 Micrometros........->");
				System.out.println("6 Nanometros.........->");
				System.out.println("7 Angstroms..........->");
				System.out.println("8 Menu principal->");
				System.out.println("8 Menu principal->"); */

				
				/*  METROS */
				
			if (op==2) {
				funciones Desktop=new funciones();
				Desktop.submenu_metros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				String enteroString3 = Long.toString(valor);
				BigDecimal BigDec5 = new BigDecimal(enteroString3);
		      		BigDecimal BigDec6 = new BigDecimal("0.001");
				BigDec5 = BigDec5.multiply(BigDec6);
        			System.out.println("la distancia en Kilometros es =" + BigDec5+"\n");
				break;

				case 2:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				System.out.printf("la distancia en centimetros es =%dcm\n",100*valor);
				break;

				case 3:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				System.out.printf("la distancia en decimetros es =%dm\n",10*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();

				System.out.printf("la distancia en milimetros es =%dmm\n",1000*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				System.out.printf("la distancia en micrometros es =%dum\n",1000000*valor);
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("1000000000");
				BigDec1 = BigDec1.multiply(BigDec2);
        			System.out.println("la distancia en Nanometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("10000000000");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Angstroms  =" + BigDec3+"\n");
				break;

							
					}
				}

				/*  Centimetros */
				/*public void submenu_centimetros() {

				System.out.println("1 Kilometros..->");
				System.out.println("2 Metros.......->");
				System.out.println("3 Decimetros........->");
				System.out.println("4 Milimetros........->");
				System.out.println("5 Micrometros........->");
				System.out.println("6 Nanometros.........->");
				System.out.println("7 Angstroms..........->");
				System.out.println("8 Menu principal->");
				System.out.println("8 Menu principal->");

				}
				*/	
		
				
			if (op==3) {
				funciones Desktop=new funciones();
				Desktop.submenu_centimetros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				String enteroString3 = Long.toString(valor);
				BigDecimal BigDec5 = new BigDecimal(enteroString3);
		      		BigDecimal BigDec6 = new BigDecimal("0.00001");
				BigDec5 = BigDec5.multiply(BigDec6);
				System.out.println("la distancia en Kilometros es =" + BigDec5+"\n");
				//System.out.printf("la distancia en Kilometros es =%dkm\n",0.00001*valor);
				break;

				case 2:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				String enteroString4 = Long.toString(valor);
				BigDecimal BigDec_5 = new BigDecimal(enteroString4);
		      		BigDecimal BigDec_6 = new BigDecimal("0.01");
				BigDec_5 = BigDec_5.multiply(BigDec_6);

				System.out.println("la distancia en metros es  =" + BigDec_5+"\n");
				//System.out.printf("la distancia en metros es =%dm\n",0.01*valor);
				break;

				case 3:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				String enteroString_4 = Long.toString(valor);
				BigDecimal BigDec_5_ = new BigDecimal(enteroString_4);
		      		BigDecimal BigDec_6_ = new BigDecimal("0.1");
				BigDec_5_ = BigDec_5_.multiply(BigDec_6_);
				System.out.println("la distancia en decimetros es  =" + BigDec_5_+"\n");
				//System.out.printf("la distancia en decimetros es =%dcm\n",0.1*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();

				System.out.printf("la distancia en milimetros es =%dmm\n",10*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				System.out.printf("la distancia en micrometros es =%dum\n",10000*valor);
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("10000000");
				BigDec1 = BigDec1.multiply(BigDec2);
        			System.out.println("la distancia en Nanometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("100000000");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Angstroms  =" + BigDec3+"\n");
					}
				}

				
					/* Decimetros*/
					/*public void submenu_decimetros() {
					System.out.println("1 Kilometros..->");
					System.out.println("2 Metros.......->");
					System.out.println("3 Centimetros........->");
					System.out.println("4 Milimetros........->");
					System.out.println("5 Micrometros........->");
					System.out.println("6 Nanometros.........->");
					System.out.println("7 Angstroms..........->");
					System.out.println("8 Menu principal->");
					System.out.println("8 Menu principal->");
					}*/			
				
			if (op==4) {
				funciones Desktop=new funciones();
				Desktop.submenu_decimetros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				String enteroString5 = Long.toString(valor);
				BigDecimal BigDec7 = new BigDecimal(enteroString5);
		      		BigDecimal BigDec8 = new BigDecimal("0.0001");
				BigDec7 = BigDec8.multiply(BigDec7);
        			System.out.println("la distancia en Kilometros es  =" + BigDec7+"\n");
				//System.out.printf("la distancia en Kilometros es =%dkm\n",0.0001*valor);
				break;

				case 2:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				String enteroString_5 = Long.toString(valor);
				BigDecimal BigDec_7 = new BigDecimal(enteroString_5);
		      		BigDecimal BigDec_8 = new BigDecimal("0.1");
				BigDec_7 = BigDec_8.multiply(BigDec_7);
        			System.out.println("la distancia en metros es  =" + BigDec_7+"\n");

				//System.out.printf("la distancia en metros es =%dm\n",0.1*valor);
				break;

				case 3:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				System.out.printf("la distancia en centimetros es =%dcm\n",10*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();

				System.out.printf("la distancia en milimetros es =%dmm\n",100*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				System.out.printf("la distancia en micrometros es =%dum\n",100000*valor);
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("100000000");
				BigDec1 = BigDec1.multiply(BigDec2);
        			System.out.println("la distancia en Nanometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("1000000000");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Angstroms  =" + BigDec3+"\n");
							
					}
				}

				/*Micrometros*/
				/*public void submenu_Micrometros() {

				System.out.println("1 Kilometros..->");
				System.out.println("2 Metros.......->");
				System.out.println("3 Decimetros........->");
				System.out.println("4 Centimetros........->");
				System.out.println("5 Milimetros........->");
				System.out.println("6 Nanometros.........->");
				System.out.println("7 Angstroms..........->");
				System.out.println("8 Menu principal->");
				System.out.println("8 Menu principal->");

				}*/
	
			if (op==5) {
				funciones Desktop=new funciones();
				Desktop.submenu_Micrometros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				
				String enteroString_12 = Long.toString(valor);
				BigDecimal BigDec88 = new BigDecimal(enteroString_12);
		      		BigDecimal BigDec99 = new BigDecimal("0.000000001");
				BigDec88 = BigDec88.multiply(BigDec99);
        			System.out.println("la distancia en Kilometros  =" + BigDec88+"\n");

				//System.out.printf("la distancia en Kilometros es =%dkm\n",0.000000001*valor);
				break;

				case 2:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				String enteroString_9 = Long.toString(valor);
				BigDecimal BigDec_8 = new BigDecimal(enteroString_9);
		      		BigDecimal BigDec_9 = new BigDecimal("0.000001");
				BigDec_8 = BigDec_8.multiply(BigDec_9);
				System.out.println("la distancia en metros  =" + BigDec_8+"\n");
				//System.out.printf("la distancia en metros es =%dm\n",0.000001*valor);
				break;

				case 3:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				String enteroString_1 = Long.toString(valor);
				BigDecimal BigDec10 = new BigDecimal(enteroString_1);
		      		BigDecimal BigDec11 = new BigDecimal("0.00001");
				BigDec10 = BigDec10.multiply(BigDec11);
				System.out.println("la distancia en metros  =" + BigDec10+"\n");
				//System.out.printf("la distancia en decimetros es =%ddcm\n",0.00001*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();
				String enteroString10 = Long.toString(valor);
				BigDecimal BigDec_10 = new BigDecimal(enteroString10);
		      		BigDecimal BigDec_11 = new BigDecimal("0.0001");
				BigDec_10 = BigDec_10.multiply(BigDec_11);
				System.out.println("la distancia en centimetros  =" + BigDec_10+"\n");

				//System.out.printf("la distancia en centimetro es =%dcms\n",0.0001*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				String enteroString_0 = Long.toString(valor);
				BigDecimal BigDec12 = new BigDecimal(enteroString_0);
		      		BigDecimal BigDec13 = new BigDecimal("0.001");
				BigDec12 = BigDec13.multiply(BigDec12);
				System.out.println("la distancia en milimetros  =" + BigDec12+"\n");
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("1000");
				BigDec1 = BigDec1.multiply(BigDec2);
        			System.out.println("la distancia en Nanometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("10000");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Angstroms  =" + BigDec3+"\n");
				break;

							
					}
				}

				/*  nanometros */

				/*public void submenu_Nanometros() {

				System.out.println("1 Kilometros..->");
				System.out.println("2 Metros.......->");
				System.out.println("3 Decimetros........->");
				System.out.println("4 Centimetros........->");
				System.out.println("5 Milimetros........->");
				System.out.println("6 Micrometros.........->");
				System.out.println("7 Angstroms..........->");
				System.out.println("8 Menu principal->");
				System.out.println("8 Menu principal->");
				}*/
				
			if (op==6) {
				funciones Desktop=new funciones();
				Desktop.submenu_Nanometros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				String enteroString22 = Long.toString(valor);
				BigDecimal BigDec33 = new BigDecimal(enteroString22);
		      		BigDecimal BigDec44 = new BigDecimal("0.000000000001");
				BigDec33 = BigDec44.multiply(BigDec33);
				System.out.println("la distancia en en Kilometros  =" + BigDec33+"\n");
			//System.out.printf("la distancia en Kilometros es =%dkm\n",0.000000000001*valor);
				break;

				case 2:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				String enteroString32 = Long.toString(valor);
				BigDecimal BigDec_33 = new BigDecimal(enteroString32);
		      		BigDecimal BigDec_44 = new BigDecimal("0.000000001");
				BigDec_33 = BigDec_44.multiply(BigDec_33);
				System.out.println("la distancia en en metros  =" + BigDec_33+"\n");
		
				//System.out.printf("la distancia en metros es =%dm\n",0.000000001*valor);
				break;

				case 3:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				String enteroString_33_ = Long.toString(valor);
				BigDecimal BigDec_33_ = new BigDecimal(enteroString_33_);
		      		BigDecimal BigDec_44_ = new BigDecimal("0.00000001");
				BigDec_33_ = BigDec_44_.multiply(BigDec_33_);
				System.out.println("la distancia en en decimetros  =" + BigDec_33_+"\n");
				//System.out.printf("la distancia en decimetros es =%dcm\n",0.00000001*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();
				String enteroString50 = Long.toString(valor);
				BigDecimal BigDec50 = new BigDecimal(enteroString50);
		      		BigDecimal BigDec60 = new BigDecimal("0.0000001");
				BigDec50 = BigDec60.multiply(BigDec50);
				System.out.println("la distancia en en centimetros  =" + BigDec50+"\n");
				//System.out.printf("la distancia en centimetros es =%dmm\n",0.0000001*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				String enteroString_50 = Long.toString(valor);
				BigDecimal BigDec_50 = new BigDecimal(enteroString_50);
		      		BigDecimal BigDec_60 = new BigDecimal("0.000001");
				BigDec_50 = BigDec_60.multiply(BigDec_50);
				System.out.println("la distancia en en milimetros  =" + BigDec_50+"\n");
				//System.out.printf("la distancia en milimetros es =%dum\n",0.000001*valor);
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("0.001");
				BigDec1 = BigDec1.multiply(BigDec2);
        			System.out.println("la distancia en micrometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("10");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Angstroms  =" + BigDec3+"\n");
				break;
			
					}
				}

				/*  Angstroms */

				/*public void submenu_Angstroms() {

				System.out.println("1 Kilometros..->");
				System.out.println("2 Metros.......->");
				System.out.println("3 Decimetros........->");
				System.out.println("4 Centimetros........->");
				System.out.println("5 Milimetros........->");
				System.out.println("6 Micrometros.........->");
				System.out.println("7 Nanometros..........->");
				System.out.println("8 Menu principal->");
				System.out.println("8 Menu principal->");
				}
					*/
				
			if (op==7) {
				funciones Desktop=new funciones();
				Desktop.submenu_Angstroms();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				String enteroString70 = Long.toString(valor);
				BigDecimal BigDec70 = new BigDecimal(enteroString70);
		      		BigDecimal BigDec80 = new BigDecimal("0.0000000000001");
				BigDec80 = BigDec70.multiply(BigDec80);
				System.out.println("la distancia en en Kilometros  =" + BigDec80+"\n");
			//System.out.printf("la distancia en Kilometros es =%dkm\n",0.0000000000001*valor);
				break;

				case 2:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				String enteroString_70 = Long.toString(valor);
				BigDecimal BigDec_70 = new BigDecimal(enteroString_70);
		      		BigDecimal BigDec_80 = new BigDecimal("0.0000000001");
				BigDec_80 = BigDec_70.multiply(BigDec_80);
				System.out.println("la distancia en metros  =" + BigDec_80+"\n");
			///System.out.printf("la distancia en metros es =%dm\n",0.0000000001*valor);
				break;

				case 3:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				String enteroString_70_ = Long.toString(valor);
				BigDecimal BigDec_70_ = new BigDecimal(enteroString_70_);
		      		BigDecimal BigDec_80_ = new BigDecimal("0.000000001");
				BigDec_80_ = BigDec_70_.multiply(BigDec_80_);
				System.out.println("la distancia en  decimetros  =" + BigDec_80_+"\n");
			//System.out.printf("la distancia en decimetros es =%dcm\n",0.000000001*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();
				String enteroString71 = Long.toString(valor);
				BigDecimal BigDec71 = new BigDecimal(enteroString71);
		      		BigDecimal BigDec81 = new BigDecimal("0.00000001");
				BigDec81 = BigDec71.multiply(BigDec81);
				System.out.println("la distancia en  centimetros  =" + BigDec81+"\n");
			//System.out.printf("la distancia en centimetros es =%dmm\n",0.00000001*valor);
				break;

				case 5:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				String enteroString_71 = Long.toString(valor);
				BigDecimal BigDec_71 = new BigDecimal(enteroString_71);
		      		BigDecimal BigDec_81 = new BigDecimal("0.0000001");
				BigDec_81 = BigDec_71.multiply(BigDec_81);
				System.out.println("la distancia en  milimetros  =" + BigDec_81+"\n");
			//System.out.printf("la distancia en milimetros es =%dum\n",0.0000001*valor);
				break;

				case 6:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("0.0001");
				BigDec1 = BigDec1.multiply(BigDec2);

        			System.out.println("la distancia en micrometros es =" + BigDec1+"\n");
				break;

				case 7:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("0.1");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Nanometros =" + BigDec3+"\n");
				break;
							
					}
				}

		
				
					/*MILIMETROS*/
				
				if (op==8) {
				funciones Desktop=new funciones();
				Desktop.submenu_milimetros();
				Scanner entrada2= new Scanner(System.in);
				System.out.printf("unidad deseada=");
				opcion=entrada2.nextInt();
				
				switch (opcion) {
		

				case 1:
				funciones aplicacion=new funciones();
				valor=aplicacion.Unidad_generica();
				String enteroString70 = Long.toString(valor);
				BigDecimal BigDec70 = new BigDecimal(enteroString70);
		      		BigDecimal BigDec80 = new BigDecimal("0.000001");
				BigDec80 = BigDec70.multiply(BigDec80);
				System.out.println("la distancia en en Kilometros  =" + BigDec80+"\n");
			//System.out.printf("la distancia en Kilometros es =%dkm\n",0.0000000000001*valor);
				break;

				case 2:
				funciones aplicacion1=new funciones();
				valor=aplicacion1.Unidad_generica();
				String enteroString_70 = Long.toString(valor);
				BigDecimal BigDec_70 = new BigDecimal(enteroString_70);
		      		BigDecimal BigDec_80 = new BigDecimal("0.001");
				BigDec_80 = BigDec_70.multiply(BigDec_80);
				System.out.println("la distancia en metros  =" + BigDec_80+"\n");
			///System.out.printf("la distancia en metros es =%dm\n",0.0000000001*valor);
				break;

				case 3:
				funciones aplicacion2=new funciones();
				valor=aplicacion2.Unidad_generica();
				String enteroString_70_ = Long.toString(valor);
				BigDecimal BigDec_70_ = new BigDecimal(enteroString_70_);
		      		BigDecimal BigDec_80_ = new BigDecimal("0.1");
				BigDec_80_ = BigDec_70_.multiply(BigDec_80_);
				System.out.println("la distancia en  centimetros  =" + BigDec_80_+"\n");
			//System.out.printf("la distancia en decimetros es =%dcm\n",0.000000001*valor);
				break;

				case 4:
				funciones aplicacion3=new funciones();
				valor=aplicacion3.Unidad_generica();
				String enteroString71 = Long.toString(valor);
				BigDecimal BigDec71 = new BigDecimal(enteroString71);
		      		BigDecimal BigDec81 = new BigDecimal("0.01");
				BigDec81 = BigDec71.multiply(BigDec81);
				System.out.println("la distancia en  decimetros  =" + BigDec81+"\n");
			//System.out.printf("la distancia en centimetros es =%dmm\n",0.00000001*valor);
				break;

				

				case 5:
				funciones aplicacion5=new funciones();
				valor=aplicacion5.Unidad_generica();
				String enteroString1 = Long.toString(valor);

				BigDecimal BigDec1 = new BigDecimal(enteroString1);
		      		BigDecimal BigDec2 = new BigDecimal("1000");
				BigDec1 = BigDec1.multiply(BigDec2);

        			System.out.println("la distancia en micrometros es =" + BigDec1+"\n");
				break;

				case 6:
				funciones aplicacion6=new funciones();
				valor=aplicacion6.Unidad_generica();

				String enteroString2 = Long.toString(valor);
				BigDecimal BigDec3 = new BigDecimal(enteroString2);
		      		BigDecimal BigDec4 = new BigDecimal("1000000");
				BigDec3 = BigDec4.multiply(BigDec3);
        			System.out.println("la distancia en Nanometros =" + BigDec3+"\n");
				break;




				case 7:
				funciones aplicacion4=new funciones();
				valor=aplicacion4.Unidad_generica();
				String enteroString_71 = Long.toString(valor);
				BigDecimal BigDec_71 = new BigDecimal(enteroString_71);
		      		BigDecimal BigDec_81 = new BigDecimal("10000000");
				BigDec_81 = BigDec_71.multiply(BigDec_81);
				System.out.println("la distancia en  Ansgtroms  =" + BigDec_81+"\n");
			//System.out.printf("la distancia en milimetros es =%dum\n",0.0000001*valor);
				break;
							
					}
				}



			} while (op!=11);

			//} catch (InputMismatchException InputMismatchException){
				
			//	System.out.println("No es numero donde desea ingresar =");
			 // }	 

	
		}

			

}




		
			












