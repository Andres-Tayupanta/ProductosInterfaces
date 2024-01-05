import java.util.Scanner;

public class Producto implements IProductoRepositorio  {

    public String nombre;
    public String codigo;
    public double precio;
    public int cantidad;


    @Override
    public void imprimirProducto() {
        System.out.println("el nombre del producto"+nombre);
        System.out.println("la cantidad del producto"+cantidad);
        System.out.println("el precio del producto" + precio);
    }

    @Override
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del producto");
        this.nombre = sc.next();

        System.out.println("ingrese la cantidad del producto");
        this.cantidad = sc.nextInt();
        System.out.println("ingrese el codigo  del producto");
        this.codigo = sc.next();
        System.out.println("ingrese el precio del producto");
        this.precio = sc.nextDouble();

    }


}
