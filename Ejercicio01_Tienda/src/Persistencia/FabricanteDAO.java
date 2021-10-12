/*

*/
package Persistencia;

import Entidades.Fabricante;
import Servicios.servicioFabricante;

public final class FabricanteDAO extends DAO {
    
    //Se instancia al servicio como privado y se instancia con su constructor
    private final servicioFabricante serviFabri;

    public FabricanteDAO() {
        this.serviFabri = new servicioFabricante();
    }

    //AQUÍ IRÍAN LOS OTROS SERVICIOS (CREAR, ELIMINAR, MODIFICAR, ETC)
    //CREAR FABRICANTE
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el Fabricante");
            }
            String sql = "INSERT INTO Fabricante (codigo, nombre) "
                    + "VALUES ( '" + fabricante.getCodigo()
                    + "' ," + fabricante.getNombre() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
    
    
    //VERIFICACIÓN DE LA EXISTENCIA DEL FABRICANTE
    public Fabricante buscarFabricanteCodigo(Integer codigoFabricante) throws Exception {
        
        try {
            String sql = "SELECT * FROM fabricante WHERE codigo = " + codigoFabricante + "";
            consultarBase(sql);
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
