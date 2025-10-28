public class Practicante {

    private int id;
    private String nombre;
    public Practicante(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
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

    @Override
    public String toString(){
    return "Practicante: " +this.id+
            " - Nombre: " +this.nombre;
        }
}
