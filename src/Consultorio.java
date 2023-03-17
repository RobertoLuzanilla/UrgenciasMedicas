public class Consultorio {

    private int Numero;
    private String Nombre, Enfermedad;
    private boolean Libre;
    private int NumsConsul;

    public int getNumsConsul() {
        return NumsConsul;
    }

    public void setNumsConsul(int numsConsul) {
        NumsConsul = numsConsul;
    }

    private int NumDoctor;

    public Consultorio(int numconsul,int numero, String nombre, String enfermedad, boolean libre, int numDoctor, boolean estadoDoctor) {
        this.Numero=numero;
        this.Nombre=nombre;
        this.Enfermedad=enfermedad;
        this.Libre=libre;
        this.NumsConsul=numconsul;
        this.NumDoctor=numDoctor;


    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "Numero=" + Numero +
                ", Nombre='" + Nombre + '\'' +
                ", Enfermedad='" + Enfermedad + '\'' +
                ", Libre=" + Libre +
                ", NumsConsul=" + NumsConsul +
                ", NumDoctor=" + NumDoctor +
                '}';
    }

    public int getNumDoctor() {
        return NumDoctor;
    }

    public void setNumDoctor(int numDoctor) {
        NumDoctor = numDoctor;
    }



    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
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

    public boolean isLibre() {
        return Libre;
    }

    public void setLibre(boolean libre) {
        Libre = libre;
    }
}
