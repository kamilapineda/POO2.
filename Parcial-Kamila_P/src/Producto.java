public class Producto {
    private String nombre;
    private Integer cantidad;
    private Float precioU;

    public Producto (String nombre, Integer cantidad, Float precioU){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precioU=precioU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioU() {
        return precioU;
    }

    public void setPrecioU(Float precioU) {
        this.precioU = precioU;
    }
}

