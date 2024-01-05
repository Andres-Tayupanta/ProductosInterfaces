import java.util.Scanner;

public class Cliente implements ICliente{
    public String nombre;

    public String cedula;
    public int  edad;

    @Override
    public void imprimirCliente() {
        System.out.println("el nombre del cliente"+nombre);
        System.out.println("la edad  del cliente"+cedula);
        System.out.println("a edad  del producto"+edad);

    }

    @Override
    public void ingresarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del cliente");
        this.nombre = sc.next();


        System.out.println("ingrese la edad  del cliente");
        this.cedula = sc.next();
        System.out.println("ingrese la edad  del producto");
        this.edad = sc.nextInt();

    }

}
