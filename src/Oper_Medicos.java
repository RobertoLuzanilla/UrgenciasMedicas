public class Oper_Medicos {
    Medicos arr[]=new Medicos[3];

    int ContadorM=0;
    public void altaMedicos(int id, String Nombre){
        arr[ContadorM++]= new Medicos(id, Nombre, false);
    }

    int pos(int n){
        int p=-1;
        for (int i = 0; i <ContadorM; i++) {
            if (arr[i].getId()==n){
                p=i;
            }
        }
        return p;
    }
    int pospos;
    public void BuscDesc(){
        for (int i = 0; i <ContadorM; i++) {
            if (!arr[i].isEstado()){
                System.out.println("Hay un doctor Disponible");
                pospos=i;
            }else {
                System.out.println("No hay doctores disponibles");
            }
        }
    }
}
