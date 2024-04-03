public class Libro {
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private double precio;

    public Libro(String titulo, String autor, int anioDePublicacion, double precio) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnioDePublicacion(anioDePublicacion);
        this.setPrecio(precio);
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }
    public int getAnioDePublicacion() {
        return this.anioDePublicacion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return this.precio;
    }

    public void showInformacion(){
        System.out.println("--------------------------");
        System.out.println("informacion de este libro");
        System.out.println("titulo : " + this.getTitulo());
        System.out.println("autor : " + this.getAutor());
        System.out.println("año de publicacion : " + this.getAnioDePublicacion());
        System.out.println("precio : " + this.getPrecio());
        System.out.println("--------------------------");
    }
}
