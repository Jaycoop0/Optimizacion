
package service;

import com.mycompany.libreria.model.Libro;
import java.util.*;
import java.util.stream.Collectors;

public class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void modificarLibro(int id, String nuevoTitulo, String nuevoAutor, double nuevoPrecio) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                // Se puede agregar manejo de excepciones aquí
                libro = new Libro(id, nuevoTitulo, nuevoAutor, nuevoPrecio);
            }
        }
    }

    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }

    public String listarLibros() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro.getTitulo()).append("\n");
        }
        return sb.toString();
    }

    public List<Libro> filtrarLibrosPorPrecio(double precio) {
        return libros.stream()
                .filter(libro -> libro.getPrecio() > precio)
                .collect(Collectors.toList());
    }

    public List<String> obtenerTitulos() {
        return libros.stream()
                .map(Libro::getTitulo)
                .collect(Collectors.toList());
    }

    public void agruparPorAutor() {
        Map<String, List<Libro>> librosPorAutor = libros.stream()
                .collect(Collectors.groupingBy(Libro::getAutor));
        librosPorAutor.forEach((autor, lista) -> {
            System.out.println("Autor: " + autor);
            lista.forEach(Libro::mostrarInformacion);
        });
    }

    public double sumaPrecios() {
        return libros.stream()
                .mapToDouble(Libro::getPrecio)
                .sum();
    }
}

