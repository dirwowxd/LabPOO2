import java.util.Scanner;

public class DemoPabellonCirugia {
    private PabellonCirugia[] mish= new PabellonCirugia[6];
    public static void main(String[] args) {
        DemoPabellonCirugia mish2= new DemoPabellonCirugia();
        mish2.procesa();
    }
    public void procesa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese datos:");
        for(int i=0;i<mish.length;i++){
            System.out.println("Pabellon numero: ");
            int numero=sc.nextInt();
            System.out.println("Especialidad: ");
            String especialidad=sc.next();
            mish[i]=new PabellonCirugia(numero,especialidad);
        }
        for(int i=0;i<mish.length;i++){
            if(i%2==0){
                mish[i].setEstado(Estado.OCUPADO);
            }
        }
        System.out.println("Listado de pabellon cirugias:");
        for(int i=0;i<mish.length;i++){
            System.out.println(mish[i].toString());
        }

        System.out.println("Comparacion...");
        System.out.println("Pabellon 1 es igual al 2?; "+mish[0].equals(mish[1]));
        System.out.println("Pabellon 1 es igual al 3?: "+mish[0].equals(mish[2]));
        System.out.println("Pabellon 1 es igual al 4?: "+mish[0].equals(mish[3]));
        System.out.println("Pabellon 1 es igual al 5?: "+mish[0].equals(mish[4]));
        System.out.println("Pabellon 1 es igual al 6?: "+mish[0].equals(mish[5]));
    }
}
