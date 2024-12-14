/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import sw.Factura;
import sw.ConsultaWS_Service;
import sw.ConsultaWS;
import sw.Cliente;
import sw.Producto;

/**
 *
 * @author migue
 */
public class Main {

    static ConsultaWS_Service servicio = new ConsultaWS_Service();
    static ConsultaWS cliente = servicio.getConsultaWSPort();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---\n"
                    + "1. Lista de Clientes \n"
                    + "2. Lista de Facturas por cédula del cliente \n"
                    + "3. Lista de Productos \n"
                    + "4. Salir \n"
                    + "Selecciona una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    printCliente((ArrayList<Cliente>) cliente.listarCliente());
                    break;
                case 2:
                    System.out.print("Digite la cedula del cliente a buscar: ");
                    String cedula = in.next();
                    printFactura((ArrayList<Factura>) cliente.consultarCliente(cedula));
                    break;
                 
                case 3:
                    printProducto((ArrayList<Producto>) cliente.listarProducto());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    in.close();
                    return;
                 
                default:
                    System.out.println("Opción no válida. Por favor intenta de nuevo.");
            }
            
            System.out.print("Desea realizar otra operación (0 - NO; 1 - SI): ");
            opcion = in.nextInt();
            
        } while (opcion == 1);

    }

    public static void printCliente(ArrayList<Cliente> clientes) {
        System.out.println("\nLista de Clientes:");
        if (clientes == null) {
            System.out.println("USUARIO NO ENCONTRADO");
            return;
        }
        if (clientes.isEmpty()) {
            System.out.println("EL USUARIO NO TIENE FACTURAS");
            return;
        }

        System.out.println(String.format("%-10s %-20s %-15s", "ID", "Nombre", "Cédula"));
        System.out.println("---------------------------------------------");

        for (Cliente c : clientes) {
            System.out.println(String.format("%-10d %-20s %-15s", c.getId(), c.getNombre(), c.getCedula()));
        }
    }

    public static void printFactura(ArrayList<Factura> facturas) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("\nLista de Facturas:");
        if (facturas == null) {
            System.out.println("NO EXISTEN FACTURAS");
            return;
        }

        if (facturas.isEmpty()) {
            System.out.println("NO TIENEN FACTURAS ASOCIADAS");
            return;
        }

        System.out.println(String.format("%-10s %-15s %-20s", "Número", "Fecha", "Cliente"));
        System.out.println("---------------------------------------------");

        for (Factura f : facturas) {
            String fechaFormateada = sdf.format(f.getFecha().toGregorianCalendar().getTime());  
            System.out.println(String.format("%-10d %-15s %-20s", f.getNumber(), fechaFormateada, f.getCliente().getCedula()));
        }
    }

    public static void printProducto(ArrayList<Producto> productos) {
        System.out.println("\nLista de Productos:");
        if (productos == null) {
            System.out.println("NO EXISTEN PRODUCTOS");
            return;
        }

        if (productos.isEmpty()) {
            System.out.println("NO HAY PRODUCTOS DISPONIBLES");
            return;
        }

        System.out.println(String.format("%-10s %-40s %-10s", "ID", "Nombre", "Precio"));
        System.out.println("-----------------------------------------------------------");

        for (Producto p : productos) {
            System.out.println(String.format("%-10d %-40s $%-10.2f", p.getId(), p.getNombre(), p.getPrecio()));
        }
    }

}
