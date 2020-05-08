public class gorrr {
    private String firma;
    private int width;
    private int length;
    private int height;
    public void setFirma(String name){ //открытая функция (метод класса) для задания
        firma = name;
    }
    public void setWidth(int w){ //открытая функция (метод класса) для задания
        width = w;
    }
    public void setLength(int l){ //открытая функция (метод класса) для задания
        width = l;
    }
    public void setHeight(int h){ //открытая функция (метод класса) для задания
        width = h;
    }
    public String getFirma(){ //открытая функция (метод класса) для вывода значения
        return firma;
    }
    public int getWidth(){ //открытая функция (метод класса) для вывода значения
        return width;
    }
    public int getLength(){ //открытая функция (метод класса) для вывода значения
        return length;
    }
    public int getHeight(){ //открытая функция (метод класса) для вывода значения
        return height;
    }
    public gorrr(){
        firma = "Без названия";
        width = 0;
        length = 0;
        height = 0;

    }
    public gorrr(String name, int w, int l, int h ){
        firma = name;
        width = w;
        length = l;
        height = h;
    }
}
