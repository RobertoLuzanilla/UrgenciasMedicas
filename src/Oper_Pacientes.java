public class Oper_Pacientes {
    Pacientes arr[] = new Pacientes[10];

    Oper_Consultorios OC=new Oper_Consultorios();
    int ContadorP=0;
    int NumPaciente=1;

    public void AltaPacientes(String Nombre, String Enfermedad){
    arr[ContadorP++]=new Pacientes(Nombre, Enfermedad,NumPaciente++);
    }

    public void AtenderPa(){
        for (int i = 0; i <ContadorP; i++) {
            arr[i] = arr[i+1];
        }
        ContadorP--;
    }
    public void MostrarP(){
        for (int i = 0; i <ContadorP; i++) {
            System.out.println(arr[i].getNombre());
            System.out.println(arr[i].getEnfermedad());
        }
    }
}
