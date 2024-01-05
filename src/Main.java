import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        Venta venta1 = new Venta();
        System.out.println("ingrese los datos del prodcuto");
        venta1.ingresarVenta(new IProductoRepositorio() {
            @Override
            public void imprimirProducto() {
               System.out.println("el nombre del alimento es ");
            }

            @Override
            public void ingresarProducto() {
                Scanner sc = new Scanner(System.in);

                System.out.println("ingrese el nombre del producto es: ");
                alimento.nombre = sc.next();

            }
        });


    }
}