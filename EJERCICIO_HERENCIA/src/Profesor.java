public class Profesor {
    // atributos
    private int id;
    private String nombre;

    // constructor
    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    // getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String saludo(){
        return "hola" + nombre;
    }

    // agregar toString
    @Override
    public String toString() {
        return "Andres Torres Diaz el mejor :)";
    }
}
