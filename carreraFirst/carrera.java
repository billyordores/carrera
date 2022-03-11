import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class carrera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean caballo1B;
        boolean caballo2B;

        caballo caballo1 = new caballo("[1]", -1);
        caballo caballo2 = new caballo("[2]", -1);
        
        pista pista = new pista(Arrays.asList(new String[]  {"[0]", "[0]" , "[0]", "[0]" ,"[0]", "[0]" ,"[0]", "[0]" ,"[0]", "[0]"}), Arrays.asList(new String[]  {"[0]", "[0]" , "[0]", "[0]" ,"[0]", "[0]" ,"[0]", "[0]" ,"[0]", "[0]"}));
        while(caballo1.getPosicion() < pista.getPista1().size() -1 && caballo2.getPosicion() < pista.getPista2().size() -1 ){
            pista.pintarPista();

            caballo1B= caballo1.avanzar();
            caballo2B= caballo2.avanzar();
            if(caballo1B){
                pista.getPista1().set(caballo1.getPosicion(), caballo1.getAvatar());
            }
            if(caballo2B){
                pista.getPista2().set(caballo2.getPosicion(), caballo2.getAvatar());
            }
            

            System.out.println("posicion 1: " + caballo1.getPosicion() + " - " +  caballo1B );
            System.out.println("posicion 2: " + caballo2.getPosicion() + " - " +  caballo2B);
            entrada= sc.nextLine();
        }
        pista.pintarPista();
        
        if(caballo1.getPosicion()==9){
            System.out.println("El acaballo 1 ganó");
        }else if(caballo2.getPosicion()==9){
            System.out.println("El acaballo 2 ganó");
        }else{
            System.out.println("Empate");
        }
        
    }

}