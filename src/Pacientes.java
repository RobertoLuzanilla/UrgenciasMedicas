public class Pacientes {
    private String Nombre, Enfermedad;
    private int NumPacientes;
    public Pacientes(String nombre, String enfermedad, int numpacientes) {
        this.Enfermedad=enfermedad;
        this.Nombre=nombre;
        this.NumPacientes=numpacientes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        Enfermedad = enfermedad;
    }

    public int getNumPacientes() {
        return NumPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        NumPacientes = numPacientes;
    }
}
