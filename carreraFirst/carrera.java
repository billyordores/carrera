import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carrera {
    public static void main(String[] args) {
       carrera.run(7, 10);         
    }

    public static void run(int numeroCaballos, int numPistas){
        if(numeroCaballos>numPistas){
            System.out.println("No se puede correr debido a que hay mas caballos que pistas");
        }else{
            Scanner sc = new Scanner(System.in);   
            pista pista = new pista(numPistas);
            corralCaballos corral = new corralCaballos();
            corral.crearCaballos(numeroCaballos);
            pista.crearPistas();
            while(carrera.carreraContinua(corral.getListCaballo())){
                pista.pintarPista();
                avanzarPista(corral.getListCaballo(), pista);
                String  entrada= sc.nextLine();
            }
            pista.pintarPista();
            carrera.getGanador(corral.getListCaballo());
        }
    }
    
    public static void inicioCarrera(List<caballo> caballos, pista pistaC){
        caballos.forEach((element)->{
            pistaC.setMap(element.getAvatar(), element.getPosicion(), element.getIdCaballo());
            element.setPosicion(element.getPosicion()+1);
        });
    }
    public static void avanzarPista(List<caballo> caballos, pista pistaC){
        caballos.forEach((element)->{
            if(element.avanzar()){
                pistaC.setMap(element.getAvatar(), element.getPosicion(), element.getIdCaballo());
            }
        });
    }
    public static boolean carreraContinua(ArrayList<caballo> listaCaballos){
        
        for(caballo cab : listaCaballos){
            if(cab.getPosicion()==9){
                return false;
            }
        }
        return true;
    }
    public static void getGanador(ArrayList<caballo> listaCaballos){
        for(caballo cab : listaCaballos){
            if(cab.getPosicion()==9){
                System.out.println("El caballo " + (cab.getIdCaballo()+1) + " es el ganador");
                
            }
        }
    }

}