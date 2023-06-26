/**
 * Write a description of class Datos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class AdministradorDatosz {
    public static void main(String[] args) {
        int numeroProductos;
        String[] codigos = new String[50];
        String[] nombres = new String[50];
        int[] cantidades = new int[50];
        double[] precios = new double[50];
        double sumaPrecios = 0;
        Scanner fnb = new Scanner(System.in);
        System.out.println("Bienvenido(a) al Administrador de Datosz.");
        System.out.println("Digite el número de productos a comprar:");
        numeroProductos = fnb.nextInt();
        for (int i = 0; i < numeroProductos; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");
            System.out.println("Digite el código del producto:");
            String codigo = fnb.next();
            codigos[i] = codigo;
            System.out.println("Digite el nombre del producto:");
            String nombre = fnb.next();
            nombres[i] = nombre;
            System.out.println("Digite el precio del producto:");
            double precio = fnb.nextDouble();
            precios[i] = precio;
            System.out.println("Digite la cantidad de productos a llevar:");
            int cantidad = fnb.nextInt();
            cantidades[i] = cantidad;
            double totalProducto = precio * cantidad;
            sumaPrecios += totalProducto;
        }
        double promedioPrecios = sumaPrecios / numeroProductos;
        System.out.println("\nDetalle de la compra:");
        for (int i = 0; i < numeroProductos; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.println("Código: " + codigos[i]);
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Precio: $" + precios[i]);
            System.out.println("Cantidad: " + cantidades[i]);
        }
        System.out.println("Suma total de los precios: $" + sumaPrecios);
        System.out.println("Promedio de los precios: $" + promedioPrecios);
        fnb.close();
    }
}

        return "Nombre: " + nombre + "\nCódigo: " + codigo + "\nPrecio: " + precio +
               "\nCantidad: " + cantidad + "\nPrecio total: " + precioTotal;
    }
}
