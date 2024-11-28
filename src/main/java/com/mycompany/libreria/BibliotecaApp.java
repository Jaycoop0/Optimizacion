
package com.mycompany.libreria;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class BibliotecaApp {
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Biblioteca");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Crear el panel de entrada de datos
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("ID:"));
        JTextField idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Título:"));
        JTextField tituloField = new JTextField();
        inputPanel.add(tituloField);

        inputPanel.add(new JLabel("Autor:"));
        JTextField autorField = new JTextField();
        inputPanel.add(autorField);

        inputPanel.add(new JLabel("Precio:"));
        JTextField precioField = new JTextField();
        inputPanel.add(precioField);

        // Crear el área de texto para listar libros
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Botón para agregar libros
        JButton agregarButton = new JButton("Agregar Libro");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un libro
                // Aquí deberías incluir la lógica para interactuar con tu clase Biblioteca
                // Ejemplo:
                // int id = Integer.parseInt(idField.getText());
                // String titulo = tituloField.getText();
                // String autor = autorField.getText();
                // double precio = Double.parseDouble(precioField.getText());
                // biblioteca.agregarLibro(new Libro(id, titulo, autor, precio));
                // textArea.append("Libro agregado: " + titulo + "\n");
            }
        });
        inputPanel.add(agregarButton);

        // Botón para listar libros
        JButton listarButton = new JButton("Listar Libros");
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar libros
                // Aquí deberías incluir la lógica para interactuar con tu clase Biblioteca
                // Ejemplo:
                // List<Libro> libros = biblioteca.listarLibros();
                // textArea.setText(""); // Limpiar el área de texto
                // for (Libro libro : libros) {
                //     textArea.append(libro.toString() + "\n");
                // }
            }
        });
        inputPanel.add(listarButton);

        // Agregar el panel de entrada y el área de texto al JFrame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}

