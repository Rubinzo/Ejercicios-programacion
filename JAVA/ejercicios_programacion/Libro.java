package ejercicios_programacion;

class Libro {
    // atributos COMPLETAR

    private String titulo;
    private String autor;
    private boolean disponible;

    // constructor COMPLETAR
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;

    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // método mostrarInfo COMPLETAR
    public void mostrarInfoLibro(){
        System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nDisponible: "+disponible);
    }
}