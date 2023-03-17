public class Medicos {
    private int Id;
    private String Nombre;
    private boolean Estado;
    public Medicos(int id, String nombre, boolean estado) {
        this.Id=id;
        this.Nombre=nombre;
        this.Estado=estado;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }


}
