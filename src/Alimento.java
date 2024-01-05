import java.util.Scanner;

public class Alimento extends Producto{

    public String fechaElaboracion;
    public String fechaExpiracion;

    public Alimento(String fechaElaboracion, String fechaExpiracion) {
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
    }

    public Alimento() {

    }


    public void ingresarAlimento(){
        this.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la fecha de elaboracion");
        this.fechaElaboracion = sc.next();
        System.out.println("ingrese la fecha de expiracion");
        this.fechaExpiracion= sc.next();
    }
}
