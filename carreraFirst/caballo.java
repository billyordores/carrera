
public class caballo {
    String avatar;
    int posicion;
    public caballo(String avatar, int posicion){
        this.avatar=avatar;
        this.posicion=posicion;
    }

    public  String getAvatar(){
        return avatar;
    }
    public int getPosicion(){
        return posicion;
    }
    public boolean avanzar(){
        if((int)(Math.random() * 100) > 50){
            posicion=posicion+1;
            return true;
        }
        return false;
    }
}
