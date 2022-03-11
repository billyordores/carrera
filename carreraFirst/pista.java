import java.util.List;
public class pista {

    List<String> pista1Caballo;
    List<String> pista2Caballo;

    public pista(List<String> pista1Caballo, List<String> pista2Caballo){
        this.pista1Caballo=pista1Caballo;
        this.pista2Caballo=pista2Caballo;
    }
    public void pintarPista(){
        System.out.println("---------------------------------------");
        pista1Caballo.forEach((x) -> System.out.print(x));
        System.out.println();
        pista2Caballo.forEach((x) -> System.out.print(x));
        System.out.println();
    }
    public List<String> getPista1(){
        return pista1Caballo;
    }
    public List<String> getPista2(){
        return pista2Caballo;
    }
}
