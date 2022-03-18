import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class pista {

    private int cantidadPista;
    List<ArrayList<String>> map = new ArrayList<ArrayList<String>>(){};
    ArrayList<String> resultado = new ArrayList<String>();

    public pista( int cantidadPista){
        this.cantidadPista = cantidadPista;
    }

    public void crearPistas(){
        IntStream.range(0, cantidadPista).forEach((element)->{
            this.map.add(element, new ArrayList<String>(Arrays.asList("[0]", "[0]", "[0]", "[0]", "[0]","[0]","[0]","[0]", "[0]","[0]")));
         });
    }
    public void pintarPista(){
        System.out.println("---------------------------------------");
        map.forEach((element) -> {element.forEach((ele)->{System.out.print(ele);});
        System.out.println();    
        });
        
    }
    public List<String> getPistaId(int idLista){
        IntStream.range(0, map.size()).forEach((element)->{
            if(element==idLista){
                resultado = map.get(element);
            }else{
                System.out.println("Error encontrando la lista por id");
            }
        });
        return resultado;
    }
    public void setMap(String avatar, int position, int id){  
        IntStream.range(0, map.size()).forEach((element)->{
            if(element == id){
                map.get(element).set(position, avatar);
            }
        });
    }
 }
