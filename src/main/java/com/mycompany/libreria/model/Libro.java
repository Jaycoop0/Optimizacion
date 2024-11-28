
package com.mycompany.libreria.model;



public class Libro extends Publicacion implements Descuento {
    private int id;
    private String titulo;
    private String autor;
    private double precio;

    public Libro(int id, String titulo, String autor, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Precio: " + precio);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }
}

