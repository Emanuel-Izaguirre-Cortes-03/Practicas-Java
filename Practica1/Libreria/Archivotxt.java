package Libreria;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Parte2.Categoria;

public class Archivotxt {
    private String nombreArchivo;
    private ArrayList<Categoria> listaCategorias;

    public Archivotxt(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.listaCategorias = new ArrayList<>();  
    }

    public void guardar(String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(texto);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public ArrayList<String> cargar() {
        ArrayList<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] elementos = linea.split(",");
                for (String elemento : elementos) {
                    lineas.add(elemento.trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
        return lineas;
    }

    public void cargarCategorias(ArrayList<String[]> categoriasString) {
        for (String[] categoriaString : categoriasString) {
            String idCategoria = categoriaString[0];
            String nombreCategoria = categoriaString[1];
            Categoria categoria = new Categoria(idCategoria, nombreCategoria);
            agregarCategoria(categoria);  
        }
    }

    private void agregarCategoria(Categoria categoria) {
        listaCategorias.add(categoria); 
    }
}
