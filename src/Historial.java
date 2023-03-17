public class Historial {
  private int NumPaciente;
  private String NombrePaciente;
  private String NombreMedico;
  private String NombreEnfermedad;
    public Historial(int numPaciente, String nombrePaciente, String nombreMedico, String nombreEnfermedad, int numConsultorio) {
        NumPaciente = numPaciente;
        NombrePaciente = nombrePaciente;
        NombreMedico = nombreMedico;
        NombreEnfermedad = nombreEnfermedad;
        NumConsultorio = numConsultorio;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "NumPaciente=" + NumPaciente +
                ", NombrePaciente='" + NombrePaciente + '\'' +
                ", NombreMedico='" + NombreMedico + '\'' +
                ", NombreEnfermedad='" + NombreEnfermedad + '\'' +
                ", NumConsultorio=" + NumConsultorio +
                '}';
    }

    public int getNumPaciente() {
        return NumPaciente;
    }

    public void setNumPaciente(int numPaciente) {
        NumPaciente = numPaciente;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        NombrePaciente = nombrePaciente;
    }

    public String getNombreMedico() {
        return NombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        NombreMedico = nombreMedico;
    }

    public String getNombreEnfermedad() {
        return NombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        NombreEnfermedad = nombreEnfermedad;
    }

    public int getNumConsultorio() {
        return NumConsultorio;
    }

    public void setNumConsultorio(int numConsultorio) {
        NumConsultorio = numConsultorio;
    }

    private int NumConsultorio;


}
