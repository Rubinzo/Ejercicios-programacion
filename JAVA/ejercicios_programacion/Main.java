package ejercicios_programacion;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {

        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu){
            case 1:
                Coche coche = new Coche("Peugeot","204",110);
                coche.acelerar();
                coche.acelerar();
                coche.acelerar();
                coche.frenar();
                coche.mostrarDatos();
                break;
            case 2:
                Alumno alumno = new Alumno("Marcos");
                alumno.añadirNota(2);
                alumno.añadirNota(7);
                alumno.añadirNota(4);
                int nota_media = alumno.calcularMedia();
                alumno.mostrarInfo(nota_media);
                break;
            case 3:
                CuentaBancaria cuentaBancaria = new CuentaBancaria("Marcos", 20);
                cuentaBancaria.ingresar(100);
                cuentaBancaria.retirar(10);
                cuentaBancaria.mostrarSaldo();
                break;
            case 4:
                Libro libro = new Libro("El señor de los anillos","Tolkien");
                Libro libro2 = new Libro("Harry Potter","JK");
                Biblioteca biblioteca = new Biblioteca();
                biblioteca.añadirLibro(libro);
                biblioteca.añadirLibro(libro2);
                biblioteca.mostrarInfoLibro();
                biblioteca.prestarLibro("Harry Potter");
                biblioteca.devolverLibro();
                biblioteca.mostrarInfoLibro();
                break;
            case 5:
                Producto producto1 = new Producto("Leche",4);
                Producto producto2 = new Producto("Pan",1);
                Producto producto3 = new Producto("Pizza",5);
                Carrito carrito = new Carrito();
                carrito.añadirProducto(producto1);
                carrito.añadirProducto(producto2);
                carrito.añadirProducto(producto3);
                carrito.calcularTotal();
                break;
            default:
                break;
        }



    }

}
