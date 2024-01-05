public class Venta {

    private Producto producto;
    private Cliente cliente;

    public Venta (){

    }

    public void ingresarVenta (IProductoRepositorio producto){
        producto.imprimirProducto();
        producto.ingresarProducto();
    }
}
