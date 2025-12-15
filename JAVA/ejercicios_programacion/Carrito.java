package ejercicios_programacion;

import java.util.ArrayList;

public class Carrito {

    // lista de productos COMPLETAR
    private ArrayList<Producto> productos = new ArrayList<>();

    // añadirProducto COMPLETAR
    public void añadirProducto(Producto producto){
        productos.add(producto);
    }

    // calcularTotal COMPLETAR
    public void calcularTotal(){
        int dinero_total = 0;
        for(Producto producto : productos){
            dinero_total = dinero_total + producto.getPrecio();
        }

        System.out.println("Esta es el precio total: "+ dinero_total);


    }
}
