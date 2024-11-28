
package com.mycompany.libreria;

import com.mycompany.libreria.model.Libro;
import java.util.Scanner;
import service.Biblioteca;

public class Libreria {

     public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
         try (Scanner scanner = new Scanner(System.in)) {
             boolean exit = false;
             
             while (!exit) {
                 System.out.println("=== Menú de Biblioteca ===");
                 System.out.println("1. Agregar Libro");
                 System.out.println("2. Modificar Libro");
                 System.out.println("3. Eliminar Libro");
                 System.out.println("4. Listar Libros");
                 System.out.println("5. Filtrar Libros por Precio");
                 System.out.println("6. Agrupar Libros por Autor");
                 System.out.println("7. Sumar Precios de Libros");
                 System.out.println("0. Salir");
                 System.out.print("Selecciona una opción: ");
                 
                 int opcion = scanner.nextInt();
                 scanner.nextLine(); // Consumir nueva línea
                 
                 switch (opcion) {
                     case 1 -> {
                         // Agregar Libro
                         System.out.print("ID: ");
                         int id = scanner.nextInt();
                         scanner.nextLine(); // Consumir nueva línea
                         System.out.print("Título: ");
                         String titulo = scanner.nextLine();
                         System.out.print("Autor: ");
                         String autor = scanner.nextLine();
                         System.out.print("Precio: ");
                         double precio = scanner.nextDouble();
                         biblioteca.agregarLibro(new Libro(id, titulo, autor, precio));
                     }
                     
                     case 2 -> {
                         // Modificar Libro
                         System.out.print("ID del libro a modificar: ");
                         int idModificar = scanner.nextInt();
                         scanner.nextLine(); // Consumir nueva línea
                         System.out.print("Nuevo Título: ");
                         String nuevoTitulo = scanner.nextLine();
                         System.out.print("Nuevo Autor: ");
                         String nuevoAutor = scanner.nextLine();
                         System.out.print("Nuevo Precio: ");
                         double nuevoPrecio = scanner.nextDouble();
                         biblioteca.modificarLibro(idModificar, nuevoTitulo, nuevoAutor, nuevoPrecio);
                         System.out.println("Libro modificado con éxito.");
                     }
                     
                     case 3 -> {
                         // Eliminar Libro
                         System.out.print("ID del libro a eliminar: ");
                         int idEliminar = scanner.nextInt();
                         biblioteca.eliminarLibro(idEliminar);
                         System.out.println("Libro eliminado con éxito.");
                     }
                     
                     case 4 -> {
                         // Listar Libros
                         System.out.println("Lista de libros:");
                         System.out.println(biblioteca.listarLibros());
                     }
                     
                     case 5 -> {
                         // Filtrar Libros por Precio
                         System.out.print("Precio mínimo: ");
                         double precioFiltro = scanner.nextDouble();
                         System.out.println("Libros con precio mayor a " + precioFiltro + ":");
                         biblioteca.filtrarLibrosPorPrecio(precioFiltro).forEach(Libro::mostrarInformacion);
                     }
                     
                     case 6 -> {
                         // Agrupar Libros por Autor
                         System.out.println("Agrupando libros por autor:");
                         biblioteca.agruparPorAutor();
                     }
                     
                     case 7 -> {
                         // Sumar Precios de Libros
                         double sumaPrecios = biblioteca.sumaPrecios();
                         System.out.println("Suma de precios de los libros: " + sumaPrecios);
                     }
                     
                     case 0 -> {
                         // Salir
                         exit = true;
                         System.out.println("Saliendo de la aplicación...");
                     }
                     
                     default -> System.out.println("Opción no válida. Intenta de nuevo.");
                 }
             }}
    }
}
    

