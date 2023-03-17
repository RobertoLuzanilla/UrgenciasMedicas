import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0,Id, pos, num;
        String Nombre, Enfermedad;
        Oper_Medicos OM=new Oper_Medicos();
        Oper_Pacientes OP=new Oper_Pacientes();
        Oper_Consultorios OC=new Oper_Consultorios();
        Oper_Historial OH=new Oper_Historial();
        OC.alta();
        do {
            System.out.println("1.-Alta de medicos" +
                    "\n2.Llegada de pacientes" +
                    "\n3.Atender un paciente" +
                    "\n4.Fin de consulta" +
                    "\n5.Pacientes en la cola" +
                    "\n6.Pacientes que estan siendo atendidos" +
                    "\n7.Historial de consultas" +
                    "\n8.Incentivos de los medicos" +
                    "\n9.Salir");
                    opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Alta de medicos");
                    System.out.println("Introduzca el id del medico");
                    Id=sc.nextInt();
                    pos= OM.pos(Id);
                    if (pos==-1) {
                        System.out.println("Introduzca el nombre del medico");
                        Nombre = sc.next();
                        OM.altaMedicos(Id,Nombre);
                    }   else{
                        System.out.println("Ese Id ya esta en uso");
                    }
                    break;
                case 2:
                    System.out.println("Alta de pacientes");
                    System.out.println("Introduza el nombre del paciente");
                    Nombre=sc.next();
                    System.out.println("Introduzca la enfermedad del paciente");
                    Enfermedad= sc.next();
                    OP.AltaPacientes(Nombre, Enfermedad);
                    break;
                case 3:
                    System.out.println("Atender un paciente");
                    if(OP.ContadorP==0){
                        System.out.println("No hay pacientes en la cola");
                    }else {
                        if (OM.ContadorM==0){
                            System.out.println("No hay medicos disponibles");
                        } else {

                            OC.BuscConsu();
                            OM.BuscDesc();
                            int Num = OP.arr[0].getNumPacientes(), NumDoc =OM.arr[0].getId();
                            String Nom = OP.arr[0].getNombre(), Enf = OP.arr[0].getEnfermedad();

                            OC.arr[OC.posint].setNumero(Num);
                            OC.arr[OC.posint].setNombre(Nom);
                            OC.arr[OC.posint].setEnfermedad(Enf);
                            OC.arr[OC.posint].setNumDoctor(NumDoc);
                            OM.arr[OM.pospos].setEstado(true);
                            OC.arr[OC.posint].setLibre(true);
                            OP.AtenderPa();

                        }
                    }
                    break;

                case 4:
                    System.out.println("Fin de consulta");
                    System.out.println("Pacientes que estan en consulta");
                    OC.mostrar();
                    System.out.println("Introduzca el paciente para terminar de atender");
                    num =sc.nextInt();
                    OC.PacienteOcup(num);

                    break;

                case 5:
                    System.out.println("Pacientes en la cola");
                    if (OP.ContadorP==0){
                        System.out.println("No hay pacientes en la cola");
                    }else{
                        OP.MostrarP();
                    }
                    break;
                case 6:
                    System.out.println("Pacientes que estan siendo atendidos");
                    OC.mostrar();
                    break;
                case 7:
                    System.out.println("Historial de consultas");
                    int NumP = OC.arr[OC.pospos].getNumero(),NumC=OC.arr[OC.pospos].getNumsConsul();
                    String NomP = OC.arr[OC.pospos].getNombre(),NomM = OM.arr[OM.pospos].getNombre(),NomE=OC.arr[OC.pospos].getEnfermedad();

                    OH.arr[OC.pospos].setNumPaciente(NumP);
                    OH.arr[OC.pospos].setNumConsultorio(NumC);
                    OH.arr[OC.pospos].setNombrePaciente(NomP);
                    OH.arr[OC.pospos].setNombreMedico(NomM);
                    OH.arr[OC.pospos].setNombreEnfermedad(NomE);
                    break;
                case 8:
                    System.out.println("Incentivos de los medicos ");
            }
        }while (opcion!=9);
    }
}