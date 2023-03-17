public class Oper_Historial {

    Historial arr[]=new Historial[10];

    int ContadorH=0;

    public void alta(){
        arr[ContadorH++]=new Historial(0,"","","",0);
    }

    public void MostrarHistorial(){
        for (int i = 0; i <ContadorH; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
