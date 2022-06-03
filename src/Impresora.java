import java.util.ArrayList;

public class Impresora {
    boolean Estado = false;
    ArrayList<String> Cola= new ArrayList<>();
    final int TOP =0;

    public void enqueque( String element){
        Cola.add(element);
    }

    public String borrar(){
        return Cola.remove(0);
    }
}
