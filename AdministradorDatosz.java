/**
 * Write a description of class Datos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class AdministradorDatosz {
    private String nombre;
    private int codigo;
    private double precio;
    private int cantidad;
    private double precioTotal;
    public static void main(String[] args) {
        Scanner fnd = new Scanner(System.in);
        System.out.println("--Reegistro de Productos--");
        int num_cmp = 3;
        AdministradorDatosz[] zbras = new AdministradorDatosz[num_cmp];
        double precio_Tc = 0;
        for (int i = 0; i < num_cmp; i++) {
            System.out.println("\nCompra " + (i + 1));
            AdministradorDatosz zbra = new AdministradorDatosz();
            System.out.print("Nombre del producto: ");
            zbra.nombre = fnd.nextLine();
            System.out.print("Código del producto: ");
            zbra.codigo = fnd.nextInt();
            fnd.nextLine();
            System.out.print("Precio del producto: ");
            zbra.precio = fnd.nextDouble();
            fnd.nextLine();
            System.out.print("Cantidad que va a llevar: ");
            zbra.cantidad = fnd.nextInt();
            fnd.nextLine();
            zbra.precioTotal = zbra.precio * zbra.cantidad;
            precio_Tc += zbra.precioTotal;
            zbras[i] = zbra;
        }
        double prom_T = precio_Tc / num_cmp;
        System.out.println("\nInformación de los productos:");
        for (int i = 0; i < num_cmp; i++) {
            System.out.println("\nCompra " + (i + 1));
            System.out.println(zbras[i].toString());
        }
        System.out.println("\nPromedio del precio total de las compras: " + prom_T);
    }
    public String toString() {
        return "Nombre: " + nombre + "\nCódigo: " + codigo + "\nPrecio: " + precio +
               "\nCantidad: " + cantidad + "\nPrecio total: " + precioTotal;
    }
}