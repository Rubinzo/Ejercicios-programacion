
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor COMPLETAR
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public Int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(Int velocidad){
        this.velocidad = velocidad;
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
    public CuentaBancaria(String titular, int saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public Int getSaldo(){
        return saldo;
    }
    public void setSaldo(Int saldo){
        this.saldo = saldo;
    }

    // método ingresar COMPLETAR
   public void ingresar(saldo_ingresar){
    
    if(saldo_ingresar > 0){
        System.out.ln(setSaldo(getSaldo()+saldo_ingresar));
    }
   }

    // método retirar COMPLETAR
   public void retirar(){
    System.out.println("Tienes " + getSaldo + " ¿Cuanto dinero quieres retirar? ");
    int saldo_retirar = sc.nextInt();
    nextLine();
    if(saldo_retirar > getSaldo()){
        setSaldo(getSaldo()-saldo_retirar);
    }else{
        System.out.println("No puedes retirar más dinero del que tienes");
    }
   }

    // método mostrarSaldo COMPLETAR
    public void mostrarSaldo(){
        System.out.println("Tu saldo es de: " + getSaldo);
    }
    
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


class Libro {
    // atributos COMPLETAR

    private String titulo;
    private String autor;
    private boolean disponible = True;
    
    // constructor COMPLETAR
   public Libro(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.disponible = disponible;
   }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    // método mostrarInfo COMPLETAR
    public void mostrarInfoLibro(){
        System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nDisponible: "+disponible);
    }
}



class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Libro> libros_prestados;

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    public void añadirLibro(Libro libro){
        libros.add(libro);

    }

    // prestarLibro COMPLETAR
    public void prestarLibro(String titulo_prestar){
        for(Libro libro: libros){
            if(libro.getTitulo() == titulo_prestar){
                libro.setDisponible(False)
                libros_prestados.add(libro);
                libro.mostrarInfoLibro();
            }
        }
    

    }

    // devolverLibro COMPLETAR
    public void devolverLibro(){
        System.out.println("Escribe el titulo del libro que quieres devolver: ");
        String titulo_prestar = sc.nextLine();
        for(Libro libro: libros_prestados){
            if(libro.getTitulo == titulo_prestar){
                setDisponible(True)
                libros.add(libro);
                libro.mostrarInfoLibro();
            }
        }
        

    }


}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

private String nombre;
private Int precio;
    // atributos COMPLETAR
   
public Int getPrecio(){
        return precio;
    }
    // constructor COMPLETAR
    public Producto(String nombre, Int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    private ArrayList<Producto> productos = new ArrayList<Producto>;

    // añadirProducto COMPLETAR
   public void añadirProducto(Producto producto){
    productos.add(producto)
   } 

    // calcularTotal COMPLETAR
    public void calcularTotal(){
        Int dinero_total = 0;
        for(int producto : productos){
            dinero_total = dinero_total + producto.getPrecio;
        }
        
    System.out.println("Esta es el precio total: "+dinero_total);
    
    
   } 

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
        CuentaBancaria cuentaBancaria = new CuentaBancaria(Marcos, 20);
        cuentaBancaria.ingresar();
        cuentaBancaria.retirar();
        cuentaBancaria.mostrarSaldo();


        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
        biblioteca.añadirLibro();
        biblioteca.añadirLibro();
        biblioteca.prestarLibro();
        biblioteca.devolverLibro();
        


        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.
        Producto producto = new Producto(Leche, 20);
        Producto producto = new Producto(Huevos, 8);
        Producto producto = new Producto(Pan, 2);
        carrito.añadirProducto();
        carrito.calcularTotal();

    }
}

