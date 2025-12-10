
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor COMPLETAR
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void getMarca(){
        return marca;
    }
    public String setMarca(){
        this.marca = marca;
    }

    public void getModelo(){
        return modelo;
    }
    public String setModelo(){
        this.marca = marca;
    }


    public void getVelocidad(){
        return velocidad;
    }
    public String setVelocidad(){
        this.marca = velocidad;
    }

    
    
    // Método acelerar (suma +10) COMPLETAR
   public void acelerar(){
    setVelocidad(getVelocidad + 10);
    System.out.println("Tu velocidad es de " + getVelocidad);
   }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
   public void frenar(){
    if(getVelocidad >= 10){
        setVelocidad(getVelocidad - 10);
        System.out.println("Tu velocidad es de " + getVelocidad);
    }else{
        System.out.println("No puedes frenar si vas a menos de 10km/h")
    }
    
   }

    // Método mostrarDatos COMPLETAR
    public void mostrarDatos(){
        System.out.println("Tu marca es: "+getMarca"\nTu modelo es: " + getModelo + "\nTu velocidad es de " + getVelocidad)
    }

}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//


import java.util.ArrayList;
import java.util.Scanner
class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR
    public Alumno(String nombre){
        this.nombre = nombre;
        this.ArrayList<Integer> = new ArrayList<Integer>;
    }
   
    public void getNombre(){
        return nombre;
    }
    public String setNombre(){
        this.marca = nombre;
    }
    // Método añadirNota COMPLETAR
   public void añadirNota(){
    System.out.println("Escribe la nota que quieres añadir: ");
    int nota = sc.nextInt();
    sc.nextLine();
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
    public void mostrarInfo(nota_media){
        System.out.println("Nombre: " + getNombre);
        System.out.println("Nota media: " + nota_media);

    }

}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {
    // atributos COMPLETAR
    private String titular;
    private Int saldo;


    // constructor COMPLETAR
    public CuentaBancaria(){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void getTitular(){
        return titular;
    }
    public String setTitular(){
        this.titular = titular;
    }

    public void getSaldo(){
        return saldo;
    }
    public String setSaldo(){
        this.saldo = saldo;
    }

    // método ingresar COMPLETAR
   public void ingresar(){
    System.out.println("Introduce la cantidad que quieres añadir: ");
    int saldo_ingresar = sc.nextInt();
    if(saldo_ingresar > 0){
        System.out.ln(setSaldo(getSaldo()+saldo_ingresar));
    }else{
        System.out.println("Tienes que introducir valores positivos y enteros mayores que 0");
    }
    sc.nextLine();
   }

    // método retirar COMPLETAR
   public void retirar(){
    System.out.println("Tienes " + getSaldo + " ¿Cuanto dinero quieres retirar? ");
   }

    // método mostrarSaldo COMPLETAR
    
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


class Libro {

    // atributos COMPLETAR
    
    
    // constructor COMPLETAR
   

    // método mostrarInfo COMPLETAR
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
       // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.
        Coche coche = new Coche(Peugeot, 207);
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();
        coche.frenar();
        coche.mostrarDatos;


        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.
        Alumno alumno = new Alumno(Marcos);
        alumno.añadirNota();
        alumno.añadirNota();
        alumno.añadirNota();
        alumno.mostrarInfo();
        alumno.calcularMedia();
        alumno.mostrarInfo();


        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}

