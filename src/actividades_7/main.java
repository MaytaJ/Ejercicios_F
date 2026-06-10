package actividades_7;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Libro> biblioteca = new ArrayList<>();

        Manga manga1 = new Manga("Dragon Ball", "Akira Toriyama", 5, 0, 1, "Akira Toriyama");
        Manga manga2 = new Manga("One Piece", "Eiichiro Oda", 3, 2, 100, "Eiichiro Oda");
        AudioLibro audio1 = new AudioLibro("Hábitos Atómicos", "James Clear", 10, 0, 320, "Narrador IA");
        AudioLibro audio2 = new AudioLibro("El Alquimista", "Paulo Coelho", 1, 1, 240, "Mariano Chiesa");

        biblioteca.add(manga1);
        biblioteca.add(manga2);
        biblioteca.add(audio1);
        biblioteca.add(audio2);


        System.out.println("Intentando prestar el manga: " + manga1.getTitulo());
        if (manga1.prestamo()) {
            System.out.println("-----------PRESTAMOS APROBADO-----. .Prestados actualmente: " + manga1.getPrestados());
        } else {
            System.out.println("No hay ejemplares");
        }

        System.out.println("Intentando prestar el audiolibro: " + audio2.getTitulo());
        
        if (audio2.prestamo()) {
            System.out.println("Préstamo aprobado");
        } else {
            System.out.println("No quedan ejemplares libres de este audiolibro.");
        }

        System.out.println("Devolviendo un ejemplar de: " + manga2.getTitulo());
        if (manga2.devolucion()) {
            System.out.println("Devolución exitosa Prestados actualmente: " + manga2.getPrestados());
        } else {
            System.out.println("Este libro no tenía ejemplares prestados.");
        }

        System.out.println(" MODIFICANDO ATRIBUTO ESPECÍFICO..............");
        System.out.println("Narrador original de 'Hábitos Atómicos': " + audio1.getNarrador());
        
        audio1.setNarrador("Alejandro Jodorowsky");
        System.out.println("Nuevo narrador asignado con éxito: " + audio1.getNarrador());

        System.out.println(" EsTAdo final de los libros ");
        for (Libro libro : biblioteca) {
            System.out.println(libro.toString());
        }
    }
}