
public class caballo {
    
    int idCaballo;
    String avatar;
    int posicion;
    public caballo(String avatar, int posicion, int idCaballo){
        this.avatar=avatar;
        this.posicion=posicion;
        this.idCaballo=idCaballo;
    }

    public  String getAvatar(){
        return avatar;
    }
    public int getPosicion(){
        return posicion;
    }
    public int getIdCaballo(){
        return idCaballo;
    }
    public void setPosicion( int posicion){
        this.posicion= posicion;
    }
    public boolean avanzar(){
        if((int)(Math.random() * 100) > 50){
            posicion=posicion+1;
            return true;
        }
        return false;
    }
}
