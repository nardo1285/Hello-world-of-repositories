/*

*/
package Entidades;

public class Producto {
    
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer codigoFabricante;
    private Fabricante fabricante;

    
    //CONSTRUCTORES
    public Producto() {
    }
    public Producto(Integer codigo, String nombre, Double precio, Integer codigoFabricante, Fabricante fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
        this.fabricante = fabricante;
    }

    
    //SETTERS Y GETTERS
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(Integer codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigoFabricante=" + codigoFabricante + ", fabricante=" + fabricante + '}';
    }
    
    
    
}
