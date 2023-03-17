public class Oper_Consultorios {
    Oper_Medicos Om = new Oper_Medicos();

    Consultorio arr[] = new Consultorio[3];
    int ContadorC=0;
    int NumCons=1;
    public  void alta(){
        for (int i = 0; i < arr.length; i++) {
            arr[ContadorC++]=new Consultorio(NumCons++,0, "","",false,0, false);
        }
    }
    int posint;
     int BuscConsu(){
        int pos =-1;
        int i=0;
        do {
            if (!arr[i].isLibre()) {
                pos = i;
                posint=pos;
                System.out.println("El consultorio que esta libre es el numero " + pos);
            }
            i++;
        }while (pos==-1);
        return pos;
    }

    public void mostrar(){
        for (int i = 0; i <ContadorC; i++) {
            System.out.println(arr[i].toString());


        }
    }
    int pospos;
    public void PacienteOcup(int num){
        for (int i = 0; i <ContadorC; i++) {
           if (arr[i].isLibre() && arr[i].getNumero()==num){
               System.out.println("El paciente ha sido seleccionado");
                arr[i].setLibre(false);
               if (Om.arr[i] != null) {
                   Om.arr[i].setEstado(false);
               }

                pospos = i;

           }else {
               System.out.println("El paciente no esta en consulta");
           }
        }
    }

}
