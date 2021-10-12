/*
Dentro del servicio, vamos a instanciar a la clase servicioDAO, en la cual
por herencia llamaremos los métodos de la interfaz DAO, la cual hace el 
manejo de la base de datos
*/
package Servicios;

import Entidades.Fabricante;
import Entidades.Producto;
import Persistencia.ProductoDAO;
import java.util.Scanner;


public class servicioProducto {
    
    //DEFINO VARIABLES GLOBALES Y CREO SU CONSTRUCTOR
    private Scanner entrada;
    //private UsuarioServicio usuarioServicio;
    private int respuesta;
    private ProductoDAO dao;
    
    
    public servicioProducto() {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        //usuarioServicio = new UsuarioServicio();
        this.respuesta = 0;
        this.dao = new ProductoDAO();
    }
        
    public void crearProducto() throws Exception{
        //Para llamar al método que verifica la existencia del fabricante
        servicioFabricante servFabr = new servicioFabricante();
        
        try {
            
            System.out.print("Nombre del Producto: ");
            String nombre = entrada.next();
            
            System.out.print("Código del Producto: ");
            Integer codigo = entrada.nextInt();

            System.out.print("Precio del producto: $");
            Double precio = entrada.nextDouble();

            System.out.println("Código del Fabricante: ");
            Integer codigoFabricante = entrada.nextInt();
            
            /*
            Con el "codigoFabricante" verificamos si existe el Fabricante
            Si existe, se hace la instanciación invocando al correspondiente método del servicioFabricante. 
            Si no existe, se invoca al correspondiente método de creación en servicioFabricante. 
            
            */
            if (servFabr.buscarFabricanteCodigo(codigoFabricante)==null) {
                servFabr.crearFabricante();
            } else {
            }
        
            

            //Validamos (cualquier cosa que creamos necesario validar)
            
            if (codigo <= 0 ) {
                throw new Exception("Debe indicar un número entero positivo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (precio <= 0) {
                throw new Exception("Debe indicar un número positivo");
            }
            if (codigoFabricante <= 0 ) {
                throw new Exception("Debe indicar un número entero positivo");
            }
            if (Fabricante == null) {
                throw new Exception("Debe indicar el Fabricante");
            }

            //INSTANCIAMOS EL PRODUCTO
            Producto productoX = new Producto();
            
            productoX.setCodigo(codigo);
            productoX.setNombre(nombre);
            productoX.setPrecio(precio);
            productoX.setCodigoFabricante(codigoFabricante);
            
            //INSTANCIAMOS EL FABRICANTE
            
            
            productoX.setFabricante(fabricante);
            productoX.
                    
            dao.guardarMascota(mascota);

        } catch (Exception e) {
            throw e;
        }
    }

}
    

