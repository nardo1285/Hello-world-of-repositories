/*
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
*/
package Tienda;

import Servicios.servicioFabricante;
import Servicios.servicioProducto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainTienda {

    //ACÁ ADENTRO LLAMARÉ AL MENÚ GENERAL
    public static void main(String[] args) {

    
    }
    
    
    //DEFINO VARIABLES GLOBALES Y CREO SU CONSTRUCTOR
    private Scanner entrada;
    //private UsuarioServicio usuarioServicio;
    private int respuesta;

    public mainTienda() {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        //usuarioServicio = new UsuarioServicio();
        this.respuesta = 0;
    }
        
    //MENU GENERAL (de aquí derivo a los sub-menús)
    public void menu(){    
        do {
            try {
                System.out.println("///----- TIENDA ELECTRO -----///");
                System.out.println("1. MENÚ Producto ");
                System.out.println("2. MENÚ Fabricante ");
                System.out.println("3. SALIR");
                System.out.println("------------- *** -------------");
                
                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        menuProducto();
                        break;
                    case 2:
                        menuFabricante();
                        break;
                    case 3:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } //catch (MiExcepcion e) {
              //System.out.println(e.getMessage());
              //}
        } while (respuesta != 3);
    }

    
    public void menuProducto(){    
        servicioProducto servProd = new servicioProducto();
        do {
            try {
                System.out.println("///----- subMENÚ PRODUCTO -----///");
                System.out.println("1. Ingresar Producto ");
                System.out.println("2. Editar Producto ");
                System.out.println("3. Eliminar Producto");
                System.out.println("4. Listar Productos");
                System.out.println("5. Menú anterior");
                System.out.println("------------- *** -------------");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        //System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } //catch (MiExcepcion e) {
              //  System.out.println(e.getMessage());
            //}
        } while (respuesta != 5);
    }
    
    public void menuFabricante(){    
        servicioFabricante servFab = new servicioFabricante();
        do {
            try {
                System.out.println("///----- subMENÚ FABRICANTE -----///");
                System.out.println("1. Ingresar Fabricante ");
                System.out.println("2. Editar Fabricante ");
                System.out.println("3. Eliminar Fabricante");
                System.out.println("4. Listar Fabricante");
                System.out.println("5. SALIR");
                System.out.println("------------- *** -------------");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            }// catch (MiExcepcion e) {
               // System.out.println(e.getMessage());
            //}
        } while (respuesta != 5);
    }
    
    
    //MÉTODOS LECTURA DE DATOS - PRODUCTO
    public void ingresarProducto() throws Exception{
        
        servicioProducto nuevoSP = new servicioProducto();
        
        nuevoSP.crearProducto();
    }

    public void modificarProducto() {
        
    }
    
    public void eliminarProducto() {
        
    }

    
    // MÉTODO LECTURA DE DATOS - FABRICANTE
    public void ingresarFabricante() {
    
    }
    

    
    
}
