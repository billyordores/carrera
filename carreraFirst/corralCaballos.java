import java.util.ArrayList;
import java.util.stream.IntStream;

public class corralCaballos {
    ArrayList<caballo> caballos = new ArrayList<caballo>() {};
    
    public  ArrayList<caballo> crearCaballos(int numeroCaballos){       
        IntStream.range(0, numeroCaballos).forEach((element) -> {
            caballos.add(element, new caballo("["+(1+element)+"]", -1, element));
        });
        return caballos;
    }
    public ArrayList<caballo> getListCaballo(){
        return caballos;
    }
}
