package ejercicios_programacion;
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


    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }



    // Método acelerar (suma +10) COMPLETAR
    public void acelerar(){
        setVelocidad(getVelocidad() + 10);
        System.out.println("Tu velocidad es de " + getVelocidad());
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
    public void frenar(){
        if(getVelocidad() >= 10){
            setVelocidad(getVelocidad() - 10);
            System.out.println("Tu velocidad es de " + getVelocidad());
        }else{
            System.out.println("No puedes frenar si vas a menos de 10km/h");
        }

    }

    // Método mostrarDatos COMPLETAR
    public void mostrarDatos(){
        System.out.println("Tu marca es: "+getMarca()+"\nTu modelo es: " + getModelo() + "\nTu velocidad es de " + getVelocidad());
    }

}
