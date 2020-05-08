import java.util.ArrayList;

public class Aviacomp {
    private ArrayList<gorrr> masFur = new ArrayList<gorrr>();
    public void addFur(gorrr m){
        masFur.add(m);
    }
    public void removeFur(gorrr m){
        masFur.remove(m);
    }
    public Aviacomp(){
    }
    public Boolean findFur(gorrr m){ //для выяснения – есть ли мебель m в комнате
        return masFur.contains(m);
    }
    public Aviacomp(ArrayList< gorrr> n){//конструктор для внесения существующего списка мебели в комнату
        masFur=n;
    }
    public void printAviacomp() {
        System.out.println("Авиакомпания: ");
        for (gorrr a:masFur){
            System.out.println("\t"+a.toString());
            if (a instanceof camal) {
                System.out.println("    самолет");
                System.out.println();
            }
            if (a instanceof vert) {
                System.out.println("    вертолет");
                System.out.println();
            }
        }
    }
}