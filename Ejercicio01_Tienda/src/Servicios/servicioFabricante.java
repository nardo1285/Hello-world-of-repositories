/*
servicios:
En este paquete se almacenarán aquellas clases que llevarán adelante lógica del
negocio. En general se crea un servicio para administrar cada una de las entidades
y algunos servicios para manejar operaciones muy específicas como las estadísticas.
Realizar un menú en java a través del cual se permita elegir qué consulta se desea
realizar. Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
15
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.

*/
package Servicios;

import Entidades.Fabricante;
import Persistencia.FabricanteDAO;
import java.util.Scanner;

public class servicioFabricante {

    //DEFINO VARIABLES GLOBALES Y CREO SU CONSTRUCTOR
    private Scanner entrada;
    //private UsuarioServicio usuarioServicio;
    private int respuesta;
    private FabricanteDAO dao;
    
    
    public servicioFabricante() {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        //usuarioServicio = new UsuarioServicio();
        this.respuesta = 0;
        this.dao = new FabricanteDAO();
    }
       
    
    //CREAR FABRICANTE
    public void crearFabricante() throws Exception {

        try {
            
            //Creamos el Fabricante
            Fabricante fabricante = new Fabricante();
            System.out.print("Código del Fabricante: ");
            Integer codigo = entrada.nextInt();
            
            System.out.print("Nombre del Fabricante: ");
            String nombre = entrada.next();
            
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            
            dao.guardarFabricante(fabricante);

            //Validamos
            if (codigo <=0) {
                throw new Exception("Debe indicar un número entero positivo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante");
            }
    
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    //VERIFICAR LA EXISTENCIA DEL FABRICANTE
    public Fabricante buscarFabricanteCodigo(Integer codigoFabricante) throws Exception {
    
        try {

            //Validamos
            if (codigoFabricante < 0) {
                throw new Exception("Debe indicar un número entero positivo");
            }
            Fabricante fabricante = dao.buscarFabricanteCodigo(codigoFabricante);
            
            //Verificamos
            if (fabricante == null) {
                throw new Exception("No se encontró Fabricante para el código" + codigoFabricante);
            }

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
     
    
}
