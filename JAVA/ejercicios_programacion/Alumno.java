package ejercicios_programacion;

import java.util.ArrayList;
import java.util.Scanner;
class Alumno {
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList<>();

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = notas;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    // Método añadirNota COMPLETAR
    public void añadirNota(int nota){

        notas.add(nota);
    }

    // Método calcularMedia COMPLETAR
    public int calcularMedia(){
        int nota_media = 0;
        int contador = 0;
        for(int nota : notas){
            nota_media = nota_media + nota;
            contador++;
        }
        nota_media = nota_media / contador;
        System.out.println("Nota media calculada");
        return nota_media;
    }

    // Método mostrarInfo COMPLETAR
    public void mostrarInfo(int nota_media){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nota media: " + nota_media);

    }

}
