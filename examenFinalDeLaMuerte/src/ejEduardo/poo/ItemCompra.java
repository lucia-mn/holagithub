package ejEduardo.poo;

public class ItemCompra {
    private Producto producto;
    private int cantidad;

    public ItemCompra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void sumarCantidad(int cantidadExtra) {
        this.cantidad += cantidadExtra;
    }

    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}

