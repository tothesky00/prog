import java.util.Scanner;
public class camal extends gorrr{
    private String nameTab;
    private int numLegs;
    private Boolean folding ;

    public camal(){
        super();
        nameTab = "";
        numLegs = 4;
        folding = false;
    }

    public camal(String name, int w, int l, int h, String nameT, int n, Boolean f){
        super(name,w,l,h);
        nameTab = name;
        numLegs = n;
        folding = f;
    }

    public void setNameTab(String name){
        nameTab = name;
    }
    public String getNameTab(){
        return nameTab;
    }

    public void setNumLegs(int n){
        numLegs = n;
    }
    public int getNumLegs(){
        return numLegs;
    }

    public void setFolding(Boolean b){
        folding = b;
    }
    public Boolean isFolding(){
        return folding;
    }

    public void setAllInfo(){

        Scanner in = new Scanner(System.in);
        System.out.print("введите ширину самолета: ");
        int w=in.nextInt(); //Ввод ширины стола
        setWidth(w);
        System.out.print("введите длину самолета: ");
        int l = in.nextInt(); //Ввод длины стола
        setLength(l);
        System.out.print("введите высоту самолета: ");
        int h = in.nextInt(); //Ввод высоты стола
        setHeight(h);
        System.out.print("введите наименование самолета:");
        nameTab = in.next();
        System.out.print("введите грузовой самолета или нет (true/false): ");
        folding = in.nextBoolean();

        System.out.println();//пустая строка
    }

    public String toString(){
        return "\n\tСамолет"+"\n\t"+"Ширина: "
                +getWidth()+ "\n\t"+"Длина: "+getLength()+"\n\t"+"Высота: "+getHeight()+"\n\t"+"Наименование: "+nameTab+"\n\t"+"Встроенный: "
                +folding+"\n";
    }
}
