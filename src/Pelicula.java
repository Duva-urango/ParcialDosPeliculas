public class Pelicula {

     private long id;
     private String nombre;
     private double puntuacion;
     private String genero;
     private String descripcion;

    public Pelicula(long id, String nombre, double puntuacion, String genero, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  "id:  " + this.id +
                " nombre" + this.nombre +
                " puntuacion" + this.puntuacion +
                " genero" + this.genero +
                " descripcion" + this.descripcion;
    }


    }