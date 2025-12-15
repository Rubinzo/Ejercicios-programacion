package ejercicios_programacion;

import java.util.ArrayList;
import java.util.Scanner;

class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Libro> libros_prestados = new ArrayList<>();
    private Libro libro;
    // lista de libros COMPLETAR

    Scanner sc = new Scanner(System.in);

    public Biblioteca() {
        this.libros = libros;
        this.libros_prestados = libros_prestados;
        this.libro = libro;
    }

    // añadirLibro COMPLETAR
    public void añadirLibro(Libro libro) {
        libros.add(libro);

    }

    // prestarLibro COMPLETAR
    public void prestarLibro(String titulo_prestar) {
        System.out.println("Libro prestado: ");
        System.out.println(titulo_prestar);
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo_prestar)) {
                libro.setDisponible(false);
                libros_prestados.add(libro);

            }
        }


    }


    public void devolverLibro(){
        System.out.println("Escribe el titulo del libro que quieres devolver: ");
        String titulo_prestar = sc.nextLine();
        for(Libro libro: libros_prestados){
            if(libro.getTitulo().equals(titulo_prestar)){
                libro.setDisponible(true);
            }
        }
        libros_prestados.clear();

    }

    public void mostrarInfoLibro(){


        if(!libros_prestados.isEmpty()){
            System.out.println("Libros prestados: ");
            for(Libro libro: libros_prestados){
                System.out.println(libro.getTitulo());
            }
        }else {
            System.out.println("Libros prestados: 0");
        }

        System.out.println("Libros disponibles: ");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }

    }

}